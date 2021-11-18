package main;

public class classtrabalahndoOperadoreslogicos {

    public static void main(String[] args) {
        boolean ult3EmprestimosQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
        ult3EmprestimosQuitadosPrazo = true;
        possuiRendaComprovada = true;
        clienteDezEstrelas = false;
        restricaoCredito = true;

        boolean concederEmprestimo = (ult3EmprestimosQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && restricaoCredito;
        System.out.printf("Empréstimo concedido? \n%b", concederEmprestimo);



    }
}
