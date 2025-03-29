import java.util.*;

class Studentx implements Comparable<Studentx> {
    int id;
    String name;

    public Studentx(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Studentx s) {
        // Natural sorting by ID using Comparable
        return Integer.compare(this.id, s.id);
    }

    @Override
    public String toString() {
        return "[ID: " + id + ", Name: " + name + "]";
    }
}

public class ComparatorVsComparable {
    public static void main(String[] args) {
        // Using Comparable
        List<Studentx> students = new ArrayList<>();
        students.add(new Studentx(103, "Alice"));
        students.add(new Studentx(101, "Bob"));
        students.add(new Studentx(102, "Charlie"));

        System.out.println("Before sorting (Comparable - by ID): " + students);
        Collections.sort(students);
        System.out.println("After sorting (Comparable - by ID): " + students);

        // Using Comparator
        Comparator<Studentx> nameComparator = (s1, s2) -> s1.name.compareTo(s2.name);
        Collections.sort(students, nameComparator);
        System.out.println("After sorting (Comparator - by Name): " + students);

        // Integer example with Comparator
        Comparator<Integer> com = (a, b) -> Integer.compare(a % 10, b % 10);

        List<Integer> nums = Arrays.asList(78, 2, 5, 1);
        System.out.println("\nBefore sorting (By last digit): " + nums);
        Collections.sort(nums, com);
        System.out.println("After sorting (By last digit): " + nums);
    }
}
