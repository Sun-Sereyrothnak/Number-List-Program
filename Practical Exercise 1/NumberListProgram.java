import java.util.Scanner;

public class NumberListProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[100]; 
        int count = 0; 
        
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Input a list numbers");
            System.out.println("2. View all of the input numbers");
            System.out.println("3. Exit");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of numbers to input: ");
                    int numCount = scanner.nextInt();
                    
                    System.out.println("Enter the numbers:");
                    for (int i = 0; i < numCount; i++) {
                        numbers[count] = scanner.nextInt();
                        count++;
                    }
                    break;
                
                case 2:
                    System.out.println("\nNumbers entered:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(numbers[i]);
                    }
                    break;
                
                case 3:
                    System.out.println("Exiting program!");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
        }
        
        scanner.close();
    }
}
