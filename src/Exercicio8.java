import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdComprado;
        final float precoNormal = 0.30f;
        final float precoPromo = 0.25f;

        System.out.println("Quantas macas foram compradas?");
        qtdComprado = sc.nextInt();
        System.out.printf("Total: %.2f", (qtdComprado < 12 ? qtdComprado*precoNormal : qtdComprado*precoPromo ));

        sc.close();

    }


}
