class LuxuryCar extends Car {
    private String interiorMaterial;

    public LuxuryCar(String id, String model, String year, double price, String interiorMaterial) {
        super(id, model, year, price);
        this.interiorMaterial = interiorMaterial;
    }

    public String getInteriorMaterial() {
        return interiorMaterial;
    }

    public void setInteriorMaterial(String interiorMaterial) {
        this.interiorMaterial = interiorMaterial;
    }

    @Override
    public String toString() {
        return "Luxury Car --> " + "ID = " + getId() + "|| Model = " + getModel() + "|| Year = " + getYear() + "|| Price = " + getPrice() + "|| Interior Material = " + interiorMaterial;
    }
}