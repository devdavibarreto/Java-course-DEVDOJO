package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <>  e imprima  a seguinte mensagem
Eu <nome> , morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

//  Quando estiver usando valores de moeda usa o Bigdecimal
// Qualquer dúvida debug o código
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Davi";
        String endereco = " Rua das palmeiras , apartamento 325 - Brasília-DF";
        double salario = 2436.45D;
        String dataRecebimentoSalario = "2026/01/05"; // É muito importante nomear suas varáiveis de uma forma que você bateu o olho você sabe o que ela representa
// Esse valor vai ficar pronto para a memoria depois de receber os valores acima
        String relatorio = "Eu " +  nome + " , morando no endereço " + endereco + " , \n" +
        " confirmo que recebi o salário de "+ salario + ", na data "+ dataRecebimentoSalario;

        // Posso colocar essa mensagem dentro de uma String
        System.out.println(relatorio);


    }
}
