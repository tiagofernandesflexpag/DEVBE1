public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Braga");
        g1.setCpf("123456789-27");
        g1.setSalario(3000);

        System.out.println(g1.getNome());
        System.out.println(g1.getSalario());
        System.out.println(g1.getCpf());

        System.out.println(g1.autentica(123));

        System.out.println(g1.getBonificacao());
    }

}
