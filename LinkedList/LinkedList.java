package LinkedList;

public class LinkedList {

    ListNode head;
    int size =0;

    class ListNode {
        int val;
        ListNode next;

        ListNode(){

        }
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    static void addNode(ListNode node){
        if(head==null){
            head = node;
        }else{
            ListNode temp =head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
        size++;
    }

    void addVal(int node){
        if(head==null){
            head = new ListNode(node);
        }else{
            ListNode temp =head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new ListNode(node);
        }
        size++;
    }

    void display(){
        if(head==null){
            return;
        }
        while(head != null){
            System.out.print(head.val + "->");
            head=head.next;
        }
        System.out.print("tail");
    }

    ListNode insertRec(int ind, int val){
        head=insertRec(head, ind,val);
        return head;
    }

    ListNode insertRec(ListNode node,int ind,int val){
        if(ind==0 ){
            ListNode n = new ListNode(val,node);
            return n;
        }
        node.next=insertRec(node.next, ind--, val);
        return node;
    }

    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        L.addVal(1);
        L.addVal(2);
        L.addVal(4);
        L.addVal(5);
        L.display();
        System.out.println();
        System.out.println(L.insertRec(1, 3).val);
        L.display();
        
    }

}
