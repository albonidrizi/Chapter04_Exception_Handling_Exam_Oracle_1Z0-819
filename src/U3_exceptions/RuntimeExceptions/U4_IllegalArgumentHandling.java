package U3_exceptions.RuntimeExceptions;

public class U4_IllegalArgumentHandling {

    public static void validateAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Mosha duhet te jet me e madhe se 0");
        }
    }

    public static void main(String[] args) {
        int age = -1;
        try {
            validateAge(age);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException: "+e.getMessage());
        } catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException: "+e.getMessage());
        }catch (RuntimeException e){
            System.out.println("RuntimeException: "+ e.getMessage());
        }
    }

}
