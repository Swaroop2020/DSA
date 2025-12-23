package org.example.services;

///  TODO revisit
/// LEETCODE: 457
public class CircularArrayLoop {

    public boolean calculate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;

            int slow = i;
            int fast = i;
            boolean forward = nums[i] > 0;

            while (true) {
                slow = nextIndex(nums, slow, forward);
                fast = nextIndex(nums, fast, forward);
                if (fast != -1) {
                    fast = nextIndex(nums, fast, forward);
                }

                if (slow == -1 || fast == -1) break;

                if (slow == fast) {
                    // single element loop is invalid
                    if (slow == nextIndex(nums, slow, forward)) break;
                    return true;
                }
            }

            // mark visited nodes as 0
            int idx = i;
            while (nums[idx] != 0 && (nums[idx] > 0) == forward) {
                int next = ((idx + nums[idx]) % n + n) % n;
                nums[idx] = 0;
                idx = next;
            }
        }
        return false;
    }

    private int nextIndex(int[] nums, int curr, boolean forward) {
        boolean direction = nums[curr] > 0;
        if (direction != forward) return -1;

        int n = nums.length;
        int next = ((curr + nums[curr]) % n + n) % n;
        return next;
    }
}
