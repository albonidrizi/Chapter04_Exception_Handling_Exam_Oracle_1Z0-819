package com.exceptions.U8_Quiz;

//class ProblemException extends Exception {
//    ProblemException(Exception e) { super(e); }
//}
//class MajorProblemException extends ProblemException {
//    MajorProblemException(String message) { super(message); }
//}
//public class U18Unfortunate {
//    public static void main(String[] args) throws Exception {
//        try {
//            System.out.print(1);
//            throw new MajorProblemException("Uh oh");
//        }catch (ProblemException | RuntimeException e){
//            System.out.println(2);
//            try {
//                throw new MajorProblemException("yikes");
//            }finally {
//                System.out.println(3);
//            }
//            }finally {
//            System.out.println(4);
//        }
//    }
//}