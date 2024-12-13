import java.util.ArrayList;
import java.util.List;

class CarShowroom {
    private List<Car> cars;

    public CarShowroom() {
        this.cars = new ArrayList<>();
    }

    // Create
    public void addCar(Car car) {
        cars.add(car);
    }

    // Read
    public List<Car> getCars() {
        return cars;
    }

    // Update
    public boolean updateCar(String id, Car updatedCar) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId().equals(id)) {
                cars.set(i, updatedCar);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean deleteCar(String id) {
        return cars.removeIf(car -> car.getId().equals(id));
    }

}