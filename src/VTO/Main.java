package VTO;

public class Main {

    public static void main(String[] args) {

       //Calculadora

        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.substracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);


        //Mensagem

        System.out.println("Exercício Mensagem");
        Mensagem.obtermensagem(9);
        Mensagem.obtermensagem(14);
        Mensagem.obtermensagem(21);

        //Empréstimo

        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        //Emprestimo.calcular(1000,Emprestimo.getTaxaTresParcelas());
        Emprestimo.calcular(1000,5);


    }



}

