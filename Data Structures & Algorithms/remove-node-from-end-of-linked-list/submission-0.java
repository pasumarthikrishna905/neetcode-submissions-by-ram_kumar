/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
         int c=0;
         ListNode temp1=head;
         while(head!=null)
         {
            c++;
            head=head.next;
         }
         int k=c-n+1;
         if(k==1)
         {
            return temp1.next;
         }
         ListNode temp=null;
         temp=temp1;
         for(int i=1;i<k-1;i++)
         {
            temp=temp.next;
         }
         temp.next=temp.next.next;
         return temp1;


    }
}
