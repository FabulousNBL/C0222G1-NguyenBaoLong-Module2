package _10_list.exercise.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList(){
        elements= new Object[DEFAULT_CAPACITY];
    }

//    public MyList(int capacity){
//        elements=new Object[capacity];
//    }
public void ensureCapacity(int minCapacity){

    if (size() >= 0) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }
}

    public void add(int index,E element){
        for (int i = size-1 ; i >= index ; i--) {
            elements[i+1]= elements[i];
        }
        elements[index]=element;
        size++;
    }


    public boolean add(E o){
        if (size() == elements.length) {
            ensureCapacity(5);
        }
        elements[size++] = o;
        return true;
    }

    public int size(){
        return  size;
    }

    public E remove(int index) {
        if (index<0 || index>size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }else for (int i = index; i <size; i++) {
            elements[i]= elements[i+1];
        }
        Object removeElement= elements[index];
        elements[size-1]=null;
        size--;
        return (E) removeElement;
    }
    public E clone(){
        Object[] cMyList = new Object[DEFAULT_CAPACITY];
        if (size() == elements.length) {
            ensureCapacity(5);
        }
        for (int i = 0; i < size(); i++) {
            cMyList[i] = elements[i];
        }
        return (E) Arrays.toString(cMyList);

    }
    public void clear(){
        elements= new Object[DEFAULT_CAPACITY];
        size=0;
    }
    public boolean contains(E o){
        if (indexOf(o)!= -1){
            return true;
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i <size ; i++) {
            if (o==elements[i]){
                return i;
            }
        }
        return -1;
    }


    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    @Override
    public String toString(){
        return "MyList{" +
                "size=" + size +
                ", element=" + Arrays.toString(elements) +
                '}';
    }

}
