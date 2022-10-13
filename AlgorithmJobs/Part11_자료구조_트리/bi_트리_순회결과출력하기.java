package Part11_자료구조_트리;

import java.util.Scanner;

public class bi_트리_순회결과출력하기 {
    private static Tree[] trees = null;
    
    private static class Tree {
        private int left = -1, right = -1, root;
 
        public int getLeft() {
            return left;
        }
 
        public void setLeft(int left) {
            this.left = left;
        }
 
        public int getRight() {
            return right;
        }
 
        public void setRight(int right) {
            this.right = right;
        }
 
        public int getRoot() {
            return root;
        }
 
        public void setRoot(int root) {
            this.root = root;
        }
 
 
        public Tree() {
        }
 
        public Tree(int root) {
            this.root = root;
        }
 
 
        public String preorder() {
            String result = "";
 
            result += root;
            if (left != -1) {
                if (!result.equals("")) result += " ";
                result += trees[left].preorder();
            }
            if (right != -1) {
                if (!result.equals("")) result += " ";
                result += trees[right].preorder();
            }
 
            return result;
        }
 
        public String inorder() {
            String result = "";
 
            if (left != -1) {
                if (!result.equals("")) result += " ";
                result += trees[left].inorder();
            }
            if (!result.equals("")) result += " ";
            result += root;
            if (right != -1) {
                if (!result.equals("")) result += " ";
                result += trees[right].inorder();
            }
 
            return result;
        }
 
        public String postorder() {
            String result = "";
 
            if (left != -1) {
                if (!result.equals("")) result += " ";
                result += trees[left].postorder();
            }
            if (right != -1) {
                if (!result.equals("")) result += " ";
                result += trees[right].postorder();
            }
            if (!result.equals("")) result += " ";
            result += root;
 
            return result;
        }
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int size = Integer.parseInt(scan.nextLine());
        trees = new Tree[size];
 
        for (int i = 0; i < size; i++) {
        	
            String line = scan.nextLine();
            String[] values = line.split(" ");
 
            int index = Integer.parseInt(values[0]);
            int left = Integer.parseInt(values[1]);
            int right = Integer.parseInt(values[2]);
 
            if (trees[index] == null) {
                trees[index] = new Tree(index);
            }
            trees[index].setLeft(left);
            trees[index].setRight(right);
        }
 
        System.out.println(trees[0].preorder());
        System.out.println(trees[0].inorder());
        System.out.println(trees[0].postorder());
    }
}
