/*
 * DO NOT EDIT THIS FILE
 */

import java.util.ArrayList;


public class SkipListNode{
    public int value;
    public int height;
    public ArrayList<SkipListNode> next;

    SkipListNode(int key,int height){
        value = key;
        this.height = height;
        next = new ArrayList<SkipListNode>(height);
    }

    public static void main(String[] args) {
        ArrayList< Integer > a=new ArrayList<>(1);
        System.out.println(a);
        a.add( 3);
        System.out.println(a);

    }
}