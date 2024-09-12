package Clases;

import java.util.List;

public class PersonaAutorizada {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private String relacionConElNiño;

    private List<Niño> niñosAutorizados;

    public PersonaAutorizada(String dni, String nombre, String direccion, String telefono, String relacionConElNiño) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.relacionConElNiño = relacionConElNiño;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRelacionConElNiño() {
        return relacionConElNiño;
    }

    public void setRelacionConElNiño(String relacionConElNiño) {
        this.relacionConElNiño = relacionConElNiño;
    }

    public List<Niño> getNiñosAutorizados() {
        return niñosAutorizados;
    }

    public void setNiñosAutorizados(List<Niño> niñosAutorizados) {
        this.niñosAutorizados = niñosAutorizados;
    }
}
