#include <stdio.h>

int main(void){

    int numero1;
    printf("Digite o numero: ");
    scanf("%d", &numero1);
    if (numero1 % 2 == 0){
        printf("\nO numero e par.");
    }
    else{
        printf("\nO numero e impar.");
    }

}