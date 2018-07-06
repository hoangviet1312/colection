import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void remove(int index) {
        Object newList[] = new Object[elements.length - 1];
        int count=0;
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                continue;
            }
            newList[count] = elements[i];
            count++;
        }
        elements = newList;
    }

    public MyList clone() {
        MyList<E> newList = new MyList<>();
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                continue;
            }
            newList.add((E) elements[i]);
        }
        return newList;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                continue;
            }
            size++;
        }
        return size;
    }

    public void printList() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                System.out.println(elements[i]);
            }
        }
    }

    public boolean contain(E data) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(data)) {
                return true;
            }
        }
        return false;
    }
}
