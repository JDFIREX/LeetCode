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

import java.math.BigInteger;

class Solution {
    // public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     BigInteger r = getListNodeNumber(l1).add(getListNodeNumber(l2));
    //     String Sr = r.toString();

    //     ListNode t = null;
    //     for(String s : String.valueOf(r).split("")) {
    //         t = new ListNode(Integer.valueOf(s), t);
    //     }
    //     return t;
    // }

    // public static BigInteger getListNodeNumber(ListNode l) {
    //     BigInteger sum = new BigInteger("0");
    //     BigInteger m = new BigInteger("1");
    //     while(l != null) {
    //         sum = sum.add(m.multiply(new BigInteger(l.val + "")));
    //         l = l.next;
    //         m = m.multiply(new BigInteger("10"));
    //     }
    //     return sum;
    // }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t = null;
        int n = 0;
        while(l1 != null || l2 != null || n != 0) {
            int v1 = 0;
            int v2 = 0;
            if(l1 != null) {
                v1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                v2 = l2.val;
                l2 = l2.next;
            }

            int vs = v1 + v2 + n;
            if(vs >= 10) {
                n = vs / 10;
                vs = vs - 10;
            } else {
                n = 0;
            }
            t = new ListNode(vs, t);
        }

        ListNode r = null;
        while(t != null){
            r = new ListNode(t.val, r);
            t = t.next;
        }
        return r;
    }
}