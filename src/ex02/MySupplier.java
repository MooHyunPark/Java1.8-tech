package ex02;
// 입력 없이 값을 반환(return)
@FunctionalInterface
public interface MySupplier<T> {
    T get();
}
