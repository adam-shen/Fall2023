/*
Write a program to Print Half half-pyramid pattern. It takes
user input to know levels in the pyramid. And saves the pyramid in an
output file.

In this problem, you have to write a simple program to read the number of rows (n)
entered by the user and print the half-pyramid pattern of numbers. Half pyramid pattern
looks like a right-angle triangle of numbers having a hypotenuse on the right side.
*/

#include <stdio.h>

void main(){

int rows;                          // Here Concept 1 is used where we declare a variable (int)

printf("Enter the number of rows: ");
scanf("%d", &rows);                 // Here Concept 8 is used where we take input from the user

for (int i = 1; i<=rows; i++){  // Here Concept 6 is used where we have a local varible (i)
    int count = 0;
    for (int j = i; count <i; count++){
        printf("%d ", j);
    }
    printf("\n");
}

}