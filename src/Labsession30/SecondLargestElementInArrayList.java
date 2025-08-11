package Labsession30;
import java.util.*;

public class SecondLargestElementInArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 30, 20, 50, 40));

        Collections.sort(numbers);
        int secondLargest = numbers.get(numbers.size() - 2);

        System.out.println(secondLargest);
    }
}
