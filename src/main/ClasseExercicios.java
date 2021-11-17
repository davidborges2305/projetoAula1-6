package main;

import java.util.Locale;

public class ClasseExercicios{
    public static void main(String[] args) {

        String nome, nome2;
        nome = " David de Souza Borges";
        nome2 = " Hilda Isabel Barbosa Borges";

        System.out.println(nome);
        System.out.println(nome2);
        int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();

        System.out.println(" A variável nome tem " + tamanhoDoNome + " caractres");
        System.out.println(" A variável do segundo nome tem " + tamanhoDoNome2 + " caractres");

        int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;

        System.out.println(" O total de caracteres das duas variáveis é: " + totalCaracteres);

        String nomesConcatenados = nome.concat(nome2);

        System.out.println(nomesConcatenados);
        String nomeSemA = nome.replace('a', '#');
        System.out.println(nomeSemA);

        String somenteNome = nome2.substring(6, 11);
        System.out.println(somenteNome);

        String nomeTudoMaiusculo = nome2.toUpperCase();
        System.out.println(nomeTudoMaiusculo);
        String nomeTudoMinusculo = nome2.toLowerCase();
        System.out.println(nomeTudoMinusculo);




    }
}
