package ex03;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        String data1 = null;
        Optional<String> op1 = Optional.ofNullable(data1);

        if(op1.isPresent()) {
            String r1 = op1.get();
            System.out.println("r1 : " + r1);
        }


        // 값이 없으면 다른 값을 리턴한다.
        String data2 = null;
        String r2 = Optional.ofNullable(data2).orElseGet(() -> "null입니다.");
        System.out.println("r2 : " + r2); // r2 : null입니다. 출력


        // 값이 없으면 예외를 던진다. (예외 설정 가능)
        String data3 = null;
        String r3 = Optional.ofNullable(data3).orElseThrow(() -> new RuntimeException("null 예외"));
        // data3가 null 이면 RuntimeException 예외가 발생
    }
}
