import java.util.List;

public class Main {
    public static void main(String[] args) {
        // real project would ask for user input
        Student student = new Student("S1", "Alex", "alex@example.com", "password123", "Computer Science");

        StudyGroup group = new StudyGroup(
            "G1",
            "CSC 131",
            "Study group for software engineering",
            5
        );

        StudyGroupFinder finder = new StudyGroupFinder();
        finder.addGroup(group);

        List<StudyGroup> results = finder.searchByCourse("CSC 131");

        if (!results.isEmpty()) {
            StudyGroup foundGroup = results.get(0);
            boolean joined = foundGroup.addMember(student);

            if (joined) {
                System.out.println(student.getName() + " joined " + foundGroup.getCourseName());
            } else {
                System.out.println("Could not join group.");
            }
        } else {
            System.out.println("No study groups found.");
        }
    }
}
