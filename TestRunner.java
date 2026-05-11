public class TestRunner {
    public static void main(String[] args) {
        testAddMember();
        testGroupFull();
        testSearchByCourse();

        System.out.println("All manual tests passed.");
    }

    public static void testAddMember() {
        Student student = new Student("S1", "Alex", "alex@example.com", "password123", "CS");
        StudyGroup group = new StudyGroup("G1", "CSC 131", "Study group", 5);

        if (!group.addMember(student)) {
            throw new RuntimeException("testAddMember failed");
        }

        if (group.getMemberCount() != 1) {
            throw new RuntimeException("testAddMember count failed");
        }
    }

    public static void testGroupFull() {
        StudyGroup group = new StudyGroup("G1", "CSC 131", "Study group", 1);

        Student s1 = new Student("S1", "Alex", "a", "p", "CS");
        Student s2 = new Student("S2", "Bob", "b", "p", "CS");

        if (!group.addMember(s1)) {
            throw new RuntimeException("testGroupFull first add failed");
        }

        if (group.addMember(s2)) {
            throw new RuntimeException("testGroupFull failed: allowed extra member");
        }
    }

    public static void testSearchByCourse() {
        StudyGroupFinder finder = new StudyGroupFinder();

        StudyGroup group1 = new StudyGroup("G1", "CSC 131", "Software engineering", 5);
        StudyGroup group2 = new StudyGroup("G2", "MATH 30", "Calculus", 5);

        finder.addGroup(group1);
        finder.addGroup(group2);

        if (finder.searchByCourse("CSC 131").size() != 1) {
            throw new RuntimeException("testSearchByCourse failed");
        }
    }
}