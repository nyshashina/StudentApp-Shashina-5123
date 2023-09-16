package Controllers;

import java.util.List;

import Domen.Person;


public class AccountController {

    public static <T extends Person> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " получил(а) зарплату " + salary + " р.");
    }

    public static <T extends Person> int averageAge(List<T> persons) {
        int sum = 0;
        for (T p : persons) {
            sum = sum + p.getAge();
        }
        return (sum / persons.size());
    }
}
