package Projects;

import java.awt.event.ActionListener;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
//        Runnable runnable = () -> System.out.println("hello");
//        ActionListener actionListener = (event) -> System.out.println("event");
//        Predicate<Integer> predicate = x -> x > 5;
//        System.out.println(predicate.test(3));
//        Consumer<Integer> consumer = x -> System.out.println(x);
//        consumer.accept(3);
        Function<Integer, String> function = x -> x.toString();
//        System.out.println(function.apply(3));

    }
}
interface MyPredicate<T> {
    void apply(T t);
}
