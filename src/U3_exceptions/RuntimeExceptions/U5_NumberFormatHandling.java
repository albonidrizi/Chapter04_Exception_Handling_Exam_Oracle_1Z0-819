package U3_exceptions.RuntimeExceptions;

public class U5_NumberFormatHandling {



    public static void main(String[] args) {

        try {
            String numberStr = "abx";
            int number = Integer.parseInt(numberStr);

        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }

        System.out.println("kete shkrim dua te nxjer ne console ");
    }
}
