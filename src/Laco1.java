import java.util.Scanner;

public class Laco1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeNotas = 0;
        double nota = 0.0;
        double total = 0.0;

        while(nota != -1) {
            System.out.println("Digite a proxima nota (-1 para sair): ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                quantidadeNotas += 1;
                total += nota;
            } else if (nota != -1) {
                System.out.println("Nota invalida");
            }
        }

        double media = total/quantidadeNotas;
        System.out.printf("A media das %d notas é %.2f", quantidadeNotas, media);

    }
}
