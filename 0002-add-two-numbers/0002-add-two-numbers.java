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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;

        // Sets the default carry amount
        int carry = 0;

        while (l1 != null || l2 != null) {
            // Initializes the sum
            int sum = 0 + carry;

            // Adds the number from the first list to sum
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Adds the number from the second list to sum
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Carry will be the first digit, sum will be the second digit (9 + 9 = 18 -> sum digit will be 8, carry digit will be 1)
            carry = sum / 10;
            sum = sum % 10;
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
        }

        if (carry == 1) pointer.next = new ListNode(1);

        return result.next;

    }
}