package U7_creatingException;

public class ExampleUsage {


    public static void main(String[] args) {
        try {
           // throw new CustomException();
          //  throw new CustomException("Kjo eshte nje gabim i pershtatur");
            throw new CustomException("Kjo eshte nje gabim i pershtatur", new RuntimeException());
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

}
