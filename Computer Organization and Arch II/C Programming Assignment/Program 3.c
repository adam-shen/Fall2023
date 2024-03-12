/*
Program 3: Write a Program to find the size of int, float, double, and char,
and a string “Middlesex county college”. [Hint use an inbuilt function
sizeof()] For string use both sizeof and strlen() function.

In this problem, you have to write a program to print the size of the variable.
*/
#include <stdio.h>
#include <string.h>

int main() {                 // Here Concept 4 is used where the main() function is written and called
    // Find the size of int
    printf("Size of int = %zu\n", sizeof(int));

    // Find the size of float
    printf("Size of float = %zu\n", sizeof(float));

    // Find the size of double
    printf("Size of double = %zu\n", sizeof(double));

    // Find the size of char
    printf("Size of char = %zu\n", sizeof(char));

    // Find the size of the string "Middlesex county college" using sizeof
    char string[] = "Middlesex county college";
    printf("Size of string (using sizeof) = %zu\n", sizeof(string));

    // Find the size of the string "Middlesex county college" using strlen
    printf("Size of string (using strlen) = %zu\n", strlen(string));

    return 0;

    //Concepts already used which are here are: 1,2,3,4,7
}

// This seems right, but I'm confused by the wording of the question tbh