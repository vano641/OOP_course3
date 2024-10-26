public class task3_Student {
    
    private Integer studentId;
    private String firstName;
    private String lastName;
    private String middleName;


    public task3_Student(Integer studentId, String firstName, String lastName, String middleName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String toString() {
        return String.format("studentId: %d, firstName: %s, lastName: %s, middleName: %s",
        studentId, firstName, lastName, middleName);
    }

}
