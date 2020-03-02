package Serializable;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) { // try-with-resources
//            FileInputStream fis = new FileInputStream("people.bin"); // не нужно
//            ObjectInputStream ois = new ObjectInputStream(fis); // не нужно
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);
//            ois.close(); // не нужно
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
