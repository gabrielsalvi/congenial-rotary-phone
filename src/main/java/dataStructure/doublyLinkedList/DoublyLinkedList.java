package dataStructure.doublyLinkedList;

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void add(T element) {

        Node<T> newNode = new Node<>(element);

        if (isEmpty()) {

            this.head = newNode;
            this.tail = head;

        } else {

            newNode.setPrevious(tail);
            tail.setNext(newNode);

            tail = newNode;

        }

        this.size++;

    }


    public void add(T element, int index) {

        Node<T> node = new Node<>(element);

        if (index > size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {

            if (head == tail) {

                node.setNext(head);
                tail.setPrevious(node);

                head = node;

            } else {

                node.setNext(head);

                head.setPrevious(node);
                head = node;

            }

        } else if (index == size()) {

            node.setPrevious(tail);

            tail.setNext(node);
            tail = node;

        } else {

            Node<T> nodeInTheIndex = getNode(index);

            node.setPrevious(nodeInTheIndex.getPrevious());
            node.setNext(nodeInTheIndex);

            nodeInTheIndex.getPrevious().setNext(node);
            nodeInTheIndex.setPrevious(node);

        }

        this.size++;

    }

    public T remove(int index) {

        Node<T> nodeToRemove = getNode(index);

        if (head == tail) {

            this.head = null;
            this.tail = null;

        } else if (nodeToRemove == head) {

            head = head.getNext();
            head.setPrevious(null);

        } else if (nodeToRemove == tail) {

            tail = tail.getPrevious();
            tail.setNext(null);

        } else {

            nodeToRemove.getNext().setPrevious(nodeToRemove.getPrevious());
            nodeToRemove.getPrevious().setNext(nodeToRemove.getNext());

        }

        this.size--;

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

        while (node.getNext() != null) {
            stringBuilder.append(node.getElement()).append(", ");
            node = node.getNext();
        }

        stringBuilder.append(node.getElement()).append("]\n");

        return stringBuilder.toString();

    }
}