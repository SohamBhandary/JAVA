public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int i=0;
        String str=null;

        int num[]={1,2,3,4};
        try{
//            int j=2/i;
//            System.out.println(num[6]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by zero");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array ended");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }

    }
}
