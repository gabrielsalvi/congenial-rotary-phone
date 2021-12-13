package dataStructure.queue;

public class Queue<T> {

    private Node<T> lastElement;

    public Queue() {
        this.lastElement = null;
    }

    public boolean isEmpty() {
        return this.lastElement == null;
    }

    public T first() {

        Node<T> firstNode = lastElement;

        while (firstNode.getReference() != null)
            firstNode = firstNode.getReference();

        return firstNode.getElement();

    }

    public void enqueue(T element) {
        Node<T> node = new Node<>(element);
        node.setReference(lastElement);

        lastElement = node;
    }

    public T dequeue() {

        Node<T> aux = lastElement;
        Node<T> dequeuedNode;

        while (aux.getReference().getReference() != null)
            aux = aux.getReference();

        dequeuedNode = aux.getReference();
        aux.setReference(null);

        return dequeuedNode.getElement();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("\n--------------------------\nQueue\n--------------------------\n");
        Node<T> node = lastElement;

        while (node != null) {
            stringBuilder.append(node.getElement()).append("\n");
            node = node.getReference();
        }

        stringBuilder.append("--------------------------\n");

        return stringBuilder.toString();

    }
}
