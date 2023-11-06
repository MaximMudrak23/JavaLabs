package Task3;

public interface Pair<T> {
    T getFirst();
    T getSecond();
    Pair<T> sum(Pair<T> other);
    Pair<T> sub(Pair<T> other);
    Pair<T> mult(int number);
    Pair<T> div(int number);
}