package U6_throwsExample;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Person p  = new Person();

        p.setAge1(30);
        try {
            p.setAge2(30);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(p.getAge());

    }
}
