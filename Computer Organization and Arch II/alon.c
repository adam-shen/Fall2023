// Will test to see if the number is a prime or not

#include <stdio.h>

void main(){

    int num;
    int i;
    int flag = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    for(i = 2; i <= num/2; i++){
        if(num % i == 0){
            flag = 1;
            break;
        }
    }

    if(flag == 0){
        printf("%d is a prime number\n", num);
    }else{
        printf("%d is not a prime number\n", num);
    }

    
}