package robot;

import lombok.Getter;
import lombok.Setter;
import robot.hands.IHand;
import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.IHead;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.ILeg;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

@Getter
@Setter

public class Run {
    public static void main(String[] args) {


        IHand[] hand = new IHand[3];
        hand[0] = new SamsungHand(4300);
        hand[1] = new SonyHand(3500);
        hand[2] = new ToshibaHand(2800);

        IHead[] head = new IHead[3];
        head[0] = new ToshibaHead(5200);
        head[1] = new SamsungHead(3800);
        head[2] = new SonyHead(4750);

        ILeg[] leg = new ILeg[3];
        leg[0] = new SonyLeg(1800);
        leg[1] = new ToshibaLeg(1650);
        leg[2] = new SamsungLeg(2100);


        IRobot[] robots = new IRobot[3];
        for (int i = 0; i < 3; i++) {
            robots[i] = new Robot(head[i], hand[i], leg[i]);
            System.out.println("Robot " + (i + 1) + ":");
            robots[i].action();
            System.out.println("Стоимость = " + robots[i].getPrice());
        }
        int max = 0;
        int number = 0;
        for (int i = 0; i < 3; i++) {
            if (robots[i].getPrice() > max) {
                max = robots[i].getPrice();
                number = i + 1;
            }
        }
        System.out.println("Robot " + number + " - самый дорогой. Стоимость = " + max);
    }

        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


}

