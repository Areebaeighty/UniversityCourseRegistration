public class UniversityCourseRegistration {
    public static void main(String[] args) {
        Student student = new Student("S101", "Alice Johnson", "Computer Science");
        Course course = new Course("CS301", "Software Construction & Design", 3);

        Registration registration = new Registration(student, course);
        registration.displayRegistration();
        registration.displayConfirmation();
    }
}
