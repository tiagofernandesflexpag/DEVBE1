public class TestaGetESet {

    public static void main(String[] args) {

        Conta conta = new Conta(1202, 00001);
        conta.setNumero(1234);
        System.out.println(conta.getNumero());

        Cliente tiago = new Cliente();

        conta.setTitular(tiago);
        tiago.setNome("Tiago Braga");

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");

    }

}
