package datastructure.ArrayList.MyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private E[] elements ;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    };

    public MyList(int size, E[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public void ensureCapa() {
        int newSize = DEFAULT_CAPACITY * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E object) {
        if(size == elements.length) {
            ensureCapa();
        }
        elements[size++] = object;
    }

    public E get(int index) {
       if(index < 0 || index > elements.length){
           throw new IndexOutOfBoundsException("Index" + index + ", size " + index );
       }
       return elements[index];
    }




}
