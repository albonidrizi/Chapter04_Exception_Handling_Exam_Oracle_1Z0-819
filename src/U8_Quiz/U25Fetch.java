package com.exceptions.U8_Quiz;
public class U25Fetch {
    public int play(String name) throws RuntimeException {
        try {
            throw new RuntimeException(name);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    public static final void main(String[] ball)
            throws RuntimeException {
        new U25Fetch().play("Webby");
        new U25Fetch().play("Georgette");
    }
}