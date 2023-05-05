public class TestaConversao {

    public static void main(String[] args) {

        double salario = 1270.50;

        System.out.println((int) salario);

        int valor = (int) salario; //casting de variável, força a troca do tipo primitivo e desconsidera.

        System.out.println(valor);
    }

}
