import java.util.*;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("casa do codigo");
        palavras.add("caelum");

        Collections.sort(palavras);
        System.out.println(palavras);
        System.out.println("-------------");
        Comparator<String> comparador = new ComparadorPorTamanho();

        //Modo antigo de se fazer:
        //Collections.sort(palavras, comparador);
        //Modo atualizado java 8
        palavras.sort(comparador);
        System.out.println(palavras);
        System.out.println("-------------");
        //Modo antigo de se fazer:
        //for(String p : palavras){
        //    System.out.println(p);
        // }
        //Modo atualizado java 8
        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor); //passando o consumidor que implementa a regra do sout.

        //Agora as interfaces podem ter méotodos default com uma implementação.

        //Utilizando a sintaxe lambda para simplificar as coisas:
        System.out.println("-------------");
        //Nesse caso, como a função forEach de palavras recebe um consumer é possível simplificar a sintaxe
        //diminuindo bastante a quantidade de codigo. Tb não precisa das implementação explicita de classes e métodos.
        palavras.forEach((String s) -> {
            System.out.println(s);
        });

        System.out.println("-------------");

        //Sintaxe ainda mais simplificada para metodos que so recebem 1 parametro.
        palavras.forEach(s -> System.out.println(s));
        //LAMBDA SO FUNCIONA PARA INTERFACES QUE SO TEM 1 METODO ABSTRATO

    }
}

class ImprimeNaLinha implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

    class ComparadorPorTamanho implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {

            if (s1.length() < s2.length()) {
                return -1;
            }

            if (s1.length() > s2.length()) {
                return 1;
            }

            return 0;
        }

    }