package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while , do while , for

        int count = 8;
        //Precisa obrigatoriamente resultar em booleano
        // vai repertir se eu não atualizar a varíavel !! infinitamente
        while (count < 10){
            System.out.println(count);
            count +=1; // count++ etc ou ate mesmo dentro do sout !!
            // vai se repetir ate se tornar false !!
        }
        // do while vai ser executado pelo menos uma vez mesmo que seja falso ou verdadeiro

        // Se ler faça enquanto
        count = 0;
        do {
            System.out.println("Dentro do DO " + ++count);
        }while (count < 10);


        // while vc coloca condições
        // for trabalha com indices
        for (int i=0; i < 10 ; i++){
            System.out.println(i);
        }
// vc pode omitir as chaves de todos porém é uma prática não recomendada
        // Comparar senha com a senha do banco de dados etc !!
        String senha = "123";
        while (!senha.equals("1234")) {
            System.out.println("Digite a senha correta:");
            break;
        }
}}
