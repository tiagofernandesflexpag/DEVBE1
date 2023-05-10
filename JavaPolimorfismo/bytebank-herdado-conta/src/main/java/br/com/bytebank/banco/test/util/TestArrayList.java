package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList lista = new ArrayList();

        Conta cc1 = new ContaCorrente(22, 11);
        lista.add(cc1);
        Conta cc2 = new ContaCorrente(33, 22);
        lista.add(cc2);

        System.out.println(lista.size());
        System.out.println(lista.get(0));

        Conta ref = (Conta) lista.get(0);

        System.out.println(ref.getNumero());

        lista.remove(1);

        System.out.println("Tamanho: " + lista.size());

        for(int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(lista.get(i));
        }

    }

}
