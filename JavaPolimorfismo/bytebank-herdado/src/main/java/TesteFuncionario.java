public class TesteFuncionario {

    public static void main(String[] args) {

        Funcionario tiago = new Gerente();
        tiago.setNome("Tiago Braga");
        tiago.setCpf("123456789-27");
        tiago.setSalario(2500.00);

        System.out.println(tiago.getNome());
        System.out.println(tiago.getBonificacao());

    }


}
