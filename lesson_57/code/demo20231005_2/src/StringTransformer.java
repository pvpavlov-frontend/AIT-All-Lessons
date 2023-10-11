package demo20231005_2.src;

@FunctionalInterface
public interface StringTransformer<T> {
    T transform(T str);
}
