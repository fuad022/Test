package Generics;

public class Program {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.print(people);
        printer.print(numbers);
    }
}

class Printer {
    public <T> void print(T[] items) {
        for (T item : items) {
            System.out.println(item);
        }
    }
}