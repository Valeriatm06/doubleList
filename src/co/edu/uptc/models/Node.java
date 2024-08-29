package co.edu.uptc.models;

public class Node<T> {
    private T info;
    private Node<T> next;
    private Node<T> back;
    
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    public Node<T> getBack() {
        return back;
    }
    public void setBack(Node<T> back) {
        this.back = back;
    }

    
    
}
