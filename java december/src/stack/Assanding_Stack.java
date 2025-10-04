//9. Sort a Stack  
//   - Question: Sort a stack in ascending order using another stack.
//   - Input: [3, 1, 4, 2]
//   - Output: [1, 2, 3, 4]
package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Assanding_Stack {
public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 1, 4, 2);
        
        Stack<Integer> input = new Stack<>();
        
        for (int i = 0; i < list.size(); i++) 
        {
            input.push(list.get(i));
        }

        Stack<Integer> tempStack = new Stack<>();

        for (int i = 0; i < list.size(); i++) {
            int temp = input.pop();

       
            int size = tempStack.size();
            
            for (int j = 0; j < size; j++) 
            {
                if (!tempStack.isEmpty() && tempStack.peek() > temp)
                {
                    input.push(tempStack.pop());
                } else 
                {
                    break;  
                }
            }

            tempStack.push(temp);
        }

     
        System.out.println("Sorted Stack (Ascending): " + tempStack);
    }
}

