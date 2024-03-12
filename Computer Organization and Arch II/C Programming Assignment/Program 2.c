/*
Program 2: Write a Program to find the Sum of two numbers entered by the
user. It also prints your name as many times as sum of two numbers. The
name is present in the program as a global variable either of the form char *
name = “my name”; or char name[] = “my name”

In this problem, you have to write a program that adds two numbers and prints their sum
on the console screen.

*/

#include <stdio.h>

char *name = "Adam Elshanawany";            // Here Concept 3 is used where we declare a global variable (char *)
                                            //Concept 7 is also used where we understand how strings are managed
void main(){


int num1, num2, sum;                          // Here Concept 1 is used where we declare a variable (int)
printf("Enter the first number: ");
scanf("%d", &num1);                 // Here Concept 8 is used where we take input from the user

printf("Enter the second number: ");
scanf("%d", &num2);

sum = num1 + num2;

printf("Sum of %d and %d is: %d\n\n", num1, num2, sum);     // Concept 8 is continued here where we print the result

for (int i = 0; i < sum; i++) {         // Here Concept 3 is also used where we have a local varible (i)
    printf("%s\n", name);               // Here Concept 2 is used where we print a string, as well as above where we print integers
    }
}
