#include <stdio.h>

void funnyFunction(int array[], int size);

int main() {
    int n = 5;
    int arr[5] = {67, 44, 82, 17, 20}; // initialize an array

    printf("Array before funnyFunction: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");

    funnyFunction(arr, n);

    printf("Array after funnyFunction: ");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");

    return 0;
}

void funnyFunction(int array[], int size) {
    for (int i = 0; i < size; i++) {
        int hasSwapped = 0; // flag to detect any swap is there or not
        for (int j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j + 1]) { // when the current item is bigger than next
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                hasSwapped = 1; // set swap flag
            }
        }
        if (!hasSwapped)
            break; // No swap in this pass, so array is sorted
    }
}
