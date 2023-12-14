package U5_TryWithResources;

public class MyResource implements AutoCloseable{


    String name ;

    public MyResource(String name){
        this.name = name;
    }


    @Override
    public void close() {
        System.out.println("Closing: "+ name);
    }
}
