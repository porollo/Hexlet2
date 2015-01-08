package java2.lesson3;

public interface IBTree<T extends Comparable<T>> {

    public IBTree getLeft();

    public IBTree getRight();

    public T getValue();

    public int getCount();

    public void add(T value);
}
