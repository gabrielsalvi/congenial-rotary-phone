package dataStructure.tree;

import dataStructure.circularLinkedList.CircularLinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        BinaryTree<Integer> binaryTree = new BinaryTree<>();

        for (Integer number : Arrays.asList(13, 10, 25, 2, 12, 20, 31, 29, 32)) {
            binaryTree.insert(number);
        }

        binaryTree.showPreOrder();
        binaryTree.showInOrder();
        binaryTree.showPostOrder();

    }
}