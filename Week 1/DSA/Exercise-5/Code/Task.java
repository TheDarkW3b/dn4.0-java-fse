public class Task {
    int id;
    String name;
    Task next;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Name: " + name;
    }
}
