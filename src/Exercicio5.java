import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angulo1, angulo2, angulo3;

        System.out.println("Digite o angulo 1:");
        angulo1 = sc.nextInt();

        System.out.println("Digite o angulo 2:");
        angulo2 = sc.nextInt();

        System.out.println("Digite o angulo 3:");
        angulo3 = sc.nextInt();

        boolean retangulo = angulo1 == 90 && angulo2 == 90 && angulo3 == 90;
        boolean obtusangulo = !retangulo && (angulo1 > 90 || angulo2 > 90 || angulo3 > 90);
        boolean acutangulo = !retangulo && !obtusangulo && (angulo2 < 90 && angulo3 < 90);

        System.out.println(retangulo ? "retangulo" : obtusangulo ? "obtusangulo" : "acutangulo");

        sc.close();
    }

}
