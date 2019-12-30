package binarysearchtree;

public class App {

    /*--------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {
        BinraySearchTree bst = new BinraySearchTree();
        bst.insert(40)
                .insert(25)
                .insert(78)
                .insert(10)
                .insert(1003)
                .insert(17)
                .insert(32)
                .insert(30)
                .insert(38)
                .insert(78)
                .insert(50)
                .insert(93);

        System.out.println("Inorder traversal");
        bst.printInorder();

        System.out.println("Preorder Traversal");
        bst.printPreorder();

        System.out.println("Postorder Traversal");
        bst.printPostorder();

        System.out.println("The minimum value in the BST: " + bst.findMinimum());
        System.out.println("The maximum value in the BST: " + bst.findMaximum());

    }
    /*--------------------------------------------------------------------------------------------*/    
}
