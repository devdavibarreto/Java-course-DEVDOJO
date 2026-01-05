package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Primitive types store a simple value in memory
// Always written in lowercase
// There are 8 Primitive types: int, double, float, char, byte, short, long, boolean
// Variables should always be in English
        // Sempre se preocupar com o tamanho da variavel e ver o melhor a ser usado entre os 8
int age = 10;
int age1 = (int) 10000000000000000L; // Pq tem que tomar cuidado para não forçar  ele colocar um tipo dentro de um outro tipo
        // Essa pratíca se chama CAST mesma coisa para double float etc  quando cabe vc tem o resultado quando
        // não cabe vc vai ter um "corrompido".
long numeroGrande = 100000;
double salarioDouble = 20000; //Valores Decimais
float salarioFloat = 2500; // Valores Decimais
byte idadeBye = 127; // exceção da regra do ultimo comentario
short idadeShort= 10;
boolean verdadeiro = true;
boolean falso = false;
char caractere = 87; // Ler no APDFS
// Masculino e femenino

        System.out.println(age); //ctrl + d duplica a linha
        System.out.println(age1); //ctrl + d duplica a linha
    }
}
// Toda vez que você compila escrevendo o número direto no código ele vai entender que aquilo e um INT vc tem que
// Especificar !! exemplo coloca um L no int
// Cast não é uma boa pratica a ser feita !!