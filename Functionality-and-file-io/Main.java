import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean escape = false;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of your task list: ");
        String name = scanner.nextLine();

        taskList tasklist = new taskList(name);

        while(escape != true) {

            System.out.print("Enter command number or enter 1 to view command list: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 1) {
                Main.viewCommands();
            } else if (choice == 2) {
                System.out.print("Name of task to add: ");
                String input1 = scanner.nextLine();
                tasklist.addTask(input1);
            } else if (choice == 3) {
                System.out.print("Task to remove: ");
                int input2 = scanner.nextInt();
                tasklist.removeTask(input2);
            } else if (choice == 4) {
                tasklist.viewTasks();
            } else if (choice == 5) {
                escape = true;
            } else if (choice == 6) {
                System.out.print("Task to mark as done: ");
                int input3 = scanner.nextInt();
                tasklist.markDone(input3);
            } else if (choice == 7) {
                System.out.print("Task to ummark as done: ");
                int input4 = scanner.nextInt();
                tasklist.unmarkDone(input4);
            } else if (choice == 8) {
                tasklist.sendToFile(tasklist.name);
            } else if (choice == 9) {
                System.out.print("Name of file to import from (leave out ending): ");
                String input5 = scanner.nextLine();
                tasklist.importFromFile(input5);
            }
        }

        scanner.close();

        System.out.println("You have successfully exited the to-do list");
    }

    static void viewCommands() {
        System.out.println("2: Add Task");
        System.out.println("3: Remove Task");
        System.out.println("4: View Task List");
        System.out.println("5: Close Program");
        System.out.println("6: Mark Task Done");
        System.out.println("7: Unmark Task Done");
        System.out.println("8: Create Text File");
        System.out.println("9: Import From Text File");
    }
}

