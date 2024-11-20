package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupApp {
    public static void main(String[] args) {
        // 1. Group
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "anna");

        // 리턴 타입 : Map<Character, List<String>>
        // 최근 버전은 var로 모든 형을 대체해서 쓸 수 있게 패치되었다.
        var groupData =  names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(groupData);


    }
}
