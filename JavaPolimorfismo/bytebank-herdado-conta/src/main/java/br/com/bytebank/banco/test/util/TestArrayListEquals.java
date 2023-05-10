package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TestArrayListEquals {

    public static void main(String[] args) {

        //Utilizando os Generics para determinar o tipo de dados aceito no ArrayList;
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(23, 12);
        lista.add(cc2);

        boolean isPresent = lista.contains(cc2);

        System.out.println(isPresent);

        for(Conta conta : lista) {
            System.out.println(conta);
        }

    }

}
