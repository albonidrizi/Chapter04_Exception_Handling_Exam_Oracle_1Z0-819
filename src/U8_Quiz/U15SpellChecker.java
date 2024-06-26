package com.exceptions.U8_Quiz;

class SpellingException extends RuntimeException {}

public class U15SpellChecker {


    public final static void main(String... participants) {
        try {
            if(!"cat".equals("kat")) {
                new SpellingException();
            }
        } catch (SpellingException | NullPointerException e) {
            System.out.println("Spelling problem!");
        } catch (Exception e) {
            System.out.println("Unknown Problem!");
        } finally {
            System.out.println("Done!");
        }
    }
}
