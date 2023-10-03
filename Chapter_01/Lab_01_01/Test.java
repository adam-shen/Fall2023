package lab1_DS; // Adam Elshanawany Lab 1

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<Runner> runners = new ArrayList<>(); // Initializing and declaring ArrayList for the runner objects


		Scanner scan = null;		//Checking to see if the file we are trying to scan exists or not
		// For some reason it would only work when I did it in this format, and not just runners.dat
		try {
			scan = new Scanner(new File("C:\\Users\\Adam\\eclipse-workspace\\Fall 2023\\src\\runners.dat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		File r = new File("results.dat");		//Creating the output files
		File e = new File("errors.dat");

		PrintWriter pwR = null;			//Declaring printwriter vars to write to those output files
		PrintWriter pwE = null;

		try {
			pwR = new PrintWriter(r);
			pwE = new PrintWriter(e);
		} catch (FileNotFoundException e1) {
			System.out.println("File results.dat or errors.dat was not found :(");
		}

		// Declaring all variables that we will be scanning from the document
		String name = "";
		String country = "";
		int sHour = 0;
		int sMin = 0;
		double sSec = 0.0;
		int fHour = 0;
		int fMin = 0;
		double fSec = 0.0;

		int count = 0;
		int errors = 0;
		boolean error = false;

		while (scan.hasNext()) {
			error = false;					//Setting error to false in the case it was set to true while running the loop

			name = scan.nextLine();count++;		// For this codes purposes there will be no errors in the name or country
			country = scan.nextLine(); count++;

			try {								// To catch any errors in the first line of numbers and deal with it
				count++;
				sHour = scan.nextInt();
				sMin = scan.nextInt();
				sSec = scan.nextDouble();


			} catch (InputMismatchException er) {
				errors++;
				error = true;
				pwE.println("line " + count + ": mismatch error for " + name + ", skipping to next runner\n");  //Printing sentence to error file if an error occurs.
				scan.nextLine();
				scan.nextLine();
				count++;
				continue;								//Continuing to start back at the top of the loop, and we scan two lines to be at the next runner
			}


			try {							// To catch any errors in the second line of numbers and deal with it
				count++;
				fHour = scan.nextInt();
				fMin = scan.nextInt();
				fSec = scan.nextDouble();


			} catch (InputMismatchException er) {
				errors++;
				error = true;
				pwE.println("line " + count + ": mismatch error for " + name + ", skipping to next runner\n");
				scan.nextLine();
				continue;
			}


			scan.nextLine();

			if (!error) {			//Adding a runner object only if there was no error detected
				runners.add(new Runner(name, country, new Time(sHour, sMin, sSec), new Time(fHour, fMin, fSec))); // Creating runner object with variables
			}

		}

		pwE.println("Total number of errors are: " + errors); //Finishing off the error output file and closing the pw so everything saves correctly
		pwE.close();


		Runner goldRunner = runners.get(0); // Set gold runner to first so we can compare that to the rest and adjust as needed
		Runner silverRunner = null;
		Runner bronzeRunner = null;


		for (int i =1; i < runners.size(); i++) {

			Runner currentRunner = runners.get(i);

			if (currentRunner.compareTo(goldRunner) < 0) {
				// Update the fastest runner if the current runner is faster
				bronzeRunner = silverRunner;
				silverRunner = goldRunner;
				goldRunner = currentRunner;
			} else if (silverRunner == null || currentRunner.compareTo(silverRunner) < 0) {
				// Update the second fastest runner if it's null or the current runner is faster
				bronzeRunner = silverRunner;
				silverRunner = currentRunner;
			} else if (bronzeRunner == null || currentRunner.compareTo(bronzeRunner) < 0) {
				// Update the third fastest runner if it's null or the current runner is faster
				bronzeRunner = currentRunner;
			}
		}


		pwR.print("Olympic Runners Results\n\n");

		for (int i = 0; i < runners.size(); i++) { //Looping through all the runners to print them to the results file
			Runner cR = runners.get(i);
			pwR.println(cR.toString() + "\n");
		}

		pwR.println("\nOlympic Runner Medalists\n");			// Header & Titles for the runners

		pwR.println("GOLD MEDALIST: " + goldRunner.toString() + "\n"); 
		pwR.println("SILVER MEDALIST: " + silverRunner.toString() + "\n");
		pwR.println("BRONZE MEDALIST: " + bronzeRunner.toString());

		pwR.close();

	}
}
