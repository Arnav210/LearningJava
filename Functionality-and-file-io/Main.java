import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean escape = false;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of your task list: ");
        String name = scanner.nextLine();

        System.out.print("Enter the day of the week the task list is for: ");
        String day = scanner.nextLine();

        taskList tasklist = new taskList(name, day);

        while(escape != true) {

            System.out.print("Enter command number or enter 5 to view command list: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Name of task to add: ");
                String input1 = scanner.nextLine();
                tasklist.addTask(input1);
            } else if (choice == 2) {
                System.out.print("Task to remove: ");
                int input2 = scanner.nextInt();
                tasklist.removeTask(input2);
            } else if (choice == 3) {
                tasklist.viewTasks();
            } else if (choice == 4) {
                escape = true;
            } else if (choice == 5) {
                Main.viewCommands();
            }

        }

        scanner.close();

        System.out.println("You have successfully exited the to-do list");
    }

    static void viewCommands() {
        System.out.println("1: Add Task");
        System.out.println("2: Remove Task");
        System.out.println("3: View Task List");
        System.out.println("4: Close Program");
    }

}

