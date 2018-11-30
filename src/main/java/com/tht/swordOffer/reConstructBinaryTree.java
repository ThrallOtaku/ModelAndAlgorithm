package com.tht.swordOffer;

import java.util.Arrays;

/**
 * Created by thrall on 2018/11/21.
 */
public class reConstructBinaryTree {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        int[] nums =new int[]{3,9,20,15,7};
        TreeNode treeNode =new reConstructBinaryTree().createBinaryTree(nums);
        preOrder(treeNode);
        System.out.println(treeNode);
    }

  public static void preOrder(TreeNode treeNode){
        if(treeNode!=null){
            System.out.println(treeNode.val+"");
        }
        if(treeNode.left!=null){
            preOrder(treeNode.left);
        }
        if(treeNode.right!=null){
            preOrder(treeNode.right);
        }
  }

  public static void middleOrder(TreeNode treeNode){
      if(treeNode.left!=null){
          middleOrder(treeNode.left);
      }
      if(treeNode!=null){
          System.out.println(treeNode.val+"");
      }
      if(treeNode.right!=null){
          middleOrder(treeNode.right);
      }
  }

  public static void postOrder(TreeNode treeNode){
      if(treeNode.left!=null){
          postOrder(treeNode.left);
      }
      if(treeNode.right!=null){
          postOrder(treeNode.right);
      }
      if(treeNode!=null){
          System.out.println(treeNode.val+"");
      }
  }


  //TODO 采用二分法来创建平衡二叉树，根结点刚好为数组中间的节点，
  // 根节点的左子树的根是数组左边部分的中间节点，
  // 根节点的右子树是数据右边部分的中间节点；
  // 代码执行结果和示例给出结果不同，但满足平衡二叉树
  public  TreeNode  createBinaryTree(int[] nums){
      if(nums == null || nums.length == 0)
          return null;
      return getTree(nums,0,nums.length - 1);
   }

    public  TreeNode getTree(int []nums,int l,int r){
        if(l <= r){
            int mid = (l+r)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = getTree(nums,l,mid-1);
            node.right = getTree(nums,mid+1,r);
            return node;
        }else{
            return null;
        }
    }

    //例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0||in.length == 0){
            return null;
        }
        //先序遍历的第一个节点是根节点1
        TreeNode node = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++){
            //从中序遍历开始i=3
            if(pre[0] == in[i]){
                //递归调用，根节点的左节点,前序是1-4，中序是0-3,含头不含尾
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                //根节点的右节点，前序是4-8，中序是4-8
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
            }
        }
        return node;
    }


    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;
        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {

        return null;
    }
}



