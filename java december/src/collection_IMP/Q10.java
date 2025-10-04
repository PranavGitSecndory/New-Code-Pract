//
//10. Find Next Greater Element  
//    - Question: For each element in an array, find the next greater element using a Stack.
//    - Input: [2, 5, 1, 3, 4]
//    - Output: [5, -1, 3, 4, -1]
package collection_IMP;

import java.util.Arrays;
import java.util.Stack;

public class Q10 {
public static void main(String[] args) {
    int[] arr = {2, 5, 1, 3, 4};
    int[] result = nextGreaterElement(arr);

    System.out.println("Next Greater Elements: " + Arrays.toString(result));
}

public static int[] nextGreaterElement(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    Stack<Integer> stack = new Stack<>(); // will store indices

    for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
            stack.pop();
        }
        res[i] = stack.isEmpty() ? -1 : nums[stack.peek()];
        stack.push(i);
    }

    return res;
}
}
