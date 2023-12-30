//  2. Add Two Numbers
//  https://leetcode.com/problems/add-two-numbers/

package LinkedList;

public class AddTwoNum {
    class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = getNumber(l1);
        int num2 = getNumber(l2);
        System.out.println(num1 + " + " + num2 + " = "+ num1+num2);
        int sum = num1+num2;
        return numToList(sum);
    }

    static int getNumber(ListNode node){
        int sum = 0 , e=1;
        while(node != null){
            sum = node.val*e + sum;
            e*=10;
            node = node.next;
        }
        return sum;
    }

    static ListNode numToList(int num){
        ListNode ans = new ListNode(12,null)
        return ans;
    }
    
    public static void main(String[] args) {
        AddTwoNum obj = new AddTwoNum();

     ListNode l13 = new ListNode(3,null);
     ListNode l12 = new ListNode(4,l13);
     ListNode l1 = new ListNode(2,l12);

     ListNode l23 = new ListNode(4,null);
     ListNode l22 = new ListNode(6,l23);
     ListNode l2 = new ListNode(5,l22);
     obj.addTwoNumbers(l1, l2);
    } 
}
