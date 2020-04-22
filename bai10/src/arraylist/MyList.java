package arraylist;
import java.lang.reflect.Array;
import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(int i){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public int getLength(){
        return elements.length;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size == elements.length){
            this.ensureCapa();
        }
        elements[size++] = e;
    }
    public void add(E e,int index){
        if(size == elements.length){
            this.ensureCapa();
        }
        for(int i = elements.length;i > index;i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
    }
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
    public E remove (int index){
        E holder = (E) elements[index];
        for(int i = index;i<this.getSize();i++){
            elements[i]=elements[i+1];
        }
        elements[getSize()]=null;
        this.setSize(this.getSize()-1);
        return holder;
    }
    public void clear(){
        for(int i= 0 ; i < elements.length;i++){
            elements[i] = null;
        }
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++){
            if (e.equals(elements[i])){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++){
            if (e.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString(){
        String result="";
        for (int i=0;i<elements.length;i++){
            result+=elements[i]+" ";
        }
        return result;
    }

}

