package ex02;

// 입력을 받아서 논리값을 반환
@FunctionalInterface
public interface MyPredicate<T> {
    boolean apply(T t);
}
