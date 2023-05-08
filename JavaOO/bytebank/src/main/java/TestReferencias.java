public class TestReferencias {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        primeiraConta.saldo += 100;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); //As variáveis estão apontando para o mesmo objeto.
        //Na verdade não são duas contas diferentes, pois há apenas uma instância de conta.

        if(primeiraConta == segundaConta){
            System.out.println("mesma conta");
        }else{
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);



    }
}
