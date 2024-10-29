import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class task3_StudentGroupService {
    
    private task3_StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
// вызываем итератор из ГруппыСтудентов, проходим по студентам        
        Iterator<task3_Student> iterator = studentGroup.iterator();
// перебераем всех студентов, проверяем hasNext() есть ли следующий студент        
        while (iterator.hasNext()) {
// если существует, достаем его из итератора next()            
            task3_Student student = iterator.next();
// сверяем параметры            
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)) {
                iterator.remove();// если совпадает, то удаляем
            }
        }
    }

// метод сортировки студентов по Id
    public List<task3_Student> getSortedStudentList(){
        List<task3_Student> studentList = new ArrayList<>(studentGroup.getStudentList());        
        Collections.sort(studentList); 
        return studentList;
    }

}
