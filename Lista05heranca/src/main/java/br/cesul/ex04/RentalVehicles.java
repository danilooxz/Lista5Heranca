package br.cesul.ex04;

public abstract class RentalVehicles {

    private final String custumerName;

    private final String carModel;

    protected String safe;


    public RentalVehicles(String custumerName, String carModel, String safe) {
        this.custumerName = custumerName;
        this.carModel = carModel;
        this.safe = safe;
    }

    public String getCustumerName() {
        return custumerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe;
    }
}
