/*
Program 4: Write a Program to find the factorial of a given number.
Use a function called factorial(int N). No loops are to be used. [Hint do
through function recursion]

In this problem, you have to write a program to calculate the factorial (product of all the
natural numbers less than or equal to the given number n) of a number entered by the
user.
*/

#include <stdio.h>

void main(){
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);
    printf("The factorial of %d is: %d\n", num, factorial(num));
}

factorial(int N){               //Another instance of Concept 4, and also Concept of 9 where we use function recursion
    if (N == 0 || N == 1){      //Additionally, Concept 5 is used where we take num as a parameter, but it's value is not changed
        return 1;
    }
    else{
        return N * factorial(N - 1);
    }
}