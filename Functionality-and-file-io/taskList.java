import java.util.ArrayList;

public class taskList {

    String name;
    ArrayList<String> tasks;

    public taskList(String name, String day) {
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
}