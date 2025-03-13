class Human03 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {  // Corrected setter
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Human03 obj = new Human03();  // Corrected object creation

        obj.setAge(30);   // Corrected method call
        obj.setName("Soham");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
