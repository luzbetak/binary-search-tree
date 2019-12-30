package binarysearchtree;

/*------------------------------------------------------------------------------------------------*/
public class BinraySearchTree {

    public Node root;

    /*--------------------------------------------------------------------------------------------*/
    public BinraySearchTree insert(int value) {
        Node node = new Node<>(value);

        if (root == null) {
            root = node;
            return this;
        }

        insertRec(root, node);
        return this;
    }
    /*--------------------------------------------------------------------------------------------*/

    private void insertRec(Node lastRoot, Node node) {

        if (lastRoot.value > node.value) {

            if (lastRoot.left == null) {
                lastRoot.left = node;
            } else {
                insertRec(lastRoot.left, node);
            }
        } else {
            if (lastRoot.right == null) {
                lastRoot.right = node;
            } else {
                insertRec(lastRoot.right, node);
            }
        }
    }

    /*--------------------------------------------------------------------------------------------*/
    public int findMinimum() {
        if (root == null) {
            return 0;
        }
        Node currNode = root;
        while (currNode.left != null) {
            currNode = currNode.left;
        }
        return currNode.value;
    }

    /*--------------------------------------------------------------------------------------------*/
    public int findMaximum() {
        if (root == null) {
            return 0;
        }

        Node currNode = root;
        while (currNode.right != null) {
            currNode = currNode.right;
        }
        return currNode.value;
    }

    /*--------------------------------------------------------------------------------------------*/
    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    /*--------------------------------------------------------------------------------------------*/
    private void printInOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.value + ", ");
        printInOrderRec(currRoot.right);
    }

    /*--------------------------------------------------------------------------------------------*/
    public void printPreorder() {
        printPreOrderRec(root);
        System.out.println("");
    }

    /*--------------------------------------------------------------------------------------------*/
    private void printPreOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        System.out.print(currRoot.value + ", ");
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }

    /*--------------------------------------------------------------------------------------------*/
    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

    /*--------------------------------------------------------------------------------------------*/
    private void printPostOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.print(currRoot.value + ", ");

    }
    /*--------------------------------------------------------------------------------------------*/
}
