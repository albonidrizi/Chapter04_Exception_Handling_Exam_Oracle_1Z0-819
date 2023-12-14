package U3_exceptions.RuntimeExceptions;

public class U6_NullPointerExceptions {

    public static void main(String[] args) {
        //paTryCatch();
        meTryCatch();

    }

    private static void meTryCatch() {
        try {
            String tekst = null;
            int gjatsia = tekst.length();
            System.out.println("Ky resht nuk do te lexohet");
        }catch (NullPointerException e){
            System.out.println("Ky eshte nje null pointer exception");
        }
        System.out.println("Ky resht do te lexohet");
    }

    private static void paTryCatch() {
        String tekst = null;
        int gjatsia = tekst.length();
        System.out.println("Ky resht nuk do te lexohet");
    }

}
