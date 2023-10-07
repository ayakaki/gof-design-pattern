package iterator_pattern.common;

public interface Iterator<T> {
    public abstract boolean hasNext();
    public abstract T next();
}
