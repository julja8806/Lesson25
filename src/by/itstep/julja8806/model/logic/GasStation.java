package by.itstep.julja8806.model.logic;

import by.itstep.julja8806.model.entity.abstracts.Transport;

public class GasStation {
    public static int calculateTank(Transport[] transports){
        int total = 0;
        for (Transport transport : transports
        ){
        total += transport.getTank();
        }
        return total;
    }
}
