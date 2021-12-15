package dataStructure.linkedList;

public class LinkedList<T> {

    private Node<T> reference;

    public LinkedList() {
        this.reference = null;
    }

    public boolean isEmpty() {
        return this.reference == null;
    }

    public int size() {

        int size = 0;

        Node<T> aux = reference;

        while (aux != null) {
            aux = aux.getNext();
            size++;
        }

        return size;
    }

    public void add(T element) {

        if (isEmpty()) {
            this.reference = new Node<>(element);
        } else {
            Node<T> lastNode = getNode(size() - 1);
            lastNode.setNext(new Node<>(element));
        }

    }

    public void add(T element, int index) {

        if (index > this.size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {

            Node<T> node = new Node<>(element, this.reference);
            this.reference = node;

        } else {

            Node<T> previousNode = getNode(index - 1);
            Node<T> node = new Node<>(element, previousNode.getNext());
            previousNode.setNext(node);

        }

    }

    public T remove(int index) {

        checkIndex(index);

        Node<T> nodeToRemove;

        if (index == 0) {

            nodeToRemove = this.reference;
            this.reference = nodeToRemove.getNext();

        } else {

            Node<T> previous = getNode(index - 1);
            nodeToRemove = previous.getNext();
            previous.setNext(nodeToRemove.getNext());

        }

        return nodeToRemove.getElement();
    }

    public T get(int index) {
        return getNode(index).getElement();
    }

    private void checkIndex(int index) {

        if (index > this.size() - 1)
            throw new IndexOutOfBoundsException();

    }

    private Node<T> getNode(int index) {

        checkIndex(index);

        Node<T> node = reference;

        for (int i = 0; i < index; i++)
            node = node.getNext();

        return node;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("\nList: [");
        Node<T> node = reference;

        while (node.getNext() != null) {
            stringBuilder.append(node.getElement()).append(", ");
            node = node.getNext();
        }

        stringBuilder.append(node.getElement()).append("]\n");

        return stringBuilder.toString();

    }
}
