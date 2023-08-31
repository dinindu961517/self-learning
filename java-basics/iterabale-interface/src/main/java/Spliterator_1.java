import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Spliterator_1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Spliterator<Integer> spliterator = numbers.spliterator();
        Stream<Integer> stream = StreamSupport.stream(spliterator, true);

        stream.sequential().forEach(System.out::println);
    }
}
