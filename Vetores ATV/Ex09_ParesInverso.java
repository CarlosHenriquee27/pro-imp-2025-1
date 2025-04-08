import java.util.Scanner;

public class Ex09_ParesInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Digite um número par: ");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                vetor[count] = n;
                count++;
            } else {
                System.out.println("Número não é par. Tente novamente.");
            }
        }

        System.out.println("Valores pares na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
        sc.close();
    }
}

