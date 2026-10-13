
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode a = head.next;
        ListNode newHead = reverseList(a);

        a.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right)
            return head;

        ListNode a = null, b = null, c = null, d = null;
        int pos = 1;
        ListNode temp = head;

        while (temp != null) {
            if (pos == left - 1) a = temp;
            if (pos == left) b = temp;
            if (pos == right) c = temp;
            if (pos == right + 1) d = temp;

            temp = temp.next;
            pos++;
        }

        if (a != null) a.next = null;
        c.next = null;

        reverseList(b);

        if (a != null) {
            a.next = c;
        } else {
            head = c;
        }

        b.next = d;

        return head;
    }
}
