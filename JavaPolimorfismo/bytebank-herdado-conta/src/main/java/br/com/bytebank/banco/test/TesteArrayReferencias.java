package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc = new ContaCorrente(22, 33);
        contas[0] = cc;

        System.out.println(contas[0].getNumero());
        //No caso de uma posição "null" o retorno é: NullPointerException
        //System.out.println(contas[1].getNumero()); //ERRO


    }

}
