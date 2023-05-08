public class TesteContas {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(1234, 1234);
        cc.deposita(100.0);

        ContaPoupanca cp2 = new ContaPoupanca(1233, 1233);
        cp2.deposita(150.0);

        cc.transfere(50, cp2);


    }
}
