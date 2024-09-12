package Clases;

import java.util.Date;

public class Alergia {
    private int idNiño;
    private String idIngrediente;
    private Date fechaRegistro;

    private Niño niño;
    private Ingrediente ingrediente;

    public Alergia(int idNiño, String idIngrediente, Date fechaRegistro) {
        this.idNiño = idNiño;
        this.idIngrediente = idIngrediente;
        this.fechaRegistro = fechaRegistro;
    }
    public int getIdNiño() {
        return idNiño;
    }

    public void setIdNiño(int idNiño) {
        this.idNiño = idNiño;
    }

    public String getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Niño getNiño() {
        return niño;
    }

    public void setNiño(Niño niño) {
        this.niño = niño;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
}
