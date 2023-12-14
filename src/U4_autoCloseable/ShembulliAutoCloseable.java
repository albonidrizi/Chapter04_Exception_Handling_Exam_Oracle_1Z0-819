package U4_autoCloseable;

public class ShembulliAutoCloseable {
    public static void main(String[] args) {


        try(Burimi burimi = new Burimi()){
            burimi.lexo();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
