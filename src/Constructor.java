class Human1{
    private int age;
    private String name;
    public Human1(int age,String name){
//        System.out.println("In Constructor");
        this.age=age;
        this.name=name;
        System.out.println("details are"+" "+this.age+" " +this.name);
    }

}

public class Constructor {
    public static void main(String[] args) {

        Human1 h = new Human1(72,"Soham");
        Human1 h1 = new Human1(27,"Soham1");
    }
}
