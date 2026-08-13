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
    public ListNode reverseList(ListNode head)
    {
       ArrayList<Integer> li=new ArrayList<>();
       while(head!=null)
       {
         li.add(head.val);
         head=head.next;
       } 
       ListNode h=null;
       ListNode t=null;
       for(int i=li.size()-1;i>=0;i--)
       {
          ListNode node=new ListNode(li.get(i));
          if(h==null)
          {
            h=node;
            t=node;
          }
          else
          {
            t.next=node;
            t=t.next;

          }
       }
       return h;
    }
}
