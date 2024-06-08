package br.cesul.ex04;

public class Free extends RentalVehicles {

    private Double rentalValue;

    public Free(String custumerName, String carModel, String safe, Double rentalValue) {
        super(custumerName, carModel, safe);
        this.rentalValue = rentalValue;
    }

    public Double amonutPayFree() {
        var totalvalue = (rentalValue);
        if (safe == "s"){
            return totalvalue + (totalvalue * 0.15);
        } else {
            return totalvalue;
        }
    }

    public Double getRentalValue() {
        return rentalValue;
    }

    public void setRentalValue(Double rentalValue) {
        this.rentalValue = rentalValue;
    }
}
