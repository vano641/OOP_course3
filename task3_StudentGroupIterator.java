import java.util.Iterator;
import java.util.List;
public class task3_StudentGroupIterator implements Iterator<task3_Student>{

    private int count; // счетчик
    private final List<task3_Student> studentList; // список студентов


    public task3_StudentGroupIterator(task3_StudentGroup studentGroup) {
        this.count = 0;
        this.studentList = studentGroup.getStudentList(); // список студентов берем из ГруппыСтудентов
    }

    @Override
    public boolean hasNext() {
        return count <= studentList.size() - 1; // счетчик меньше списка студентов -1
    }

    @Override
    public task3_Student next() {
// в начале надо проверить есть ли следующий элемент
        if (!hasNext()) { 
            return null; // если не существует следующего элемента
        }
        return studentList.get(count++); // возвращает текущее значение и увеличивает его
    }

    @Override
    public void remove() {
        studentList.remove(count); // 
    }
    
}
