package U1_tryCatch;

public class TryCatchFlowTwo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = null;

        try{
            sb.append("a");
            str.toLowerCase();
            sb.append("b");
        }catch (IllegalArgumentException ex){
            sb.append("c");
        }
        catch (NullPointerException e){
            sb.append("d");
        }finally {
            sb.append("f");
        }


        System.out.println(sb);
    }
}
