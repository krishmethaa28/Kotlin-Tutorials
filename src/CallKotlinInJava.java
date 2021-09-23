public class CallKotlinInJava {
    public static void main(String[] args) {

        //Methods.kt
        int result = Methods.add(5,6);
        System.out.println("The result of Kotlin add method is : " + result);

        System.out.println("-----------------------------------------------------------------------------------------");

        //Parameters.kt
        int finalAmount = Parameters.calcAmount(50);
        System.out.println("Amount Due with regular tax : Rs." + finalAmount);

        finalAmount = Parameters.calcAmount(50,0.03);
        System.out.println("Amount Due with special tax : Rs." + finalAmount);

    }
}
