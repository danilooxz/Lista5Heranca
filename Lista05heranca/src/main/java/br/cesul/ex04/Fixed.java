package br.cesul.ex04;

public class Fixed extends RentalVehicles {

    private Double valueKm;

    private Double traveledKm;

    private Double paidKm;


    public Fixed(String custumerName, String carModel, String safe, Double valueKm, Double traveledKm, Double paidKm) {
        super(custumerName, carModel, safe);
        this.valueKm = valueKm;
        this.traveledKm = traveledKm;
        this.paidKm = paidKm;
    }

    public Double amonutPayFixed() {
        var totalvalue = (valueKm * traveledKm);
        if (traveledKm > paidKm) {
            return totalvalue + (totalvalue * 0.2);
        } else if (safe == "s") {
            return  totalvalue + (totalvalue * 0.15);
        } else {
            return  totalvalue;
        }
    }


    public Double getValueKm() {
        return valueKm;
    }

    public void setValueKm(Double valueKm) {
        valueKm = valueKm;
    }

    public Double getTraveledKm() {
        return traveledKm;
    }

    public void setTraveledKm(Double traveledKm) {
        this.traveledKm = traveledKm;
    }

    public Double getPaidKm() {
        return paidKm;
    }

    public void setPaidKm(Double paidKm) {
        this.paidKm = paidKm;
    }
}
