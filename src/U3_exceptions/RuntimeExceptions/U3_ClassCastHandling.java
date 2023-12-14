package U3_exceptions.RuntimeExceptions;

public class U3_ClassCastHandling {

    public static void main(String[] args) {
        //paTryCatch();
        meTryCatch();
    }


    public static void paTryCatch(){
        Object obj = "Ky eshte nje string";
        Integer number = (Integer) obj;

        System.out.println("Ky reshte nuk do te lexohet");
    }

    public static void meTryCatch(){

        try {
            Object obj = "Ky eshte nje string";
            Integer number = (Integer) obj;
        }catch (ClassCastException e){
            System.out.println("Ky eshte nje ClassCastException");
        }
        System.out.println("Ky resht do te lexohet");
    }

}
