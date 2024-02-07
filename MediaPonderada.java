import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        
        float media1, media2, media3, peso1, peso2, peso3, media_ponderada;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        media1 = scanner.nextFloat();
        System.out.print("Digite o peso da primeira nota: ");
        peso1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota: ");
        media2 = scanner.nextFloat();
        System.out.print("Digite o peso da segunda nota: ");
        peso2 = scanner.nextFloat();
        System.out.print("Digite a terceira nota: ");
        media3 = scanner.nextFloat();
        System.out.print("Digite o peso da terceira nota: ");
        peso3 = scanner.nextFloat();

        media_ponderada = ((media1 * peso1) + (media2 * peso2) + (media3 * peso3))/3;
        System.out.print("A media ponderada do aluno e: " + media_ponderada);

        scanner.close();

    }
}


