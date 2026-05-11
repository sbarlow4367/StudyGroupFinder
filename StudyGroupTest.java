import static org.junit.Assert.*;
import org.junit.Test;

public class StudyGroupTest {

    @Test
    public void testAddMember() {
        Student student = new Student("S1", "Alex", "alex@example.com", "password123", "CS");
        StudyGroup group = new StudyGroup("G1", "CSC 131", "Study group", 5);

        assertTrue(group.addMember(student));
        assertEquals(1, group.getMemberCount());
    }

    @Test
    public void testGroupFull() {
        StudyGroup group = new StudyGroup("G1", "CSC 131", "Study group", 1);

        Student s1 = new Student("S1", "Alex", "a", "p", "CS");
        Student s2 = new Student("S2", "Bob", "b", "p", "CS");

        assertTrue(group.addMember(s1));
        assertFalse(group.addMember(s2));
    }
}