package Projects;

import java.util.*;

public class ComparableTable {
    public static void main(String[] args) {
        List<Person1> peopleList = new ArrayList<>();
//        addElements(peopleList);
        peopleList.add(new Person1(3, "DKaty"));
        peopleList.add(new Person1(4, "CGeorge"));
        peopleList.add(new Person1(2, "BTo"));
        peopleList.add(new Person1(1, "ABob"));
        Collections.sort(peopleList);

        Set<Person1> peopleSet = new TreeSet<>();
//        addElements(peopleSet);
        peopleSet.add(new Person1(3, "DKaty"));
        peopleSet.add(new Person1(4, "CGeorge"));
        peopleSet.add(new Person1(2, "BTo"));
        peopleSet.add(new Person1(1, "ABob"));

        System.out.println("List: " + peopleList);
        System.out.println("Set: " + peopleSet);
    }

//    private static void addElements(Collection collection) {
//        collection.add(new Person1(3, "DKaty"));
//        collection.add(new Person1(4, "CGeorge"));
//        collection.add(new Person1(2, "BTo"));
//        collection.add(new Person1(1, "ABob"));
//    }
}

class Person1 implements Comparable<Person1> {
    private int id;
    private String name;

    public Person1(int id, String name) {
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
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person1 o) {
        if (this.id > o.getId()) {
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {
            return 0;
        }

//        return this.name.compareTo(o.getName());

//        if (this.name.length() > o.getName().length()) {
//            return 1;
//        } else if (this.name.length() < o.getName().length()) {
//            return -1;
//        } else {
//            return 0;
//        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person1 person1 = (Person1) o;

        if (id != person1.id) return false;
        return name != null ? name.equals(person1.name) : person1.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}










