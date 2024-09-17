package co.edu.uptc.models;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DoubleList<T> implements List<T>{

    private Node<T> header;
    private Node<T> lastNode;
    public int size = 0;

    public DoubleList(){
        header = null;
        lastNode = null;
    }

    @Override
    public boolean add(T e) {
        Node<T> newNode = new Node<T>();
        newNode.setInfo(e);
        size++;
        if(header == null){
            header = newNode;
            lastNode = header;
        }else{
            lastNode.setNext(newNode);
            newNode.setBack(lastNode);
            lastNode = newNode;
        }
        return true;
    }
    
    @Override
    public boolean isEmpty() {
        return header == null;
    }

    // test algoritm 
    public void showList(){
        Node<T> aux =  header;
        while (aux!=null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        Node<T> current;
        if (index < size / 2) {
            current = header;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        } else {
            current = lastNode;
            for (int i = size - 1; i > index; i--) {
                current = current.getBack();
            }
        }
        return current.getInfo();
    }
    
    @Override
    public T set(int index, T element) {
        Node<T> current;
        if (index < size / 2) {
            current = header;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        } else {
            current = lastNode;
            for (int i = size - 1; i > index; i--) {
                current = current.getBack();
            }
        }

        T oldInfo = current.getInfo();
        current.setInfo(element);
        return oldInfo;
    }


    @Override
    public Iterator<T> iterator() {
        return new DoubleListIterator<>(lastNode);
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }
    @Override
    public <T> T[] toArray(T[] a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }
    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'containsAll'");
    }
    @Override
    public boolean addAll(Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
    }
    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public void add(int index, T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public int indexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }
    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }
    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }
    @Override
    public ListIterator<T> listIterator(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }
    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subList'");
    }    
    
}