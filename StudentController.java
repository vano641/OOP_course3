import java.util.List;

public class StudentController implements UserController<task3_Student>{
    
    private final task3_StudentGroupService studentGroupService = new task3_StudentGroupService(); // экземпляр сервиса

    private final StudentView studentView = new StudentView(); // создадим СтудентВью

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName); // вызываем метод передавая в него все параметры
    }

     public List<task3_Student> getSortedStudentList(){
        List<task3_Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
     }

    public List<task3_Student> getSortedStudentByFIO(){
        List<task3_Student> studentList = studentGroupService.getSortedStydentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
