package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
 double salario = 6000;
 String mensagemDoar = "Eu vou doar 500 reais para o devDojo";
 String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter !!";
 // (condição) ? Verdadeiro : falso;
 String resultado = salario >= 5000 ? mensagemDoar : mensagemNãoDoar;
        System.out.println(resultado);

    }
}
