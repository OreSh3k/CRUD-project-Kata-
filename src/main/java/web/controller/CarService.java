package web.controller;

import Model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final List<Car> carList = List.of(
            new Car("Toy", "Cruser", 2020),
            new Car("BMW", "X7", 2021),
            new Car("Audi", "Q7", 2024),
            new Car("Granta", "Largus", 2022),
            new Car("Ford", "450fi", 2024)
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }
}