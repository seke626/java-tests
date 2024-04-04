import java.util.Collection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        // Create a HashMap to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Create a HashSet to store unique numbers with count 1
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumbers.add(entry.getKey());
            }
        }
        
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}