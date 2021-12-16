package dataStructure.doublyLinkedList;

public class Node<T> {

    private T element;
    private Node<T> next;
    private Node<T> previous;

    public Node(T element) {
        this.element = element;
        this.next = null;
        this.previous = null;
    }

    public Node(T element, Node<T> previous, Node<T> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                '}';
    }
}