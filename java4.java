// //4.  4.	Array  Operations : Create an Array of integers and perform following operations as described below : 
// a.	Write a Program that removes duplicate elements from Array.
// b.	Write a Program that print the array in a reverse order.
// c.	Write a program that  count the duplicated values in Array
// d.	Write a Program using 2D array to perform Matrix Addition.



class ArrayOperations {

    // (a) Remove duplicate elements from array
    static int[] removeDuplicates(int[] arr) {
        // Use LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        // Convert back to array
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }
        return uniqueArr;
    }

    // (b) Print array in reverse order
    static void printReverse(int[] arr) {
        System.out.print("Array in reverse order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // (c) Count duplicated values in array
    static void countDuplicates(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int duplicateCount = 0;
        System.out.println("Duplicate values in the array:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCount++;
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }
        }
        if (duplicateCount == 0) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Total distinct duplicated values: " + duplicateCount);
        }
    }

    // (d) Matrix Addition using 2D arrays
    static void matrixAddition(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] sumMatrix = new int[rows][cols];

        // Add elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print result
        System.out.println("Result of Matrix Addition:");
        for (int[] row : sumMatrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main function to test all operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 6, 3};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // (a) Remove duplicates
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));

        // (b) Print reverse
        printReverse(arr);

        // (c) Count duplicates
        countDuplicates(arr);

        // (d) Matrix Addition
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {1, 2, 3}
        };

        matrixAddition(matrix1, matrix2);

        sc.close();
    }
}
