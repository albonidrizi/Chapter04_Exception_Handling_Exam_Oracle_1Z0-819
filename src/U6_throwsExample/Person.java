package U6_throwsExample;

import java.io.IOException;

public class Person {
    private int age;


    void setAge1(int age)throws IllegalArgumentException{
        this.age = age;
    }

    void setAge2(int age)throws IOException {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
