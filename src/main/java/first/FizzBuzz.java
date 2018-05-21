package first;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    private List<Integer> numbers;

    public FizzBuzz(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void print() {
        convertAll().forEach(System.out::println);
    }

    List<String> convertAll() {
        return this.numbers.stream().map(this::convert).collect(Collectors.toList());
    }

    String convert(Integer i) {
        if (canDivideBy3(i) && canDivideBy5(i)) {
            return "FizzBuzz";

        } else if (canDivideBy3(i)) {
            return "Fizz";

        } else if (canDivideBy5(i)) {
            return "Buzz";
        }
        return i.toString();
    }

    boolean canDivideBy3(int i) {
        return i % 3 == 0;
    }

    boolean canDivideBy5(int i) {
        return i % 5 == 0;
    }

    public static void main(String... args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList());
        new FizzBuzz(numbers).print();
    }
}
