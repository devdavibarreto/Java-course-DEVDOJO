package academy.devdojo.maratonajava.introducao;

public class Class06LoopStatements02 {
    public static void main(String[] args) {
        // From this class on, everything will be in English
        // https://www.youtube.com/watch?v=RbM_ZzEi8MY&list=PL0Un1HNdB4jGKw5szJrQETqJTlZKyKReu&index=29

        // Print all even numbers  from 0 to 100000

        //the shortcut is for

// TEACHER'S OPTIMIZED RESOLUTION

        // I need to think about scalable programs, that is, code maintainability. What if I solve it this way and the condition changes?
//        for (int i = 0; i <= 100000 ; i+=2) {
//            System.out.println("i);
//        }

// Temos que tornar uma solução mais flexível

        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                System.out.println("This Number is even " + i);
            }
        }

        // My resolution !!
//        for (int i = 0; i <= 100000; i++) {
//            if (i % 2 == 0) {
//                System.out.println("This Number is even " + i);
//            }
//        }

    }
}
