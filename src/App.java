import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;
import Domen.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);


        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println(group4580);

        for(Student std : group4580)
        {
            System.out.println(std);
        }

        System.out.println("=========================================================");

        Collections.sort(group4580.getGroup());

        for(Student std: group4580.getGroup())
        {
            System.out.println(std);
        }

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Teacher t2 = new Teacher("Татьяна", 57, "Docent");
        List<Teacher> listTeachers = new ArrayList<Teacher>();
        listTeachers.add(t1);
        listTeachers.add(t2);

        Employee e1 = new Employee("Владислав", 38, "Генеральный директор");
        Employee e2 = new Employee("Виктория", 50, "Главный бухгалтер");
        List<Employee> listEmployees = new ArrayList<Employee>();
        listEmployees.add(e1);
        listEmployees.add(e2);

        System.out.println(new PersonComparator<Student>().compare(s1, s3));

        // AccountController controller = new AccountController();
        // controller.paySalary(t1, 50000);
        // controller.paySalary(s1, 50000);

        AccountController.paySalary(t1, 50000);

        System.out.printf("Средний возраст студентов = %d%n", AccountController.averageAge(listStud));
        System.out.printf("Средний возраст учителей = %d%n", AccountController.averageAge(listTeachers));
        System.out.printf("Средний возраст работников = %d%n", AccountController.averageAge(listEmployees));
    }
}