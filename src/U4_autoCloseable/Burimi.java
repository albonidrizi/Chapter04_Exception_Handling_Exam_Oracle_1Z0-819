package U4_autoCloseable;



public class Burimi implements AutoCloseable {

    public void lexo(){
        System.out.println("Leximi i burimit");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Mbyllja e burimit");
    }
}
