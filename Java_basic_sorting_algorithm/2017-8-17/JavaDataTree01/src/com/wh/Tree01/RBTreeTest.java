package com.wh.Tree01;


import java.util.Random;

/**
 *
 *红黑树的实现
 * */
public class RBTreeTest<T extends  Comparable<T>> {

    static enum Color{
        BLACK,RED
    }

    /**
     *
     *打印出红黑树的代码
     * */
    static class RBPrinter{
        public static void visitNode(RBNode node){
            RBNode n=node;
            if (n!=null)
                System.out.println(n.key
                +"("+(n.color==Color.BLACK?"BLACK":"RED")+")");
        }

    }


    static class RBNode<T extends  Comparable<T>>{
        T key;
        RBNode<T> left,right;
        RBNode<T> parent;
        Color color;
        //构造器
        RBNode(RBNode<T>p,T key,Color color){

            this.key=key;
            this.color=color;
            this.parent=p;
            this.left=null;
            this.right=null;

        }

    }


    private RBNode<T> root;
    //本类的实例化
    public RBTreeTest(){root =null;}
    public boolean isEmpty(){

        return  root==null;
    }

    //找到最大的值
    public T findMax(){
        if (isEmpty())return  null;
        RBNode<T>node = root;
        while ((node.right)!=null){
            node=node.right;
        }
        return node.key;

    }


    //找到最小的值
    public T findMin(){
        if (isEmpty())return  null;
        RBNode<T>node=root;
        while ((node.left)!=null)
            node=node.left;
        return node.key;
    }



    //justice if element contains of tree
    public final boolean contains(T ele){
        RBNode<T> tmp=root;
        int cmp=-1;
        while (tmp!=null){
            cmp=ele.compareTo(tmp.key);
            if (cmp<0){
                tmp=tmp.left;
            }else if (cmp>0){
                tmp=tmp.right;
            }else {
                return  true;
            }
        }
        return  false;
    }



    public final boolean delete(T ele){
        //point to current node
        RBNode<T> cur;

        int cmp;
        if (root==null)return false;

        cur=root;
        while (cur!=null&&(cmp=ele.compareTo(cur.key))!=0){


            if (cmp<0)
                cur=cur.left;
            else
                cur=cur.right;


        }


        if (cur==null){
            return false;
        }

        //如果当前左右子树都有
        if ((cur.left)!=null&&(cur.right)!=null){
            RBNode<T>prev=cur.left;

            while ((prev.right)!=null){
                prev=prev.right;
            }
            cur.key=prev.key;
            cur=prev;

        }

        if ((cur.left)!=null){//如果当期左子节点存在

            if (cur==root){
                root=cur.left;
                root.color=Color.BLACK;
                return  true;
            }
            if (cur.parent.left==cur){
                //如果当前节点父节点的左节点
                cur.parent.left=cur.left;
                cur.left.parent=cur.parent;
            }else {//如果当前节点父节点的 右节点
                cur.parent.right=cur.left;
                cur.left.parent=cur.parent;

            }
            //最后一定记得 要修改节点的颜色
            if (cur.color==Color.BLACK){
                cur.left.color=Color.BLACK;
            }

        }else if ((cur.right)!=null){
            //如果当前的节点 有右子节点
            if (cur==root){
                root=cur.right;
                root.color=Color.BLACK;
                return  true;
            }
            if (cur.parent.left==cur){
                cur.parent.left=cur.right;
                cur.right.parent=cur.parent;
            }else {
                cur.parent.right=cur.right;
                cur.right.parent=cur.parent;

            }
            //最后一定要记得必须要修改颜色
            if (cur.color==Color.BLACK){
                cur.right.color=Color.BLACK;
            }

        }else {
            if (cur==root){
                root=null;
                return  true;

            }

            RBNode<T>todo;
            if (cur.parent.left==cur){
                todo=null;
                cur.parent.left=todo;
            }else {
                todo=null;
                cur.parent.right=todo;
            }
            if (cur.color==Color.BLACK)
            {
                fixupDoubleBlack(todo);
            }

        }
        return true;

    }



    //重新调整一下整个树的颜色情况
    private  final void fixupDoubleBlack(RBNode<T> cur){


        RBNode<T> sibling;
        RBNode<T>p;
        while (cur!=root){
            p=cur.parent;
            if (p.left== cur){
                sibling=p.right;
                if (sibling.color==Color.RED){

                    rotateRight(p);
                    sibling.color=p.color;
                    p.color=Color.BLACK;
                    sibling.left.color=Color.BLACK;
                    return;

                }else if (sibling.right.color==Color.RED){

                    rotateLeft(sibling);
                    sibling.color=Color.RED;
                    sibling.parent.color=Color.BLACK;


                }else {
                    sibling.color=Color.RED;
                    if (p.color==Color.BLACK){
                        cur=p;
                    }else {
                        p.color=Color.BLACK;
                        return;
                    }
                }
            }
        }

    }

    public final void insert(T ele){
        if (root==null){
            //添加根节点
            root=new RBNode<T>(null,ele,Color.BLACK);

            return;

        }else {
            //将该节点添加到合适的叶子节点的位置上
            RBNode<T> parent=null;
            RBNode<T> cur=root;
            int cmp=-1;
            while (cur!=null&&(cmp=ele.compareTo(cur.key))!=0){

                parent=cur;
                if (cmp<0)cur=cur.left;
                else cur=cur.right;

            }

            if (cmp==0){
                //不能添加相同的元素
                try {
                    throw  new Exception("can't insert duplicate key!");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }


            cur=new RBNode<T>(parent,ele,Color.RED);

            if (cmp<0){
                //添加为左孩子
                parent.left=cur;
            }else {
                //添加为右孩子
                parent.right=cur;
            }

//调整各个节点
insertFixup(cur);


        }
    }




private  final  void  insertFixup(RBNode<T>cur){

        RBNode<T>p,g;
        while (cur!=root&&cur.color==Color.RED){
            p=cur.parent;
            if (p.color==Color.BLACK){
                return;
            }

            g=p.parent;
            if (p==g.left){
                //如果p是g的左孩子
                RBNode<T>uncle=g.right;
                if (uncle!=null&&uncle.color==Color.RED){

                    g.color=Color.RED;
                    uncle.color=p.color=Color.BLACK;
                    cur=g;
                }else {
                    if (cur==p.right){
                        cur=rotateLeft(p);
                        cur=cur.left;
                    }
                    cur=rotateRight(g);
                    cur.color=Color.BLACK;
                    cur.left.color=cur.right.color=Color.RED;
                }
            }else{
                //如果p是g的右 子树

                RBNode<T>uncle=g.left;

                if (uncle!=null&&uncle.color==Color.RED){
                    g.color=Color.RED;
                    uncle.color=p.color=Color.BLACK;
                    cur=g;
                }else
                {
                    if (cur==p.left){
                        cur=rotateRight(p);
                        cur=cur.right;
                    }
                    cur=rotateLeft(g);
                    cur.color=Color.BLACK;
                    cur.left.color=cur.right.color=Color.RED;
                }


            }


            root.color=Color.BLACK;
        }
}


    private final RBNode<T> rotateLeft(RBNode<T>p){


        RBNode<T>gr=p.parent;//grandfather
        RBNode<T> ch=p.right;//children
        p.right=ch.left;
        if (ch.left!=null){
            ch.left.parent=p;
        }
        ch.left=p;
        p.parent=ch;

        if (gr!=null){
            //p不是root节点
            if (gr.left==p)//如果p是gr的左孩子
                gr.left=ch;

            else//如果p是gr的右孩子
                gr.right=ch;

        }else {//如果p是root节点
            root=ch;
        }
        ch.parent=gr;
        return ch;


    }


    //定义一个右旋操作
    private  final RBNode<T> rotateRight(RBNode<T>p){

        RBNode<T> gr=p.parent;
        RBNode<T>ch=p.left;
        p.left=ch.right;
        if (ch.right!=null){
            ch.right.parent=p;
        }
        ch.right=p;
        p.parent=ch;
        if (gr!=null){
            if (gr.left==p){
                gr.left=ch;
            }else {
                gr.right=ch;
            }
        }else {
            root=ch;
        }

        ch.parent=gr;
        return ch;
    }


//外部访问的 遍历方法
    public void inOrder(){
        inOrder(root);
    }

    //内部调用 的遍历方法
    private void inOrder(RBNode<T>cur){
        if (cur!=null){
            inOrder(cur.left);
            RBPrinter.visitNode(cur);
            inOrder(cur.right);
        }
    }


    public static void main(String[] args) {
        Random random=new Random();
        RBTreeTest<Integer> rbt=new RBTreeTest<>();
        int tmp=0;
        for(int i=0;i<16;i++){
            tmp=random.nextInt(100);
            try {
                rbt.insert(tmp);

            }catch (Exception e){
                do {
                    tmp=random.nextInt(100);
                }while (rbt.contains(tmp));
                rbt.insert(tmp);
            }

            System.out.println(tmp);
        }
        System.out.println("\nInorder begin:\n");
        rbt.inOrder();
        System.out.println("\nInorder end:\n");
        rbt.delete(tmp);
        System.out.println("\nInorder begin:\n");
        rbt.inOrder();
        System.out.println("\nInorder end:\n");
    }



}
