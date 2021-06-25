package com.aniket.binarytree;

import org.junit.Test;
import org.junit.Assert;

public class MyBinaryTreeTest {


    /*Adding 56  and then 30 and then 70*/
    @Test
    public void added3Numbers_IntoBST() {
        MyBinaryTree<Integer> bst = new MyBinaryTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        int size = bst.getSize();
        Assert.assertEquals(3, size);
    }
}
