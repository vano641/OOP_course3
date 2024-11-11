public class task3_Student extends User implements Comparable<task3_Student>{
    
    private Integer studentId;

    public task3_Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }
   
    public Integer getStudentId() {
        return this.studentId;
    }

    @Override
    public String toString() {
        return String.format("studentId: %d, firstName: %s, lastName: %s, middleName: %s",
        studentId, firstName, lastName, middleName);
    }

    @Override
    public int compareTo(task3_Student o) {
// берем у текущего объекта его studentId и вызываем у него метод compareTo
// у второго объекта также studentId
        return this.studentId.compareTo(o.studentId);
    }

}
