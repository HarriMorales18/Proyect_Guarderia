package Clases;

import java.util.Date;
import java.util.List;

public class Niño {
    private int id;
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private Date fechaBaja;


    private List<PersonaAutorizada> personasAutorizadas;
    private List<Alergia> alergias;
    private List<Asistencia> asistencias;
    private List<Comida> comidas;
    private List<CargoMensual> cargosMensuales;

    public Niño(int id, String nombre, Date fechaNacimiento, Date fechaIngreso, Date fechaBaja) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaBaja = fechaBaja;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }


    public List<PersonaAutorizada> getPersonasAutorizadas() {
        return personasAutorizadas;
    }

    public void setPersonasAutorizadas(List<PersonaAutorizada> personasAutorizadas) {
        this.personasAutorizadas = personasAutorizadas;
    }

    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }

    public List<CargoMensual> getCargosMensuales() {
        return cargosMensuales;
    }

    public void setCargosMensuales(List<CargoMensual> cargosMensuales) {
        this.cargosMensuales = cargosMensuales;
    }
}
