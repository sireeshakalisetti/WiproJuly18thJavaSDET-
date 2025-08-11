package Labsession30;
import java.util.*;

public class MaxElementFromAL {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(15);
        num.add(42);
        num.add(8);
        num.add(23);
        num.add(67);
        num.add(31);

        int max = Collections.max(num);

        System.out.println(max);
    }
}
