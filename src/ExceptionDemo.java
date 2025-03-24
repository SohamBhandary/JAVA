
public class ExceptionDemo {
    public static void main(String[] args) {
        //basically run time error
        int i=0;
        try{ int j=8/i;
            System.out.println(j);}
        catch (Exception e){
            System.out.println("Cannot perform operation" + e.getMessage());
        }


    }
}
