public class TestaCondicional2 {

    public static void main(String[] args) {

        System.out.println("Testando condicionais");

        int idade = 16;
        int quantidadePessoas = 2;
        boolean estaAcompanhado = false;

        System.out.println("Valor de acompanhado = " + estaAcompanhado);

        if (idade >= 18 || quantidadePessoas > 1 || estaAcompanhado){

            System.out.println("Seja bem-vindo!");

        } else {

            System.out.println("Infelizmente você não pode entrar!");

        }

    }

}

