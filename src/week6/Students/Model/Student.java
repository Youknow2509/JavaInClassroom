package week6.Students.Model;

public class Student {
    private String id;
    private String name;
    private String leaderId;
    // Constructor
    public Student() {
        super();
    }
    public Student(String id, String name, String leaderId) {
        super();
        this.id = id;
        this.name = name;
        this.leaderId = leaderId;
    }
    // To String

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leaderId=" + leaderId +
                '}';
    }

    // Getter and Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }
}
