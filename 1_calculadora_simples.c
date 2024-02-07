#include <stdio.h>

int main(void){

    float numero1, numero2;
    printf("\nDigite o primeiro numero:");
    scanf("%f", &numero1);
    printf("\nDigite o segundo numero: ");
    scanf("%f", &numero2);

    printf("\nA soma dos numeros e: %f", numero1 + numero2);
    printf("\nA subtração dos numeros e: %f", numero1 - numero2);
    printf("\nA multiplicao dos numeros e: %f", numero1 * numero2);
    printf("\nA divisao dos numeros e: %f", numero1 / numero2);


}