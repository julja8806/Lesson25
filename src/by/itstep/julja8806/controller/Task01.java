package by.itstep.julja8806.controller;

import by.itstep.julja8806.model.entity.Bus;
import by.itstep.julja8806.model.entity.Car;
import by.itstep.julja8806.model.entity.Truck;
import by.itstep.julja8806.model.entity.abstracts.Transport;
import by.itstep.julja8806.model.logic.GasStation;

public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Transport[] transports = {new Car(50), new Car(40), new Bus(110), new Bus(200), new Bus(300), new Truck(500)};

        int total = GasStation.calculateTank(transports);
        System.out.println("Total oil: " + total);
    }
}