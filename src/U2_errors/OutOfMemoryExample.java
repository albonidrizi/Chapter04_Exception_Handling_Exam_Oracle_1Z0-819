package U2_errors;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryExample {

    public static void main(String[] args) {
        try{
            List<Integer> lista = new ArrayList<>();

            while (true){
                lista.add(1000);
            }
        }catch(OutOfMemoryError e){
            System.out.println("Gabim: Munges memorie");
            e.printStackTrace();
        }
    }

}
