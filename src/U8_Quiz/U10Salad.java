package com.exceptions.U8_Quiz;

class Garden implements AutoCloseable {
    private final int g;
    Garden(int g) { this.g = g; }
    public void close() throws Exception {
        System.out.print(g);
    }
}
public class U10Salad {
    public static void main(String[] u) throws Exception {


//        var g = new Garden(5);
//        try (g;
//             var h = new Garden(4);
//             var i = new Garden(2)) {
//        } finally {
//            System.out.println(9);
//        }
//        g = null;

    }
}