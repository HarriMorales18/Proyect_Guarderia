package Clases;

import java.util.List;

public class Ingrediente {
    private String idIngrediente;
    private String descripcion;

    private List<Alergia> alergias;

    public Ingrediente(String idIngrediente, String descripcion) {
        this.idIngrediente = idIngrediente;
        this.descripcion = descripcion;
    }

    public String getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }
}
