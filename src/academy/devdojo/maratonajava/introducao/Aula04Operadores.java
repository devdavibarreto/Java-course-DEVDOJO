package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
// Operadores  Aritiméticos : + - / *

        int numero1 = 10;
        int numero2 = 2;
// Pode ser salvo dentro de uma variavel tbm
        int resultado = numero1 + numero2;
        System.out.println( numero1 * numero2);
// Se eu dividir 10/ 20 usando inteiro dara um resultado inteiro !! no caso 0 tenho que tomar cuidado em relação a isso
        // Para que não der valores fora do comum
        // é possivel fazer um cast tbm
        // double resultado = numero01 / (double)  numero02;
        // O + ele se comporta de formas diferentes no Java !! Ele se o primeiro valor for String e for concatenar
        // Ele vai concatenar os outros valores não somar tipo o exemplo ficaria 102
        // Na verdade a partir do valor da String ele vai começar concatenar !!

    }
}
