package pers.dhx_.algorithm;

import org.junit.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dhx_
 * @className connect
 * @description TODO
 * @date 2022/7/24 23:06
 */
public class connect {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
        public Node() {}
        public Node(int _val) {
            val = _val;
        }
        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        dfs(root);
        return root;
    }
    public static void dfs(Node root){
        while(root==null) return;
        Node left=root.left;
        Node right=root.right;
        while(left!=null){ // 左孩子 节点不断深入往右走  ， 右孩子 节点往左走， 当两个走到底，也就挨着了
            left=left.right;
            right=right.left;
            left.next=right;
        }
        dfs(root.left);
        dfs(root.right);
    }

    public static int[] twoSum(int[]nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            if(map.containsKey(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
        }
        return null;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer s1=new StringBuffer("");
        StringBuffer s2=new StringBuffer("");
        while(l1!=null){
            s1.append(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.append(l2.val);
            l2=l2.next;
        }
        s1=s1.reverse();
        s2=s2.reverse();
        BigInteger num1=new BigInteger(s1.toString());
        BigInteger num2=new BigInteger(s2.toString());
        BigInteger value=num1.add(num2);
        StringBuffer v=new StringBuffer(value.toString());
        v.reverse();
        String[] split = v.toString().split("");
        int size=split.length;  // 记录数字的 位数
        int cnt=0;
        ListNode head=new ListNode(Integer.parseInt(split[cnt++]));
        ListNode res=head;
        while(--size>0){
            head.next=new ListNode(Integer.parseInt(split[cnt++]));
            head=head.next;
        }
        return  res;
    }
      class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     @Test
    public void test(){
         StringBuffer s1=new StringBuffer("9999999");
         StringBuffer s2=new StringBuffer("999");
//         s1=s1.reverse();
//         s2=s2.reverse();
         BigInteger num1=new BigInteger(s1.toString());
         BigInteger num2=new BigInteger(s2.toString());
         BigInteger value=num1.add(num2);
         StringBuffer v=new StringBuffer(value.toString());
//         v.reverse();
         String[] split = v.toString().split("");
         int size=split.length;  // 记录数字的 位数
         int cnt=0;
         ListNode head=new ListNode(Integer.parseInt(split[cnt++]));
         ListNode res=head;
         while(--size>0){
             head.next=new ListNode(Integer.parseInt(split[cnt++]));
             head=head.next;
         }
         System.out.println(res);
         return  ;
     }
}
