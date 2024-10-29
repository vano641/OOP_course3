import java.util.Comparator;

public class task3_StudentComparator implements Comparator<task3_Student>{

    @Override
    public int compare(task3_Student o1, task3_Student o2) { // передается 2 студента
        int resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName()); // сравниваем Имя
        if (resultOfComparing == 0) { // если результат сравнения равен 0, то продолжаем сравнение
            resultOfComparing = o1.getLastName().compareTo(o2.getLastName());
            if (resultOfComparing == 0) {
                return o1.getMiddleName().compareTo(o2.getMiddleName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing; // если не равен 0 то возвращаем этот результат
        }
    }
    
}
