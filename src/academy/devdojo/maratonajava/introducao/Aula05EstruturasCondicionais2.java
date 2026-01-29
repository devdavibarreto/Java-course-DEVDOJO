package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        /**
         * TODA VARIAVEL DENTRO DE ESCOPO DE METODO ELA TEM QUE SER INICIALIZADA ANTES DE SER EXECUTADA !!
         * Se  ficarmos usando apenas if if if if if
         * não otimizar para if else
         * cada if é uma instrução independente isso não é nada performatico
         */

        /**
         *  idade < 15 categoria infantil
         *  idade >=15 && idade < 18 categoria juvenil
         *  idade >= 18 categoria adulto
         */

        int idade = 18;

//        if (idade  < 15){
//            System.out.println("categoria infantil");
//        } else if (idade >=15 && idade < 18) {
//            System.out.println(" Categoria Juvenil");
//        }else{
//            System.out.println("Categoria adulto");
//        }

        // DEIXANDO O CÓDIGO MAIS LIMPO
        String categoria;
        if (idade < 15) {
            categoria = "infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "adulto";
        }
        System.out.println(categoria);

        // Posso usar operação ternaria nesse caso tbm mais não é recomendado
        //  SE LER ASSIM
        //      SE ESSE VERDADEIRO, ENT INFANTIL, SE FALSO ENT JUVENIL ,SE ESSA CONDIÇÃO idade >= 15 && idade < 18 FOR FALSA, ENT ADULT.
        categoria = idade < 15 ? "infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";

    }

}
