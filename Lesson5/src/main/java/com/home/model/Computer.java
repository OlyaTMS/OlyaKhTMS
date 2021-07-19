package com.home.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter

public class Computer {
    private String processor;
    private int hdd;
    private int ram;
    private int resource;
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private boolean burned;

    public Computer(String processor, int hdd, int ram, int resource) {
        this.processor = processor;
        this.hdd = hdd;
        this.ram = ram;
        this.resource = resource;
    }

    public void info() {
        System.out.println("Процессор " + processor + " оперативка " + hdd + " жесткий диск " + ram + " ресурс полных циклов работы " + resource);
    }

    public void on() {
        if (!isBurned()) {
            System.out.println("Включение...");
            if (check() && resource > 0) {
                System.out.println("Компьютер включен");
                off();
            } else {
                burned();
            }
        } else {
            burned();
        }
    }

    private void burned() {
        System.out.println("Компьютер сгорел!");
        burned = true;
    }

    private boolean check() {
        while (true) {
            System.out.println("Внимание! Введите 0 или 1");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                if (x == 0 || x == 1) {
                    return random.nextInt(2) == x;
                } else {
                    System.out.println("Некорректные данные");
                }
            } else {
                System.out.println("Некорректные данные");
                scanner.next();
            }
        }
    }

    public void off() {
        resource--;
        System.out.println("Выключение...");
        if (!isBurned()) {
            System.out.println("Компьютер выключен");
            System.out.println("Количество оставшихся циклов: " + resource);
            on();
        } else {
            burned();
        }
    }
}
