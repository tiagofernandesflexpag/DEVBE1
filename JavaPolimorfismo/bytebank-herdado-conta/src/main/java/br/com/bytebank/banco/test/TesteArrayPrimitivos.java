package br.com.bytebank.banco.test;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5];

//		int qualIdade = idades[0];
//		System.out.println(qualIdade);
//
//		int idade1 = 29;
//		int idade2 = 39;
//		int idade3 = 18;
//		int idade4 = 13;
//		int idade5 = 55;
//
//		System.out.println(idade4);
//		System.out.println(idades.length);

		for(int i = 0; i < 5; i++){
			idades[i] = i * i;
		}

		for(int i = 0; i < 5; i++){
			System.out.println(idades[i]);
		}

	}

}
