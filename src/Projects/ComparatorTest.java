package Projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
//        List<String> animals = new ArrayList<>();
//        animals.add("dog");
//        animals.add("cat");
//        animals.add("frog");
//        animals.add("bird");
//
//        Collections.sort(animals, new StringLengthComparator());
//        System.out.println(animals);

        List<Personn> people = new ArrayList<>();

        people.add(new Personn(3, "Bob"));
        people.add(new Personn(1, "CKaty"));
        people.add(new Personn(2, "AMike"));

//        people.sort(new IdSort());
//        System.out.println(people);

        Collections.sort(people, new IdSort());
        System.out.println(people);
    }
}

class IdSort implements Comparator<Personn> {

    @Override
    public int compare(Personn o1, Personn o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            return 0;
        }

//        return o1.getName().compareTo(o2.getName());
    }

    //class StringLengthComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        if (o1.length() > o2.length()) {
//            return 1;
//        } else if (o1.length() < o2.length()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//}
}

class Personn {
    private int id;
    private String name;

    public Personn(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personn{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
















