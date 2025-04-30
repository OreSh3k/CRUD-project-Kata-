package web.service;
import java.util.List;

import web.model.Car;

public interface CarService {
    List<Car> getCarsCount(int count);
}
