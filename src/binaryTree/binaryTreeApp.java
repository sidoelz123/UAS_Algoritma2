package binaryTree;

public class binaryTreeApp {
    public static void main(String[] args){
        binaryTree tree = new binaryTree();


        treeNode node;
        node = new treeNode(60);
        tree.insert(node);

        node = new treeNode(40);
        tree.insert(node);

        node = new treeNode(30);
        tree.insert(node);

        node = new treeNode(50);
        tree.insert(node);

        node = new treeNode(80);
        tree.insert(node);


        System.out.println("Traversal dengan In Order : ");
        tree.preOrder();
        System.out.println("\nTraversal dengan Pre Order : " );
        tree.postOrder();
        System.out.println("\nTraversal dengan Post Order : " );
        tree.inOrder();
        System.out.println();


    }
}
