//2.	Mathematical operations : Write a program to enter a number. Perform following operations using looping, conditionals statements and functions: 
// a.	Check whether the number is Positive, Negative or Zero.
// b.	Check whether the number is Even / Odd.
// c.	Check whether the number is Prime / Non – Prime.
// d.	Take 3 digit number and perform following operations:
// •	Sum of digits for the given number
// •	Reverse the number


class MathematicalOperations {

    // Function to check Positive / Negative / Zero
    static void checkSign(int number) {
        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }

    // Function to check Even / Odd
    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    // Function to check Prime / Non-prime
    static void checkPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is Non-Prime.");
            return;
        }

        boolean isPrime = true;
        // Loop from 2 to sqrt(number) for efficiency
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false; // Found a factor
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime.");
        } else {
            System.out.println(number + " is Non-Prime.");
        }
    }

    // Function to calculate sum of digits (for 3-digit number)
    static void sumOfDigits(int number) {
        int sum = 0, temp = number;
        while (temp != 0) {
            int digit = temp % 10;  // Get last digit
            sum += digit;           // Add digit to sum
            temp /= 10;             // Remove last digit
        }
        System.out.println("Sum of digits of " + number + " = " + sum);
    }

    // Function to reverse a number (for 3-digit number)
    static void reverseNumber(int number) {
        int reverse = 0, temp = number;
        while (temp != 0) {
            int digit = temp % 10;           // Extract last digit
            reverse = reverse * 10 + digit;  // Build reverse number
            temp /= 10;                      // Remove last digit
        }
        System.out.println("Reverse of " + number + " = " + reverse);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Perform operations
        checkSign(number);       // a. Positive/Negative/Zero
        checkEvenOdd(number);    // b. Even/Odd
        checkPrime(number);      // c. Prime/Non-Prime

        // d. Check for 3-digit number
        if (number >= 100 && number <= 999) {
            sumOfDigits(number);
            reverseNumber(number);
        } else {
            System.out.println("Not a 3-digit number, skipping digit operations.");
        }

        scanner.close(); // Close scanner
    }
}
