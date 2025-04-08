import java.util.Scanner;

public class Ex07_MaiorComPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior, posicao;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        maior = vetor[0];
        posicao = 0;

        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Maior número: " + maior + " na posição " + posicao);
        sc.close();
    }
}
