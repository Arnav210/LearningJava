import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

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
        tasks.set(taskNum - 1, tasks.get(taskNum - 1) + " \u2713");
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
}