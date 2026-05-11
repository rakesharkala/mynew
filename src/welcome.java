import java.util.Scanner;

public class welcome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String x;

        System.out.println("Welcome buddy to Actual coding name");
        System.out.println("================================================");

        do {
            System.out.println("Select an option:");
            System.out.println("1. Course planning future");
            System.out.println("2. Completed course");
            System.out.println("3. Pending items");
            System.out.println("4. Plan of action");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("List of items:");
                    System.out.println("Coding: PolicyCenter, PCF, DataModel, Rules, Gosu");
                    System.out.println("Git, GitHub, Bitbucket");
                    System.out.println("Story cards & workflows");
                    System.out.println("Physical exercise & self improvement");
                    break;

                case 2:
                    System.out.println("Basics revised");
                    break;

                case 3:
                    System.out.println("Pending: Java practice & integration");
                    break;

                case 4:
                    System.out.println("Following planned schedule");
                    break;

                default:
                    System.out.println("Invalid option");
            }

            System.out.println("Type 'stop' to exit or any key to continue:");
            x = sc.next();

        } while (!x.equalsIgnoreCase("stop")); //

        System.out.println("================================================");
        System.out.println("Program ended.");
        sc.close();
    }
}