public class TaskManager {
    private Task head = null;

    public void addTask(int id, String name) {
        Task newTask = new Task(id, name);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newTask;
        }
        System.out.println("Task added.");
    }

    public void viewTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        System.out.println("Task List:");
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void updateTask(int id, String newName) {
        Task temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.name = newName;
                System.out.println("Task updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        if (head == null) return;

        if (head.id == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Task temp = head;
        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                System.out.println("Task deleted.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Task not found.");
    }
}
