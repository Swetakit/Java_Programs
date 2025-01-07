//import java.util.*;
class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}
public class MergeSortedArray {
    static Node merge(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        Node ans;
        if (l1.val <= l2.val) {
            ans = l1;
            l1 = l1.next;
        } else {
            ans = l2;
            l2 = l2.next;
        }
        Node current = ans;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return ans;
    }
    static void printList(Node mergedhead) {
        Node current = mergedhead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node mergedhead = merge(head1, head2);

        System.out.print("Merged List: ");
        printList(mergedhead);
    }
}
