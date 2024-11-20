package ex04;

import java.util.Arrays;
import java.util.List;

public class SortApp {
    public static void main(String[] args) {
        // 1. sort
        List<Integer> nums = Arrays.asList(5, 3, 1, 4, 2, 5);

        // 정렬을 한 뒤, 중복을 제거하고, 반복문으로 출력한다.
        nums.stream().sorted().distinct().forEach(integer -> System.out.println(integer));



    }
}
