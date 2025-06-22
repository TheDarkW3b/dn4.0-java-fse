import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n== Task Manager ==");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    tm.addTask(id, name);
                    break;
                case 2:
                    tm.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter Task ID to update: ");
                    id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter new Task Name: ");
                    name = sc.nextLine();
                    tm.updateTask(id, name);
                    break;
                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    id = sc.nextInt();
                    tm.deleteTask(id);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
