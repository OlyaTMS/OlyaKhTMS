package service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import model.Address;
import model.MilitaryOffice;
import model.Person;
import model.PersonRegistry;

import static model.Person.FEMALE;
import static model.Person.MALE;

@ToString
@Getter
@Setter
@AllArgsConstructor

public class Main {
    public static void main(String[] args) {
        MilitaryOffice militaryOffice = new MilitaryOffice();
        PersonRegistry personRegistry = new PersonRegistry();
        militaryOffice.setPersonRegistry(personRegistry);

        Person[] people = new Person[10];
        people[0] = new Person("Ольга", 28, FEMALE, new Address("Беларусь", "Минск"));
        people[1] = new Person("Владимир", 35, MALE, new Address("Беларусь", "Минск"));
        people[2] = new Person("Евгений", 22, MALE, new Address("Беларусь", "Брест"));
        people[3] = new Person("Сергей", 23, MALE, new Address("Беларусь", "Заславль"));
        people[4] = new Person("Кирилл", 25, MALE, new Address("Беларусь", "Минск"));
        people[5] = new Person("Алексей", 21, MALE, new Address("Беларусь", "Минск"));
        people[6] = new Person("Ульяна", 22, FEMALE, new Address("Беларусь", "Гродно"));
        people[7] = new Person("Юрий", 24, MALE, new Address("Беларусь", "Минск"));
        people[8] = new Person("Александр", 19, MALE, new Address("Беларусь", "Минск"));
        people[9] = new Person("Вадим", 26, MALE, new Address("Беларусь", "Минск"));

        personRegistry.setPersons(people);

        militaryOffice.getPersonRegistry().getSuitablePersons();
        militaryOffice.getPersonRegistry().count();
        militaryOffice.getPersonRegistry().count1();
        militaryOffice.getPersonRegistry().countName();
    }
}
