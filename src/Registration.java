public class Registration {
    private Student student;
    private Course course;

    public Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void displayRegistration() {
        System.out.println("================================");
        System.out.println("   REGISTRATION DETAILS");
        System.out.println("================================");
        student.displayStudentInfo();
        course.displayCourseInfo();
    }

    public void displayConfirmation() {
        System.out.println("\n[CONFIRMATION] Student registration confirmed successfully!");
    }
}
