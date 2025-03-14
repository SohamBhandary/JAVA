class UAD{
    public void show1()
    {
        System.out.println("in parent");
    }
}
class UAD2 extends UAD{
    public void show2(){
        System.out.println("In child");
    }


}
public class UpcastingAndDowncasting {
    public static void main(String[] args) {
//        double d =4.5;
//        System.out.println(d);
//        int i=(int)d;
//        System.out.println(i);
        UAD u = (UAD)new UAD2();
        u.show1();
        UAD2 u1=(UAD2)u;
        u1.show2();
    }
}
