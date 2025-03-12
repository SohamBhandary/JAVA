public class ifelseif {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        int z=7;
        if(x>y &&x>z)
        {
            System.out.println("First number is largest");
        }
        else if(y>x && y>z){
            System.out.println("Second number is largest");
        }
        else{
            System.out.println("third is the largest");

        }
    }
}
