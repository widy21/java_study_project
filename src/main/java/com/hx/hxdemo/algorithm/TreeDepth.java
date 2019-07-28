package com.hx.hxdemo.algorithm;

/*
求二叉树最大深度
 */
public class TreeDepth {

    /*
    节点数据结构
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int getMaxDepth(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int leftDepth = getMaxDepth(node.left);
        int rightDepth = getMaxDepth(node.right);

        return 1+(leftDepth > rightDepth ? leftDepth : rightDepth);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(11);
        TreeNode right = new TreeNode(9);
        TreeNode left1 = new TreeNode(7);
        TreeNode left2 = new TreeNode(8);
        root.left = left;
        root.right = right;
        left.left = left1;
        left1.left = left2;

        System.out.println(new TreeDepth().getMaxDepth(root));
    }
}
