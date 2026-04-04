/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;

        // Pass 1: Create all new nodes and map them to originals
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Pass 2: Connect the next and random pointers for the copies
        temp = head;
        while (temp != null) {
            Node copy = map.get(temp);
            // getOrDefault handles the null cases for the end of the list
            copy.next = map.getOrDefault(temp.next, null);
            copy.random = map.getOrDefault(temp.random, null);
            temp = temp.next;
        }

        return map.get(head);
    }
}