class AIC {
    public void show() {
        System.out.println("In show");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        AIC a = new AIC() {

            public void show() {
                System.out.println("in new show");
            }
        };
        a.show();
    }
}
