package Projects;

import java.util.*;
import java.util.stream.Stream;

public class Test15 {
    public static void main(String[] args) {
//        Set<String> hashSet = new HashSet<>();
//        Set<String> linkedHashSet = new LinkedHashSet<>();
//        Set<String> treeSet = new TreeSet<>();
//        List<Integer> arrayList = new ArrayList<>();
//        Map<Integer, Integer> hashMap = new HashMap<>();
//
//        hashMap.put(1, 1);
//        hashMap.put(2, null);
//        hashMap.put(3, null);
//        System.out.println(hashMap);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);
    }
}
