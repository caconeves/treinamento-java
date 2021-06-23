import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;

        System.out.println("Informe a nota1:");
        nota1 = teclado.nextDouble();
        
        System.out.println("Informe a nota2:");
        nota2 = teclado.nextDouble();

        media = (nota1 * 0.4) + (nota2 * 0.6);
        if (media >= 6) {
            System.out.println("Aprovado com média = " + media);
        } else {
            System.out.println("Reprovado com média = " + media);
        }

        teclado.close();
    }
}
