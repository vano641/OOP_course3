import java.util.Iterator;

/**
 * Задача 1
 * Создать класс Юзер и перенести в него базовые поля (ФИО)
 * Модифицировать ранее созданный класс СтудентКомпаратор переименовав его в ЮзерКомпаратор
 * Типизировать его Т наследующегося от типа Юзер (Т extends User)
 * Изменить метод Компаре, внеся во входные данные вместо конкретных классов типизацию Т
 * Внести правки места, где использовался предыдущий компаратор
 * 
 * Задача 2
 * Создать интерфейс ЮзерВью
 * Типизировать его Т наследующегося от типа Юзер
 * Создать в нем метод sendOnConsole(List<Student> students) используя типизацию
 * Создать класс СтудентВью реализующий созданный интерфейс
 */
public class task3_main {

    public static void main(String[] args) {
        
        task3_StudentGroup StudentList = new task3_StudentGroup(); // Печать списка студентов
      //  StudentList.PrintStudentList();

        task3_StudentGroupIterator studentInfo = new task3_StudentGroupIterator(StudentList);
        Iterator<task3_Student> student = studentInfo;

        while (student.hasNext()) {
            System.out.println(studentInfo.next()); // перебор списка Итератором
        }
     //   studentId: 1, firstName: Иван, lastName: Мысовский, middleName: Андреевич
     //   studentId: 2, firstName: Кристина, lastName: Мысовская, middleName: Вячеславовна
     //   studentId: 3, firstName: Артем, lastName: Мысовский, middleName: Иванович

        
    }
}