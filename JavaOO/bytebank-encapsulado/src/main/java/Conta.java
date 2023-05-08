public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total; //static quer dizer que é referente a toda a classe, não mais ao objeto.

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int novoNumero) {

        if(novoNumero <= 0){
            System.out.println("Não pode receber valor menor que zero");
            return;
        }

        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {

        if(agencia <= 0){
            System.out.println("Não pode receber valor menor que zero");
            return;
        }

        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public Conta(int agencia, int numero) {

        Conta.total++;

        this.agencia = agencia;

        this.numero = numero;

        System.out.println("Conta criada. Agência: " + this.agencia + ", conta: " + this.numero);

        System.out.println("Atualmente, temos : " + total + " contas criadas");

    }
}