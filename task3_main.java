import java.util.Iterator;

/**
 * Создать класс Студент (наполнить стандартными полями)
 * Создать класс УчебнаяГруппа (список студентов)
 * Создать класс УчебнаяГруппаИтератор, реализующий интерфейс Iterator
 * Реализовать его методы (включая удаление)
 */
public class task3_main {

    public static void main(String[] args) {
        
        task3_StudentGroup StudentList = new task3_StudentGroup();
      //  StudentList.PrintStudentList();

        task3_StudentGroupIterator studentInfo = new task3_StudentGroupIterator(StudentList);
        Iterator<task3_Student> student = studentInfo;

        while (student.hasNext()) {
            System.out.println(studentInfo.next());
        }

        
    }
}