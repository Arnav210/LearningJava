import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class taskList {

    String name;
    ArrayList<String> tasks;

    public taskList(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    void viewTasks() {
        System.out.println("-----------------------------------------------------------------");
        for(int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 + ". " + tasks.get(i));
        }
        System.out.println("-----------------------------------------------------------------");
    }

    void addTask(String taskName) {
        tasks.add(taskName);
    }

    void removeTask(int taskNum) {
        tasks.remove(taskNum - 1);
    }

    void markDone(int taskNum) {
        String lastChar = tasks.get(taskNum - 1);
        if (lastChar.endsWith("\u2713")) {
            System.out.println("That is already marked as done");
        } else {
            tasks.set(taskNum - 1, tasks.get(taskNum - 1) + " \u2713");
        }
    }

    void unmarkDone(int taskNum) {
        String lastChar2 = tasks.get(taskNum - 1);
        if (lastChar2.endsWith("\u2713")) {
            lastChar2 = lastChar2.replace("\u2713", "");
            lastChar2 = lastChar2.trim();
            tasks.set(taskNum - 1, lastChar2);
        } else {
            System.out.println("That is not marked as done");
        }
    }

    void sendToFile(String name) {
        try(FileWriter writer = new FileWriter(name + ".txt")) {
            for(int i = 0; i < tasks.size(); i++) {
                writer.write(i + 1 + ". " + tasks.get(i) +"\n");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    void importFromFile(String name) {
        File myObj = new File(name + ".txt");
        try(Scanner scanner = new Scanner(myObj)) {
            while(scanner.hasNextLine()) {
                tasks.add(scanner.nextLine());
            }
            System.out.println("Successfully imported from file");
        } catch(FileNotFoundException e) {
            System.out.println("Unable to import from file");
            e.printStackTrace();
        }
    }
}