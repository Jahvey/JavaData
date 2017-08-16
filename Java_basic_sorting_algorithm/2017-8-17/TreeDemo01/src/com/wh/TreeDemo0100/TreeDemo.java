package com.wh.TreeDemo0100;



public class TreeDemo {
    public static void main(String[] args) {

        Binary binary=new Binary();
        binary.add("b");
        binary.add("c");
        binary.add("e");
        binary.add("a");
        binary.print();
    }


}

class  Binary{
    private Node root;

    public  void add(String data){
        Node newNode=new Node(data);
        if (this.root==null)root=newNode;//如果根为空的情况
        else{root.addNode(newNode);}

    }


    public  void print(){

        if (this.root!=null)
            this.root.printNode();


    }



}
class Node{
    private  String data;
    private  Node left;
    private  Node right;
    public String getData(){
        return  this.data;
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

    public Node(String data){
        this.data=data;
    }

    public void printNode(){
        if (this.left!=null){
            this.left.printNode();
        }
        System.out.println(this.data);
        if (this.right!=null){
            this.right.printNode();
        }
    }

    public  void addNode(Node newNode) {
            if (newNode.getData().compareTo(this.data)<0){
                if (this.left!=null){
                    this.left.addNode(newNode);
                }else {
                    this.left=newNode;
                }
            }else {
                if (this.right!=null){
                    this.right.addNode(newNode);
                }else {
                    this.right=newNode;
                }
        }
    }



}