/**
 * BinaryTreeTester.java
 *
 * Created by Calvin Wong on 11/3/14.
 *
 * Tester for BinaryTree
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BinaryTreeTester {

    public static void main(String[] args) {

        FileReader file = null;

        try {
            file = new FileReader("TestTree.txt"); // open file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(file);
        BinaryTree<String> tree = null;

        try {
            tree = BinaryTree.readBinaryTree(br); // read tree

            System.out.println("\nEntire tree: \n" + tree); // prints entire tree
            System.out.println("\nTree height: " + tree.getHeight()); // prints height of tree
            System.out.println("\nLeft Sub Tree: \n" + tree.getLeftSubtree()); // prints left sub tree
            System.out.println("\nRight Sub Tree: \n" + tree.getRightSubtree()); // prints right sub tree
            System.out.println("\nPreOrder: \n" + tree.preorderToString()); // prints preOrder to string
            System.out.println("\nInOrder: \n" + tree.inorderToString()); // prints inOrder to string
            System.out.println("\nPostOrder: \n" + tree.postorderToString()); // prints postOrder to string
            System.out.println("\nNumber of leafs: " + tree.leaves()); // prints number of leaves in tree
            tree.defoliate();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (br != null) {
                    br.close(); // close reader
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
} // end of class

