
class Solution {

    public Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public Node addOne(Node head) {

        // Step 1: Reverse linked list
        head = reverse(head);

        // Step 2: Add one
        int carry = 1;
        Node curr = head;

        while (curr != null) {
            int nodeValue = curr.data;
            int sum = nodeValue + carry;

            int digit = sum % 10;

            // Update current node
            curr.data = digit;

            // Update carry
            carry = sum / 10;

            // If carry remains at the last node
            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
                break;
            }

            curr = curr.next;
        }

        // Step 3: Reverse linked list again
        head = reverse(head);

        return head;
    }
}
