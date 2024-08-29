package co.edu.uptc.models;

import java.util.Iterator;

public class DoubleListIterator<T> implements Iterator<T>{

    private Node<T> currentNode;

    public DoubleListIterator(Node<T> last){
        this.currentNode = last;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new java.util.NoSuchElementException();
        }
        T info = currentNode.getInfo();
        currentNode = currentNode.getBack();
        return info;
    }
}
