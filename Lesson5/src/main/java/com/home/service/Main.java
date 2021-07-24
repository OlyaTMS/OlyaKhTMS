package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("intel", 8, 256, 2);
        computer.info();
        computer.on();
        computer.off();
    }
}
