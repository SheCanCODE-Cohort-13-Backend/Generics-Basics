package dto;

public class DisplayStudentDto {
    private int id;
    private String name;
    private String phone;
    private char grade;
    private String email;

    public DisplayStudentDto() {
    }

    public DisplayStudentDto(int id, String name, String phone, char grade, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.grade = grade;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
