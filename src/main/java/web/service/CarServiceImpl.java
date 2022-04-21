package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Lada", "Black", "Y345EA799"));
        carList.add(new Car("Lada", "Black", "Y345EA799"));
        carList.add(new Car("Lada", "Black", "Y345EA799"));
        carList.add(new Car("Lada", "Black", "Y345EA799"));
        carList.add(new Car("Lada", "Black", "Y345EA799"));
    }

    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
