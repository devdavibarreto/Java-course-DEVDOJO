package academy.devdojo.maratonajava.introducao;

public class Class06LoopStatements04 {
    public static void main(String[] args) {
        // Given a car's total price, for example 20000
        //I want to find how much and for how long I'll have to pay monthly.
        //Condition: The monthly payment cannot be lower than 1000

// Teacher resolution ( Efficient)
        double totalPrice = 20000;
        for (int monthlyCount = 1; monthlyCount <= totalPrice; monthlyCount++) {
            double monthlyPrice = totalPrice / monthlyCount;
            //  Now improving the code and business logic.
            if (monthlyPrice < 1000) {
                break;
            }
            System.out.println("Months" + monthlyCount + " Price " + monthlyPrice);


// ANOTHER TEACHER RESOLUTION
//            if (monthlyPrice >= 1000){
//                System.out.println("Months" + monthlyCount + " Price" + monthlyPrice);
//
//                // The use of `break` is extremely necessary. Remove the comment from the line below and remove the `break`; you will see the wasted processing. In the real world, there are several extremely heavy business rules.
//            }else {
//                break;
//            }
//          //  System.out.println( " Inside for, outside if " + monthlyCount);

        }


        // My resolution (  Not Efficient)
        double cartTotalPrice = 20000;
        double monthlyPayment = 1450;
        int NumberOfmonthly = 0;
        while (cartTotalPrice > 0) {
            double calculater = cartTotalPrice / monthlyPayment;
            NumberOfmonthly = (int) calculater;
            // System.out.println("how long " + NumberOfmonthly + " how much " + monthlyPayment);
            break;
        }

    }

}
