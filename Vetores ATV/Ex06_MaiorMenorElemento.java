import java.util.Scanner;

public class Ex06_MaiorMenorElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior, menor;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        maior = menor = vetor[0];

        for (int v : vetor) {
            if (v > maior) maior = v;
            if (v < menor) menor = v;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
