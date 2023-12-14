package U3_exceptions.RuntimeExceptions;

public class U1_ArithmeticExcaptionHandling {

    public static void main(String[] args) {

        int x= 10;
        int y = 0;

        try {
            int result = x % y;
            System.out.println("Rezultati: " + result);
        }catch (ArithmeticException e){
            System.out.println("Gabim aritmetik : Perqindje me zero");
        }



        System.out.println("Ky tekst do lexohet");
    }


}
