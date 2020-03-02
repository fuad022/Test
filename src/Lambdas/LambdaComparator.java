package Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Python");
        list.add("Java");
        list.add("C");
        list.add("Go");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) return 1;
//                else if (o1.length() < o2.length()) return -1;
//                else return 0;
//            }
//        });

//        list.sort((s1, s2) -> {
//            if (s1.length() > s2.length()) return 1;
//            else if (s1.length() < s2.length()) return -1;
//            else return 0;
//        });

//        list.sort(Comparator.comparingInt(String::length));

        Comparator<String> comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        };
        list.sort(comparator);

        System.out.println(list);
    }
}
