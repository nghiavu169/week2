import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public MyList(Object[] newElements) {
        elements = new Object[DEFAULT_CAPACITY];
        elements = Arrays.copyOf(newElements, DEFAULT_CAPACITY);
    }

    public void ensure() {
        int newCap = elements.length * 2;
        elements = Arrays.copyOf(elements, newCap);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensure();
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size){
            return (E) "chiu";
        }else {
            E removed = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;
            size --;
            return removed;
        }
    }

    public int getSize() {
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null){
                size ++;
            }
        }
        return size;
    }

    public MyList<E> clone() {
        return new MyList<>(elements);
    }

    public boolean contains(E o) {
        for (Object element : elements) {
            if (element == o) return true;
        }
        return false;
    }

    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                index = i;
            }
        }
        return index;
    }

    public boolean add(E element) {
        if (this.getSize() < elements.length){
            int size = this.getSize();
            elements[size] = element;
            return true;
        }else return false;
    }

    public void ensureCapacity(int minCapacity) {
        elements = Arrays.copyOf(elements, minCapacity);
    }

    public E get(int index) {
        if (index >= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        Arrays.fill(elements, null);
        size = 0;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
