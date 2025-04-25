package dto;

public class CreateStudentDto {
    private String name;
    private String phone;
    private char grade;
    private String email;

    public CreateStudentDto() {
    }

    public CreateStudentDto(String name, String phone, char grade, String email) {
        this.name = name;
        this.phone = phone;
        this.grade = grade;
        this.email = email;
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
