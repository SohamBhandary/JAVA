enum Status{
    Running,Failed,Pending,Success;
}

public class Enums {
    public static void main(String[] args) {
        int i=5;
        Status[] s=Status.values();
        System.out.println(s[0]);


    }
}
