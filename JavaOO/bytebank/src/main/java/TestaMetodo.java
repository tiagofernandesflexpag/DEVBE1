public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaDoTiago = new Conta();

        contaDoTiago.deposita(350.0);

        System.out.println(contaDoTiago.saldo);

        boolean conseguiuRetirar = contaDoTiago.saca(100.0);

        System.out.println(conseguiuRetirar);
        System.out.println(contaDoTiago.saldo);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000.0);

        contaDaMarcela.transfere(300, contaDoTiago);
        System.out.println("O saldo da conta é: " + contaDaMarcela.saldo);

        System.out.println("O saldo da conta do Tiago é: " + contaDoTiago.saldo);

    }

}
