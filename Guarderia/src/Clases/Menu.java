package Clases;

import java.util.List;

public class Menu {
    private int idMenu;
    private String descripcion;

    private List<Comida> comidas;

    public Menu(int idMenu, String descripcion) {
        this.idMenu = idMenu;
        this.descripcion = descripcion;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }
}
