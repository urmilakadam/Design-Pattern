package behavioral.Strategy.java8;

import java.util.List;
import java.util.function.Predicate;

public class StrategyDemo {

    public static int calculateSum(List<Integer> nums, Predicate<Integer> selector){
        return nums.stream()
                .filter(selector)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 11, 12, 14, 15);

        // Different filtering strategies using lambdas
        Predicate<Integer> allNumSum = num -> true;
        Predicate<Integer> isEvenNum = num -> num % 2 == 0;
        Predicate<Integer> isOddNum = num -> num % 2 != 0;

        int sum = calculateSum(numbers, allNumSum);
        int evenNumSum = calculateSum(numbers, isEvenNum);
        int oddNumSum = calculateSum(numbers, isOddNum);

        System.out.println("Total Sum: " + sum);
        System.out.println("Even Numbers Sum: " + evenNumSum);
        System.out.println("Odd Numbers Sum: " + oddNumSum);
    }
}
