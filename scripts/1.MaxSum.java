import java.util.List;
import java.util.Arrays;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements");
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        
        return largest + secondLargest;
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        System.out.println(findMaxSum(list)); // Output: 20
    }
}