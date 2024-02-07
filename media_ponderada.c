#include <stdio.h>

int main(void){

    float media1, media2, media3, peso1, peso2, peso3, media_ponderada;
    printf("Digite a primeira nota: ");
    scanf("%f", &media1);
    printf("Digite o peso da primeira nota: ");
    scanf("%f", &peso1);
    printf("Digite a segunda nota: ");
    scanf("%f", &media2);
    printf("Digite o peso da segunda nota: ");
    scanf("%f", &peso2);
    printf("Digite a terceira nota: ");
    scanf("%f", &media3);
    printf("Digite o peso da terceira nota: ");
    scanf("%f", &peso3);

    media_ponderada = ((media1 * peso1) + (media2 * peso2) + (media3 * peso3))/3;
    printf("A media ponderada do aluno e: %f", media_ponderada);

}