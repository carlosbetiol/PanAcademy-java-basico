import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 8;
        int n3 = 1;

        int maior,menor;

        if (n1 > n2 && n1 > n3){
            maior = n1;
        } else if ( n2 > n1 && n2 > n3 ) {
            maior = n2;
        } else {
            maior = n3;
        }

        if (n1 < n2 && n1 < n3){
            menor = n1;
        } else if ( n2 < n1 && n2 < n3 ) {
            menor = n2;
        } else {
            menor = n3;
        }

        if (maior==menor) {
            System.out.println("Todos os numero sao iguais");
        } else {
            System.out.println("O numero maior é " + maior);
            System.out.println("O numero menor é " + menor);
        }

    }

}
