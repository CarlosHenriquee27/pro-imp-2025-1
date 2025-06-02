import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> todosAlunos = new ArrayList<>();

        System.out.println("Digite os dados dos 10 alunos:");

        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Aluno " + (i + 1) + " ---");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();

            System.out.print("Média Final: ");
            double mediaFinal = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha

            todosAlunos.add(new Aluno(nome, matricula, mediaFinal));
        }

        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();
        final double MEDIA_MINIMA = 5.0;

        for (Aluno aluno : todosAlunos) {
            if (aluno.mediaFinal >= MEDIA_MINIMA) {
                aprovados.add(aluno);
            } else {
                reprovados.add(aluno);
            }
        }

        System.out.println("\n--- Alunos Aprovados ---");
        if (aprovados.isEmpty()) {
            System.out.println("Nenhum aluno aprovado.");
        } else {
            for (Aluno aluno : aprovados) {
                System.out.println(aluno);
            }
        }

        System.out.println("\n--- Alunos Reprovados ---");
        if (reprovados.isEmpty()) {
            System.out.println("Nenhum aluno reprovado.");
        } else {
            for (Aluno aluno : reprovados) {
                System.out.println(aluno);
            }
        }

        scanner.close();
    }
}