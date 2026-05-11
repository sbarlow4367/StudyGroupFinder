import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private String groupId;
    private String courseName;
    private String description;
    private int maxMembers;
    private List<Student> members;

    public StudyGroup(String groupId, String courseName, String description, int maxMembers) {
        this.groupId = groupId;
        this.courseName = courseName;
        this.description = description;
        this.maxMembers = maxMembers;
        this.members = new ArrayList<>();
    }

    public String getGroupId() {
        return groupId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public int getMemberCount() {
        return members.size();
    }

    public boolean addMember(Student student) {
        if (members.size() >= maxMembers) {
            return false;
        }

        if (members.contains(student)) {
            return false;
        }

        members.add(student);
        return true;
    }

    public boolean removeMember(Student student) {
        return members.remove(student);
    }

    public boolean hasMember(Student student) {
        return members.contains(student);
    }
}