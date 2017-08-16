package com.wh.TreeDemo0200;



public class TreeDemo01 {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.add("E");
        bt.add("f");
        bt.add("S");
        bt.add("a");
        bt.add("b");
        bt.add("c");
        bt.add("d");
        bt.print01();
    }
}
class  BinaryTree{
    private  Node root;
    public  void add(String data){
        Node newNode=new Node(data);
        if (this.root!=null){
            this.root.addNode01(newNode);
        }else {
            this.root=newNode;
        }
    }
    public void print01(){
        if (this.root!=null)this.root.printNode01();

    }
}
class  Node{
    private String data;
    private Node left;
    private  Node right;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }


    public void addNode01(Node newNode) {
        if (newNode.getData().compareTo(this.data)<0){
            if (this.left!=null){
                this.left.addNode01(newNode);
            }else {
                this.left=newNode;
            }
        }else {
            if (this.right!=null){
                this.right.addNode01(newNode);
            }else {
                this.right=newNode;
            }
        }
    }

    public void printNode01() {
        if (this.left!=null)this.left.printNode01();
        System.out.println(this.data);
        if (this.right!=null)this.right.printNode01();
    }
}
