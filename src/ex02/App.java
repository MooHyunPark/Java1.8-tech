package ex02;

// 1. 람다는 인터페이스로 만든다.
// 2. 인터페이스에는 메서드가 하나만 존재해야 한다.
// 3. 메서드가 인터페이스를 매개변수로 받고 있으면, 행위를 달라고 하는 의미
// 4. 람다에서는 매개변수에 타입을 생략 가능하다.
public class App {
    public static void main(String[] args) {
        // 괄호 안은 매개 변수 자리
        MyConsumer<Integer> r1 = (data) -> {
            System.out.println("소비할 데이터 : " + data);
        };
        r1.accept(1); // 출력 문구 = 소비할 데이터 : 1


        // good 문자열을 반환하는 람다식
        // return과 중괄호를 생략하여도 정상적으로 작동한다. (r2 와 r3는 같다.)
        MySupplier<String> r2 = () -> { return "good"; };
        MySupplier<String> r3 = () -> "good";
        System.out.println(r2.get() + "/" + r3.get()); // 출력 문구 = good/good


        // 받은 문자열의 길이값을 반환하는 람다식
        MyFunction<String, Integer> r4 = (String s) -> s.length();
        System.out.println("Length of 'hello': " + r4.apply("hello")); // 출력 문구 = Length of 'hello': 5


        // 숫자가 짝수인지 확인하는 람다식
        MyPredicate<Integer> r5 = (Integer x) -> x % 2 == 0;
        System.out.println(r5.apply(3)); // 출력 문구 = false
    }
}
