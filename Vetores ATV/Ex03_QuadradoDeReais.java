import java.util.Scanner;

public class Ex03_QuadradoDeReais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] original = new double[10];
        double[] quadrado = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número real: ");
            original[i] = sc.nextDouble();
            quadrado[i] = original[i] * original[i];
        }

        System.out.println("Vetor original:");
        for (double v : original) {
            System.out.println(v);
        }

        System.out.println("Vetor ao quadrado:");
        for (double q : quadrado) {
            System.out.println(q);
        }
        sc.close();
    }
}
