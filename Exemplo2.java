import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Informe a nota1: ");
        nota1 = teclado.nextDouble();

        System.out.println("Informe a nota2: ");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2) / 2.0;
        System.out.println("A sua média aritmética é: " + media);

        teclado.close();
    }
}