package U3_exceptions.RuntimeExceptions;

public class U2_IndexOutOfBoundsExceptionsHandling {

    public static void main(String[] args) {


        try {
            int[] varg = {1, 2, 3, 4, 5};

            int vlera = varg[5];
            System.out.println("Vlera: " + vlera);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Out of Bounds "+ e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index Out of Bounds "+ e.getMessage());
        }
    }



}
