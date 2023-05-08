public class TestaBanco {

    public static void main(String[] args) {

        Cliente tiago = new Cliente();
        tiago.nome = "Tiago Braga";
        tiago.cpf = "123.123.123.12";
        tiago.profissao = "Desenvolvedor";

        Conta contaDoTiago = new Conta();
        contaDoTiago.deposita(100.0);

        //associa a Conta ao Cliente
        contaDoTiago.titular = tiago;
        System.out.println(contaDoTiago.titular.nome);

    }

}
