package Clases;

import java.util.Date;

public class CargoMensual {
    private int idNiño;
    private Date fecha;
    private double costeFijoMensual;
    private double costeComidas;
    private double total;

    private Niño niño;

    public CargoMensual(int idNiño, Date fecha, double costeFijoMensual, double costeComidas, double total) {
        this.idNiño = idNiño;
        this.fecha = fecha;
        this.costeFijoMensual = costeFijoMensual;
        this.costeComidas = costeComidas;
        this.total = total;
    }

    public int getIdNiño() {
        return idNiño;
    }

    public void setIdNiño(int idNiño) {
        this.idNiño = idNiño;
    }

    public Date getFecha() {
        return fecha;
    }public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getCosteFijoMensual() {
        return costeFijoMensual;
    }

    public void setCosteFijoMensual(double costeFijoMensual) {
        this.costeFijoMensual = costeFijoMensual;
    }

    public double getCosteComidas() {
        return costeComidas;
    }

    public void setCosteComidas(double costeComidas) {
        this.costeComidas = costeComidas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Niño getNiño() {
        return niño;
    }

    public void setNiño(Niño niño) {
        this.niño = niño;
    }
}