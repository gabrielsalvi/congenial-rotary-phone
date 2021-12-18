package dataStructure.tree;

public class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T element) {

        Node<T> newNode = new Node<T>(element);
        root = insert(root, newNode);

    }

    public void remove(T element) {

        try {

            Node<T> current = this.root;
            Node<T> father = null;
            Node<T> son = null;
            Node<T> tmp = this.root;

            while (current != null && !current.getElement().equals(element)) {

                father = current;

                if (current.getElement().compareTo(element) < 0)
                    current = current.getLeft();
                else
                    current = current.getRight();

            }

            if (current == null)
                System.out.println("The element was not found!");

            if (father == null) {

                if (current.getRight() == null) {

                    this.root = current.getLeft();

                } else if (current.getLeft() == null) {

                    this.root = current.getRight();

                } else {

                    for (tmp = current, son = current.getLeft();
                        son.getRight() != null;
                        tmp = son, son = son.getLeft()
                    ) {
                        if (son != current.getLeft()) {
                            tmp.setRight(son.getLeft());
                            son.setLeft(this.root.getLeft());
                        }
                    }

                    son.setRight(this.root.getRight());
                    this.root = son;

                }

            } else if (current.getRight() == null) {

                if (father.getLeft() == current)
                    father.setLeft(current.getLeft());
                else
                    father.setRight(current.getLeft());

            } else if (current.getLeft() == null) {

                if (father.getLeft() == current)
                    father.setLeft(current.getRight());
                else
                    father.setRight(current.getRight());

            } else {

                for (tmp = current, son = current.getLeft();
                     son.getRight() != null;
                     tmp = son, son = son.getRight()
                ) {

                    if (son != current.getLeft()) {
                        tmp.setRight(son.getLeft());
                        son.setLeft(current.getLeft());
                    }

                    son.setRight(current.getRight());

                    if (father.getLeft() == current)
                        father.setLeft(son);
                    else
                        father.setRight(son);

                }
            }

        } catch (NullPointerException error) {
            System.out.println("The element was not found!");
        }

    }

    public void showPreOrder() {
        System.out.println("\nShow Pre-Order");
        showPreOrder(this.root);
    }

    public void showInOrder() {
        System.out.println("\nShow In-Order");

        showInOrder(this.root);
    }

    public void showPostOrder() {
        System.out.println("\nShow Post-Order");
        showPostOrder(this.root);
    }

    private void showPreOrder(Node<T> currentNode) {

        if (currentNode == null)
            return;

        System.out.print(currentNode.getElement() + ", ");

        showPreOrder(currentNode.getLeft());
        showPreOrder(currentNode.getRight());

    }

    private void showInOrder(Node<T> currentNode) {

        if (currentNode == null)
            return;

        showInOrder(currentNode.getLeft());
        System.out.print(currentNode.getElement() + ", ");
        showInOrder(currentNode.getRight());

    }

    private void showPostOrder(Node<T> currentNode) {

        if (currentNode == null)
            return;

        showPostOrder(currentNode.getLeft());
        showPostOrder(currentNode.getRight());

        System.out.print(currentNode.getElement() + ", ");

    }

    private Node<T> insert(Node<T> currentNode, Node<T> newNode) {

        if (currentNode == null)
            return newNode;

        if (newNode.getElement().compareTo(currentNode.getElement()) < 0)
            currentNode.setLeft(insert(currentNode.getLeft(), newNode));
        else
            currentNode.setRight(insert(currentNode.getRight(), newNode));

        return currentNode;
    }
}
