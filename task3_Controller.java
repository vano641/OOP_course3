public class task3_Controller {
    
    private final task3_StudentGroupService studentGroupService = new task3_StudentGroupService(); // экземпляр сервиса

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName); // вызываем метод передавая в него все параметры
    }
}
