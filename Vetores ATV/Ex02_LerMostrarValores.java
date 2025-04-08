import java.util.Scanner;

public class Ex02_LerMostrarValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um valor: ");
            valores[i] = sc.nextInt();
        }
        System.out.println("Valores lidos:");
        for (int v : valores) {
            System.out.println(v);
        }
        sc.close();
    }
}


