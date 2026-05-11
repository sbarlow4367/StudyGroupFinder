import java.util.ArrayList;
import java.util.List;

public class StudyGroupFinder {
    private List<StudyGroup> groups;

    public StudyGroupFinder() {
        groups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        groups.add(group);
    }

    public List<StudyGroup> searchByCourse(String courseName) {
        List<StudyGroup> results = new ArrayList<>();

        for (StudyGroup group : groups) {
            if (group.getCourseName().equalsIgnoreCase(courseName)) {
                results.add(group);
            }
        }

        return results;
    }

    public int getTotalGroups() {
        return groups.size();
    }
}