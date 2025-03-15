abstract class AAC {
    public abstract void show();
}

 class AbstractAnonymousClass {
    public static void main(String[] args) {
        AAC a = new AAC() {
            @Override
            public void show() {
                System.out.println("in new show");
            }
        };
        a.show(); // Calling the overridden method
    }
}
