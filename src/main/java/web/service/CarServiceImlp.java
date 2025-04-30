package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImlp implements CarService {
    private final List<Car> cars = Arrays.asList(
            new Car("model1", "red"),
            new Car("model2", "blue"),
            new Car("model3", "green"),
            new Car("model4", "orange"),
            new Car("model5", "huy")
    );

    @Override
    public List<Car> getCarsCount(int count) {
        return count >=5 ? cars : cars.subList(0, count);
    }
}
