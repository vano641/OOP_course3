import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; 
public class task3_StudentGroup implements Iterable<task3_Student>{

    private List<task3_Student> studentList;


/**    public task3_StudentGroup() {
        this.studentList = initStudents();
    }
    
        public List<task3_Student> initStudents(){
        List<task3_Student> StL = new ArrayList<>();
        StL.add(new task3_Student(1, "Иван", "Мысовский", "Андреевич"));
        StL.add(new task3_Student(2, "Кристина", "Мысовская", "Вячеславовна"));
        StL.add(new task3_Student(3, "Артем", "Мысовский", "Иванович"));
        return StL;
    }
*/
    public void PrintStudentList(){
        for (task3_Student i : studentList) {
            System.out.println(String.format("studentId: %d, firstName: %s, lastName: %s, middleName: %s",
                                         i.getStudentId(), i.getFirstName(), i.getLastName(), i.getMiddleName()));
        }
    }

    public List<task3_Student> getStudentList() {
        return this.studentList;
    }

    @Override
    public Iterator<task3_Student> iterator() {
        return new task3_StudentGroupIterator(this); // метод итератора возвращает итератор
    }

    
}