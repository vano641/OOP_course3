import java.util.List;

public class StudentView implements UserView<task3_Student> {
// реализуем интерфейс
    @Override
    public void sendOnConsole(List<task3_Student> list) {
        for (task3_Student i : list) {
            System.out.println(i.getStudentId()); // выводим в консоль id студента
        }
    }
    
    
}
