package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // O if, só é executado se a condicional que estiver dentro dele for verdadeira !!
        /**
         * Uma forma tambem muito vista do if
         * boolean autorizado = idade >= 20;
         * Usando o operador de negação !
         *if (autorizado == false){
         *             System.out.println(" Não esta autorizado a iniciar o processo de habilitação");
         *         }
         *
         */
        int idade = 20;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado){
            System.out.println("Autorizado a iniciar o processo de habilitação");
        }

        if (!isAutorizado){
            System.out.println(" Não esta autorizado a iniciar o processo de habilitação");
        }

        System.out.println("Fora do if");

    }
}
