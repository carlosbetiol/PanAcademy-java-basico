import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Digite o lado 1:");
        lado1 = sc.nextInt();

        System.out.println("Digite o lado 2:");
        lado2 = sc.nextInt();

        System.out.println("Digite o lado 3:");
        lado3 = sc.nextInt();

        boolean equilatero = lado1 == lado2 && lado2 == lado3;
        boolean isoscele = lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
        boolean escaleno = lado1 != lado2 && lado1 != lado3 && lado2 != lado3;

        System.out.println(equilatero ? "equilatero" : isoscele ? "isoscele" : "escaleno");

        sc.close();
    }
}
