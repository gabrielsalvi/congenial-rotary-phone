package dataStructure.stack;

public class Stack<T> {

    private Node<T> top;

    public Stack() {
        this.top = null;
    }

    public T push(T element) {

        Node<T> node = new Node<>(element);
        node.setReference(top);

        top = node;

        return element;
    }

    public T pop() {

        if (this.isEmpty())
            return null;

        Node<T> poppedNode = top;
        top = top.getReference();

        return poppedNode.getElement();
    }

    public T top() {
        return this.top.getElement();
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder("\n--------------------------\nStack\n--------------------------\n");
        Node<T> node = top;

        while (node != null) {
            stringBuilder.append(node.getElement()).append("\n");
            node = node.getReference();
        }

        stringBuilder.append("--------------------------\n");

        return stringBuilder.toString();
    }
}
