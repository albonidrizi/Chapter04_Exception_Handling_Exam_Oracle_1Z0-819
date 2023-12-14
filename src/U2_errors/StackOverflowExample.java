package U2_errors;

public class StackOverflowExample {

    public static void main(String[] args) {
        try{
            recursiveFunction(0);

        }catch (StackOverflowError err){
            System.out.println("Eshte nje StackOverflowError");
        }
    }


    public static void recursiveFunction(int num){
        System.out.println("Numri : "+ num);
        recursiveFunction(num +1);
    }


}

