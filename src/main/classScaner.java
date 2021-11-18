package main;

import java.util.Scanner;
public class classScaner {

    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, frequencia, totalNotas;
        char statusAluno;
        boolean aprovado;

        Scanner entradaNotas = new Scanner(System.in);
        Scanner entradaCaracteres = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = entradaCaracteres.nextLine();

        System.out.print("Digite um caracter para a situação do aluno: (0---> Ok ou P---> Pendência: ");
        statusAluno = entradaCaracteres.nextLine().charAt(0);

        System.out.print("Digite a primeira nota: ");
        nota1 = entradaNotas.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = entradaNotas.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = entradaNotas.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = entradaNotas.nextDouble();

        System.out.print("Digite a frequeência do aluno: ");
        frequencia = entradaNotas.nextDouble();

        totalNotas = nota1 + nota2 + nota3 + nota4;
        aprovado = totalNotas >= 70 && frequencia >= 0.75;



        System.out.printf(" O(a) aluno(a) %s obteve nota final %.2f e frequência %.2f%%. A situação do(a) aluno(a) é %c.\n"
        + "Aluno aprovado? %b. ", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado);

    }
}
