package Clases;

import java.util.Date;

public class Asistencia {
    private int idNiño;
    private Date fecha;
    private Date horaEntrada;
    private Date horaSalida;

    private Niño niño;

    public Asistencia(int idNiño, Date fecha, Date horaEntrada, Date horaSalida) {
        this.idNiño = idNiño;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getIdNiño() {
        return idNiño;
    }

    public void setIdNiño(int idNiño) {
        this.idNiño = idNiño;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Niño getNiño() {
        return niño;
    }

    public void setNiño(Niño niño) {
        this.niño = niño;
    }
}
