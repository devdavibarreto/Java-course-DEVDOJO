package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionas5 {
    public static void main(String[] args) {
        // Imprima o dia da semana,considerando 1 como domingo
        //ctrl + alt + l  para organizar o código !!
       byte diaDaSemana = 2;

       // valores que pode colocar dentro do switch
        //char,int,byte,short,enum,String
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
                // Quando digitar um número que não existe nos dias da semana
            default:
                System.out.println(" Opção inválida");

// Se eu quisesse mostrar os dias anteriores do dia escolhido era só inverter a logica !! É tirar o break
        }

        char sexo = 'H'; // se eu usar aspas duplas vou te que usar as aspas duplas nas opção
        // se ler opção caso seja ..... caso ..... caso ...
        switch (sexo){
            case 'H':
                System.out.println("Homem");
                break;
            case 'M':

                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
        /** Pode usar chavas mais não é o mais recomendado !!
         *    case 'M':{
         *
         *                 System.out.println("Mulher");
         *                 break;}
         */

    }
}
