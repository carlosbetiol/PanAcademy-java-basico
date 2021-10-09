import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota3 = sc.nextFloat();

        if( nota1<0 || nota1>10 || nota2<0 || nota2>10 || nota3<0 || nota3>10 ) {
            System.out.println("Nota inválida");
        } else {
            media = (nota1+nota2+nota3)/2f;
            if (media == 10){
                System.out.println("Aprovado com Distincao");
            } else if( media >= 7 ) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

        sc.close();
    }


}
