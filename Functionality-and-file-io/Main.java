public class Main {
    public static void main(String[] args) {

        taskList tasklist = new taskList("test", "Monday");
        System.out.println(tasklist.name);
        tasklist.addTask("Test Task");
        tasklist.addTask("Test Task 2");
        tasklist.viewTasks();
        tasklist.removeTask(2);
        tasklist.viewTasks();

    }
}

