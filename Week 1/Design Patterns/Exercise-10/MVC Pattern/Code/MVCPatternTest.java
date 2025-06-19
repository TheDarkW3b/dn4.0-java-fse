public class MVCPatternTest {
    public static void main(String[] args) {
        Student model = new Student("Ramit Gangwar", "C12345");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Noir");
        controller.setStudentRollNo("C98765");
        controller.updateView();
    }
}
