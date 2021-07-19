package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static model.Person.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class PersonRegistry<persons> {
    private Person[] persons;

    public PersonRegistry() {

    }

    public void getSuitablePersons() {
        for (Person persons : this.persons)
            if (persons.getAge() >= MIN_AGE && persons.getAge() < MAX_AGE && persons.getSex().equals(MALE)) {
                System.out.println(persons);
            }
    }

    public void count() {
        int count = 0;
        for (Person persons : this.persons) {
            if (persons.getAge() >= MIN_AGE && persons.getAge() < MAX_AGE && persons.getSex().equals(MALE)) {
                if (persons.getAddress().getCity().equals("Минск")) {
                    count++;
                }
            }
        }
        System.out.println("Количество годных призывников в городе Минск: " + count);
    }

    public void count1() {
        int count1 = 0;
        for (Person persons : this.persons) {
            if (persons.getAge() >= 25 && persons.getAge() < 27 && persons.getSex().equals(MALE)) {
                count1++;
            }
        }
        System.out.println("Количество призывников от 25 до 27 лет: " + count1);
    }

    public void countName() {
        int countName = 0;
        for (Person persons : this.persons) {
            if (persons.getName().equals("Александр")) {
                countName++;
            }
        }
        System.out.println("Количество призывников с именем Александр: " + countName);
    }
}