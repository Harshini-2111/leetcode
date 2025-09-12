// Last updated: 12/09/2025, 19:18:17
import java.util.*;

class Solution {
    
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            diff[start]++;
            if (end + 1 < n) {
                diff[end + 1]--;
            }
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (sum < nums[i]) {
                return false;
            }
        }
        return true;
    }

   
    public boolean isZeroArrayHeap(int[] nums, int[][] queries) {
        Arrays.sort(queries, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int queryPos = 0;
        for (int i = 0; i < nums.length; i++) {
           
            while (queryPos < queries.length && queries[queryPos][0] == i) {
                minHeap.offer(queries[queryPos][1]);
                queryPos++;
            }
            
            if (minHeap.size() < nums[i]) {
                return false;
            }
            
            
            while (!minHeap.isEmpty() && minHeap.peek() == i) {
                minHeap.poll();
            }
        }
        return true;
    }
}