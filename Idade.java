import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        if (idade >= 18){
            System.out.println("E maior de idade");
        }
        else{
            System.out.println("Nao e maior de idade");
        }

        scanner.close();

    }
}