package Clases;

import java.util.Date;

public class Comida {
    private int idNiño;
    private int idMenu;
    private Date fecha;
    private Date hora;

    private Niño niño;
    private Menu menu;

    public Comida(int idNiño, int idMenu, Date fecha, Date hora) {
        this.idNiño = idNiño;
        this.idMenu = idMenu;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdNiño() {
        return idNiño;
    }

    public void setIdNiño(int idNiño) {
        this.idNiño = idNiño;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Niño getNiño() {
        return niño;
    }

    public void setNiño(Niño niño) {
        this.niño = niño;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
