public class Student extends User {
    private String major;

    public Student(String userId, String name, String email, String password, String major) {
        super(userId, name, email, password);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}