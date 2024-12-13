class ElectricCar extends Car {
    private String batteryCapacity; // Change to String

    public ElectricCar(String id, String model, String year, double price, String batteryCapacity) {
        super(id, model, year, price);
        this.batteryCapacity = batteryCapacity;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar --> " + "ID = " + getId() + "|| Model = " + getModel() + "|| Year = " + getYear() + "|| Price = " + getPrice() + "|| Battery = " + batteryCapacity;
    }
}