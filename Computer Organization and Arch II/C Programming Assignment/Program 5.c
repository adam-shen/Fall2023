#include <stdio.h>

void main(){

    int A = 5;

    int B = 10;

    int* ptrA = &A;
    int* ptrB = &B;

    printf("Before swap: A = %d, B = %d\n", A, B);

    swap(ptrA, ptrB);

    printf("After swap: A = %d, B = %d\n", A, B);
}

void swap(int* ptrA, int* ptrB) { //Concept 10, Learning to define a pointer. Using them to return more than one changed value from a function.
    int temp = *ptrA;
    *ptrA = *ptrB;
    *ptrB = temp;
} //Additional Concepts used: 1,2,3,5