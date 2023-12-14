package U3_exceptions.IOExceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionHandling {


    public static void main(String[] args) {
        BufferedReader reader = null;


        try{
            reader = new BufferedReader(new FileReader("file.txt"));
        }catch (FileNotFoundException e){
            System.out.println("File not found: Gabim gjat leximit te filit");
        }catch (IOException e){
            System.out.println("IOException : Gabim gjat leximit te filit");
        }finally {
            try{
            if (reader !=null){
                reader.close();
            }
            }catch (IOException e){
                System.out.println("Gabim gjat mbylljes se burimit reader");
            }
        }



    }




}
