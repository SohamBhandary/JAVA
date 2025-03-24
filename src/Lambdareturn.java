import java.lang.FunctionalInterface;

@FunctionalInterface
interface xyz{
    void run(int i, int j);
}
class Lambdareturn {
    public static void main(String[] args) {
        xyz x =(i,j)->{
            System.out.println(i+j);
        };
        x.run(2,3);

    }
}
