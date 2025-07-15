import java.util.Scanner;
public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Menu ======");
            System.out.println("1. Print numbers from 1 to 10");
            System.out.println("2. Check if number is even or odd");
            System.out.println("3. Display day name (1–7)");
            System.out.println("4. Print multiplication table (1 to 10)");
            System.out.println("5. Count digits in a number");
            System.out.println("6. Reverse a number");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printNumbers();
                    break;
                case 2:
                    checkEvenOdd(scanner);
                    break;
                case 3:
                    displayDayName(scanner);
                    break;
                case 4:
                    multiplicationTable(scanner);
                    break;
                case 5:
                    countDigits(scanner);
                    break;
                case 6:
                    reverseNumber(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }

        } while (choice != 0);
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void checkEvenOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static void displayDayName(Scanner scanner) {
        System.out.print("Enter a number (1–7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day number");
        }
    }

    public static void multiplicationTable(Scanner scanner) {
        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void countDigits(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }

    public static void reverseNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}

