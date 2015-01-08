package java2.lesson3;

public class BTree<T extends Comparable<T>> implements IBTree<T> {

    private IBTree<T> left;
    private IBTree<T> right;
    private int count;
    private final T value;

    public BTree(IBTree<T> left, IBTree<T> right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    @Override
    public IBTree getLeft() {
        return left;
    }

    @Override
    public IBTree getRight() {
        return right;
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void add(T value) {
        if (value.equals(getValue()))
            count++;
        else if (value.compareTo(getValue()) > 0) {
            if (getLeft() == null)
                setLeft(new BTree<>(null, null, value));
            else
                getLeft().add(value);
        } else
            getRight().add(value);
    }

    private void setLeft(IBTree<T> left){
        this.left = left;
    }
    private void setRight(IBTree<T> right){
        this.right = right;
    }



}
