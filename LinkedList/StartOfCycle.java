package LinkedList;

public class StartOfCycle {
        static class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }
        public static void main(String[] args) {
            ListNode l1 = new ListNode(3);
            ListNode l2 = new ListNode(9);
            ListNode l3 = new ListNode(0);
            ListNode l4 = new ListNode(-4);
            l1.next = l2; l2.next = l3; l3.next = l4; l4.next=l2;

            int length = lengthOfCycle(l1);
            
            ListNode s = l1, f = l1;
            for(int i=0;i<length;i++){
                s = s.next;
            }
            while(f != s){
                f=f.next; s=s.next;
            }
            System.out.println(f.val);
        }

        private static int lengthOfCycle(ListNode l1) {
            ListNode s = l1.next, f = l1.next.next;
            while (s!=f) {
                if(s.next == null || f.next == null){
                    return -1;
                }
                s = s.next;
                f = f.next.next;
            }
            return count(s,f);
        }
        
        private static int count(ListNode s, ListNode f) {
            int ans =1;
            s=s.next;
            while(s != f){
                s=s.next;
                ans++;
            }
            return ans;
        }
}
