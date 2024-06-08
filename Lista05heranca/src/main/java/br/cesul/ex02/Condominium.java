package br.cesul.ex02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Condominium {

    private Double water;

    private Double maintenanceValue;

    private Double otherFees;

    private Double numberApartments;

    private Double reservedFunds;

    private LocalDate dueDate;

    public Condominium(Double water, Double maintenanceValue, Double otherFees, Double numberApartments, Double reservedFunds, LocalDate dueDate) {
        this.water = water;
        this.maintenanceValue = maintenanceValue;
        this.otherFees = otherFees;
        this.numberApartments = numberApartments;
        this.reservedFunds = reservedFunds;
        this.dueDate = dueDate;
    }

    public Double getFee(){
        var today = LocalDate.now();
        var diff = dueDate.until(today, ChronoUnit.DAYS);

        if (diff > 0) {
            return calculateFee();
        }

        return calculateFee(diff);
    }

    private Double calculateFee() {
        return (water + maintenanceValue + otherFees + reservedFunds) / numberApartments.doubleValue();
    }

    private Double calculateFee(long daysOfDelay){
        var baseFee = calculateFee();
        return baseFee + (baseFee * 0.05) + (baseFee * 0.01 * daysOfDelay);
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getMaintenanceValue() {
        return maintenanceValue;
    }

    public void setMaintenanceValue(Double maintenanceValue) {
        this.maintenanceValue = maintenanceValue;
    }

    public Double getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(Double otherFees) {
        this.otherFees = otherFees;
    }

    public Double getNumberApartments() {
        return numberApartments;
    }

    public void setNumberApartments(Double numberApartments) {
        this.numberApartments = numberApartments;
    }

    public Double getReservedFunds() {
        return reservedFunds;
    }

    public void setReservedFunds(Double reservedFunds) {
        this.reservedFunds = reservedFunds;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
