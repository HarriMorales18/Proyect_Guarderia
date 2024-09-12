package Clases;

import java.util.List;

public class Plato {
    private String idPlato;
    private String descripcion;

    private List<Ingrediente> ingredientes;

    public Plato(String idPlato, String descripcion) {
        this.idPlato = idPlato;
        this.descripcion = descripcion;
    }


    public String getIdPlato() {
        return idPlato;
    }

    public void setIdPlato(String idPlato) {
        this.idPlato = idPlato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
