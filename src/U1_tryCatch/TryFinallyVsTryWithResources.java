package U1_tryCatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryFinallyVsTryWithResources {


    public static void main(String[] args) {

        //tryFinally();
        tryWithResources();
    }

    public static void tryFinally(){
        FileInputStream in =null;
        try {
            in = new FileInputStream("file.txt");
        }catch (FileNotFoundException e){
            System.out.println("Nuk eshte gjendur file.txt ne tryFinally");
        }finally {
            try {
                if (in != null){
                    in.close();
                }
            }catch (IOException e){
                //Trajtohet gabimi ne qoft se ka problem gjat  mbylljes
            }
        }

    }
    public static void tryWithResources(){

        try (FileInputStream in = new FileInputStream("filee.txt");
             Scanner sc = new Scanner(in)){

            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Nuk eshte gjetur file.txt ne tryWithResources");
        }catch (IOException e){
            throw new RuntimeException(e);
        }


    }





}
