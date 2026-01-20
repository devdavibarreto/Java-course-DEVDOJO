package academy.devdojo.maratonajava.introducao;

public class Class06LoopStatements03 {
    public static void main(String[] args) {
        //The `break` statement is useful when you want to interrupt the iteration.
        // Class number 29

        // Given a total number,for example 50, print the first 25
        int maxNumber = 50;
        for (int i = 0; i <= maxNumber; i++) {
// Simple resolution

            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
