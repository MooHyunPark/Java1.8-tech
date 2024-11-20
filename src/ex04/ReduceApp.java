package ex04;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {
        // 1. reduce (조인)
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int sum1 = nums.stream().mapToInt(x -> x).sum();
        System.out.println(sum1);

        int sum2 = nums.stream().reduce(5, (prev, next) -> {
            System.out.println("prev : " + prev);
            System.out.println("next : " + next);
            System.out.println("----------");
            return prev + next;
                });
        System.out.println(sum2);


    }
}
