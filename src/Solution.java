import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static void main(String[] args) {

        System.out.println(isValid("(([](){}))"));
    }

    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        byte[] sc = s.getBytes();
        HashSet<Integer> done = new HashSet<>();
        while (true) {
            int sub = 0;
            for (int i = 0; i < sc.length; i++) {
                while (done.contains(i)) {
                    i++;
                }
                int left = i;
                int right = left + 1;
                while (done.contains(right)) {
                    right++;
                }
                if (i >= sc.length) break;
                if (right >= sc.length) break;
                if (isT(sc[left], sc[right])) {
                    done.add(left);
                    done.add(right);
                    sub++;
                }

            }
            if (sub == 0) break;
        }
        return done.size() == sc.length;
    }

    public static boolean isT(byte a, byte b) {
        return (a == 40 && b == 41) || (a == 123 && b == 125) || (a == 91 && b == 93);
    }
}