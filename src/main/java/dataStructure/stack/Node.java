package dataStructure.stack;

public class Node<T> {

    private T element;
    private Node<T> reference;

    public Node(T element) {
        this.element = element;
        this.reference = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getReference() {
        return reference;
    }

    public void setReference(Node<T> reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                '}';
    }
}