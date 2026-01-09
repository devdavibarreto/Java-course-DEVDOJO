package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionas6 {
    public static void main(String[] args) {
/**
 * Utilizando Switch Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
 *  Considerando 1 como domingo
 */
        byte diaDaSemana = 1;

//Resposta otimizada do professor !!
        switch (diaDaSemana) {
            case 1:
                case 7:
                System.out.println("Fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }

// Minha resposta
//switch (diaDaSemana){
//    case 1:
//        System.out.println("Final de Semana");
//        break;
//    case 2:
//        System.out.println("Dia útil");
//        break;
//    case 3:
//        System.out.println("Dia útil");
//        break;
//    case 4:
//        System.out.println("Dia útil");
//        break;
//    case 5:
//        System.out.println("Dia útil");
//        break;
//    case 6:
//        System.out.println("Dia útil");
//        break;
//    case 7:
//        System.out.println("Final de Semana");
//        break;
//    default:
//        System.out.println("Dia Inválido");

  //  }
}
}
