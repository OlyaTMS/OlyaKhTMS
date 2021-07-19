package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 27;

    private String name;
    private int age;
    private String sex;
    private Address address;

    public String getPersonCity() {
        return this.address.getCity();
    }
}
