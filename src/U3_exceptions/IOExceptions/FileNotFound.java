package U3_exceptions.IOExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {

    public static void main(String[] args) {
        try{
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException ex){
            System.out.println("File.txt nuk eshte gjetur");
            ex.printStackTrace();
        }
    }

}
