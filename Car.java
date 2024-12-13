class Car {
    private String id;
    private String model;
    private String year;
    private double price;

    public Car(String id, String model, String year, double price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car --> " + "ID = " + id  + "|| Model=" + model  + "|| Year=" + year  + "|| Price=" + price;
    }
}