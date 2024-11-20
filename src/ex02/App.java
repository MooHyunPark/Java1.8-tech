package ex02;

// 1. 람다는 인터페이스로 만든다.
// 2. 인터페이스에는 메서드가 하나만 존재해야 한다.
// 3. 메서드가 인터페이스를 매개변수로 받고 있으면, 행위를 달라고 하는 의미
// 4. 람다에서는 매개변수에 타입을 생략 가능하다.
// (람다식과 람다표현식은 다르다. (람다 표현식은 반드시 리턴을 함))
public class App {
    public static void main(String[] args) {
        // 괄호 안은 매개 변수 자리
        MyConsumer<Integer> r1 = (data) -> {
            System.out.println("소비할 데이터 : " + data);
        };
        r1.accept(1);


        // return과 중괄호를 생략하여도 정상적으로 작동한다.
        MySupplier<String> r2 = () -> { return "good"; };
        MySupplier<String> r3 = () -> "good";
        String msg = r3.get();

        // 결과 출력 System.out.println("Length of 'hello': " + stringLength.apply("hello")); // 출력: 5
        MyFunction<String, Integer> r4 = (String s) -> s.length();

        // 숫자가 짝수인지 확인하는 람다식
        MyPredicate<Integer> r5 = (Integer x) -> x % 2 == 0;
    }
}
