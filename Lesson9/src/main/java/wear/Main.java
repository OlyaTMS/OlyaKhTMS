package wear;

import lombok.Getter;
import lombok.Setter;
import wear.jacket.Blouse;
import wear.jacket.Pullover;
import wear.pants.Jeans;
import wear.pants.Trousers;
import wear.shoes.Sandals;
import wear.shoes.Sneakers;

import java.util.ArrayList;

@Getter
@Setter
public class Main {
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();
        clothes.add(new Blouse());
        clothes.add(new Pullover());
        clothes.add(new Trousers());
        clothes.add(new Jeans());
        clothes.add(new Sandals());
        clothes.add(new Sneakers());

        Person person = new Person("Nicol", clothes);
        System.out.println("Сегодня выходной!");
        person.putOnClothes();
        System.out.println("День подошел к концу.");
        person.takeOffClothes();
        System.out.println("Сегодня на работу!");
        person.putOnClothes();
        System.out.println("День подошел к концу.");
        person.takeOffClothes();
    }
}
