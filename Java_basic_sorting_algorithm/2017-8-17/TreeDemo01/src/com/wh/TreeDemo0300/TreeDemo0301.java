package com.wh.TreeDemo0300;

public class TreeDemo0301 {
    public static void main(String[] args) {

        Binary binary=new Binary();
        binary.add("E");
        binary.add("a");
        binary.add("D");
        binary.add("F");
        binary.add("j");
        binary.print();
    }
}

class Binary{
    private Node root;
    public void add(String data){
        Node node=new Node(data);
        if (this.root!=null)
            this.root.addNode(node);
        else{
            this.root=node;
        }
    }

    public void print(){
        if (this.root!=null)this.root.printNode();
    }

}
class Node{
    private String data;
    private Node left;
    private Node right;

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

    public Node(String data) {
        this.data = data;
    }

    public void addNode(Node node) {
        if (node.getData().compareTo(this.data)<0){
            if (this.left!=null){
                this.left.addNode(node);
            }else
            {
                this.left=node;
            }
        }else
        {
            if (this.right!=null){
                this.right.addNode(node);
            }else {
                this.right=node;
            }
        }
    }

    public void printNode() {
        if (this.left!=null)this.left.printNode();
        System.out.println(this.data);
        if (this.right!=null)this.right.printNode();
    }
}
