// Find Start Point of Detect Cycle

class Main {

    public static Node detectCycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: find start
                Node temp = head;

                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }

                return temp; // start of cycle
            }
        }

        return null; // no cycle
    }
}