package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
// Operadores  Aritiméticos : + - / *

        int numero1 = 10;
        int numero2 = 2;
// Pode ser salvo dentro de uma variavel tbm
        int resultado = numero1 + numero2;
        System.out.println(numero1 * numero2);
// Se eu dividir 10/ 20 usando inteiro dara um resultado inteiro !! no caso 0 tenho que tomar cuidado em relação a isso
        // Para que não der valores fora do comum
        // é possivel fazer um cast tbm
        // double resultado = numero01 / (double)  numero02;
        // O + ele se comporta de formas diferentes no Java !! Ele se o primeiro valor for String e for concatenar
        // Ele vai concatenar os outros valores não somar tipo o exemplo ficaria 102
        // Na verdade a partir do valor da String ele vai começar concatenar !!

// Operador de resto %

        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores lógicos  sempre retorna um booleano < > <= >= comparação de igual ==  diferente !=
        // Padrão sem usar is no  exemplo ficaria é10?

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        // Não tem como comparar uma string com um inteiro !

        // Operadores logicos AND
        // && (and) ||(or) !(not)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);

        // or ||

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println( "isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // ctrl + alt +  l para organizar o código


        // class 19 !!
        // Operadores de  atribuição
        // = += -= *= /= %= BÁSICAMENTE ISSO VAI DIMINUIR ALGUMAS LINHAS DE CÓDIGO
        // Sempre escrever codigos flexivel sem hardcode que é escrever diretaente no codigo e deixar menos flexivel
        //  tipo ao inves de eu escrever
        /**
         *  double bonus = 2000;
         *  bonus = 1800 + 1000;
         *  era para somar o valor do bonus original o certo seria
         *  bonus = bonus + 1000 ( ou salvar esse valor dentro de uma variavel) private de preference
         *   a forma de simplificar e
         *   bonus += 1000; e vale tbm para os outros operadores
         *   isso diminui o codigo otimiza e melhora !!
         */
 // Muitas vezes vamos te que incrementar
        /**
         * OPERADORES ÚNARIOS
         */
        int contador= 0;
        contador++; // -- etc ao inves de contador += 1; ou contador = contador + 1 etc
        System.out.println(contador);

        /**
         * EXISTE DIFERENÇA EM COLOCAR NA FRENTE E COLOCAR ATRAS
         * ++contador
         * contador++
         *  Quando vc coloca antes vc esta dizendo que primeiro quer que execute a icrementação e quando
         *  colocado depois vc esta deixando bem claro que quer que faça primeiro o que tem que ser feito depois icrementa
         */





    }
}
