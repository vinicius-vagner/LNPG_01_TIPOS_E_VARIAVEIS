#include <stdio.h>

int main(void){

    float temperatura_celcius, temperatura_fahrenheit;
    printf("Digite a temperatura em Celcius: ");
    scanf("%f", &temperatura_celcius);
    temperatura_fahrenheit = ((temperatura_celcius*9)+160)/5;
    printf("A temperatura em Fahrenheit e: %f", temperatura_fahrenheit);
}