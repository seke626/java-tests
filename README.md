# java-tests
A suite of basic tests in Java used for practice

Test 1:
A function that returns the largest sum of any two elements in the given list of positive integers

This implementation finds the largest and second largest elements in a single pass through the list, and then returns their sum. If the list has less than two elements, it throws an IllegalArgumentException.

Test 2:
A function that calculates the minimum number of packages needed to hold a given number of items. If it's not possible to meet the requirements, return -1.

This implementation calculates the number of large packages needed first, then calculates the remaining items. After that, it calculates the number of small packages needed to hold the remaining items. Finally, it checks if all items can be accommodated in the available packages and returns the total number of packages required, or -1 if it's not possible.

Test 3:
A function that calculates the height of a given tree.

The heightHelper method is a recursive function that calculates the height of a given node. The height of a node is the maximum of the heights of its left and right subtrees, plus one (to account for the current node). The height method simply starts the recursion from the root node.

Test 4:
Efficiently find all numbers that occur exactly once in the input collection

This implementation efficiently finds all numbers that occur exactly once in the input collection. It first counts the occurrences of each number using a HashMap, and then collects the numbers with a count of 1 into a HashSet. Finally, it returns the HashSet containing the unique numbers.

Test 5:
Dinosaur egg :)
