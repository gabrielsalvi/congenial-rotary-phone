package dataStructure.circularLinkedList;

public class CircularLinkedList<T> {

    private Node<T> head;
    private int size;

    public CircularLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {

        if (isEmpty()) {
            head = new Node<>(element);
            head.setNext(head);
        } else {
            Node<T> lastNode = getNode(size() - 1);
            lastNode.setNext(new Node<>(element, head));
        }

        size++;

    }

    public void add(T element, int index) {

        if (index > this.size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {

            Node<T> node = new Node<>(element, head);
            getNode(size() - 1).setNext(node);
            head = node;

        } else {

            Node<T> previousNode = getNode(index - 1);
            Node<T> node = new Node<>(element, previousNode.getNext());
            previousNode.setNext(node);

        }

        size++;

    }

    public T remove(int index) {

        checkIndex(index);

        Node<T> nodeToRemove;

        if (index == 0) {

            nodeToRemove = head;
            getNode(size() - 1).setNext(head.getNext());
            head = head.getNext();

        } else {

            Node<T> previous = getNode(index - 1);
            nodeToRemove = previous.getNext();
            previous.setNext(nodeToRemove.getNext());

        }

        size--;

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

        Node<T> node = head;

        for (int i = 0; i < index; i++)
            node = node.getNext();

        return node;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("\nList: [");
        Node<T> node = head;

        while (node.getNext() != head) {
            stringBuilder.append(node.getElement()).append(", ");
            node = node.getNext();
        }

        stringBuilder.append(node.getElement()).append("]\n");

        return stringBuilder.toString();

    }
}
