package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionas4Exercicios {
    public static void main(String[] args) {
        // Minha resolução !! Resolve só que tenho que deixar as coisas mais claras pq não é somente eu que do manuntenção no código
//        double salarioAnual= 70000;
//
//
//        if (salarioAnual <= 34712){
//            salarioAnual = salarioAnual * (9.70 /100.0);
//
//        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
//            salarioAnual = salarioAnual * (37.35 /100.0);
//        }else {
//            salarioAnual = salarioAnual * (49.50/100);
//        }
//
//        System.out.println(salarioAnual);

        // Resolução do professor
        double salarioAnual = 25000;
        double primeiraFaixaDeImposto = 9.70/100;
        double segundaFaixaDeImposto = 37.35/100;
        double terceiraFaixaDeImposto = 49.50/100;
        double valorDoImposto; // Por isso não pode iniciar ele como 0

        if (salarioAnual <= 34712){
            valorDoImposto = salarioAnual * primeiraFaixaDeImposto;
        } else if (salarioAnual >=34713 && salarioAnual <= 68507) {
            valorDoImposto = salarioAnual * segundaFaixaDeImposto;
        }else {
            // salarioAnual *= terceiraFaixaDeImposto;
            // Uma forma de calcular o imporsto
            valorDoImposto = salarioAnual * terceiraFaixaDeImposto;
        }
        System.out.println(valorDoImposto);
        System.out.println(salarioAnual -valorDoImposto);
    }
    /**
     *  } else if ( salarioAnual <= 68507) {
     *             salarioAnual *= segundaFaixaDeImposto;
     *             Seria possivel escrever assim tbm e resumi a operação so que não fica uma leitura agradavel
     *             quando estou no bloco de if else if else completo a partir do momento que um true ele ja pula os outros
     *             Agora quando eu tenho somente if if if ele vai passar por todos para ver se encaixa
     *
     *             é vai ser true tbm então isso eu já provoco um bug na minha aplicação  ele vai se encaixar nas duas
     *
     *             *  } if ( salarioAnual <= 68507) {
     *      *             salarioAnual *= segundaFaixaDeImposto;
     */
}
