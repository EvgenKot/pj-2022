import java.util.Scanner;

public class App1 {
    static class SearchTree {
        class Node {
            public Node rightChild = null;
            public Node leftChild = null;
            public Node parent = null;

            public int value;
            public int heightLeft = 0;
            public int heightRight = 0;

            public Node(int value, Node parent) {
                this.value = value;
                this.parent = parent;
            }
        }

        private Node root;

        private Node insertNode(Node curNode, int value, Node parent) {
            if (curNode == null) {
                if (parent != null) {
                    if (parent.value > value)
                        parent.heightLeft++;
                    else
                        parent.heightRight++;
                }
                return new Node(value, parent);
            }

            if (value > curNode.value) {
                curNode.rightChild = insertNode(curNode.rightChild, value, curNode);

                if (curNode.parent != null && curNode.parent.value < value)
                    curNode.parent.heightRight = curNode.heightRight + 1;
            } else if (value < curNode.value) {
                curNode.leftChild = insertNode(curNode.leftChild, value, curNode);
                
                if (curNode.parent != null && curNode.parent.value > value)
                    curNode.parent.heightLeft = curNode.heightLeft + 1; 
            }

            return curNode;
        }

        public void add(int value) {
            root = insertNode(root, value, null);
        }

        // public bool isBalanced() {

        // }

    }

    public static void main(String[] args) {
        SearchTree tree = new SearchTree();
        Scanner in = new Scanner(System.in);
        while (true) {
            int x = in.nextInt();
            if (x == 0)
                break;

            tree.add(x);
        }
        in.close();
        System.out.println("YES");
    }
}
