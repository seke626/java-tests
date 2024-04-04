public class Shipping {
    public static int minimalNumberOfPackages(int items, int availableLargePackages, int availableSmallPackages) {
        if (items <= 0 || availableLargePackages < 0 || availableSmallPackages < 0) {
            return -1; // Invalid input
        }

        int largePackagesNeeded = Math.min(items / 5, availableLargePackages);
        int remainingItems = items - largePackagesNeeded * 5;

        int smallPackagesNeeded = Math.min(remainingItems, availableSmallPackages);

        if (largePackagesNeeded * 5 + smallPackagesNeeded < items) {
            return -1; // Not enough packages to hold all items
        }

        return largePackagesNeeded + smallPackagesNeeded;
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(16, 2, 10)); // Output: 8
    }
}