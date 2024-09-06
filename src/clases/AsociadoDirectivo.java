package clases;
import java.time.LocalDate;
public class AsociadoDirectivo extends Asociado{
    private String cargo;
    private LocalDate fechaPosesion;

    public AsociadoDirectivo() {
    }

    public AsociadoDirectivo(int noSocio, String nombre, LocalDate fechaIngreso, int noTelefono, String cargo, LocalDate fechaPosesion) {
        super(noSocio, nombre, fechaIngreso, noTelefono);
        this.cargo = cargo;
        this.fechaPosesion = fechaPosesion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getFechaPosesion() {
        return fechaPosesion;
    }

    public void setFechaPosesion(LocalDate fechaPosesion) {
        this.fechaPosesion = fechaPosesion;
    }

    @Override
    public String toString() {
        return "AsociadoDirectivo{" + "cargo=" + cargo + ", fechaPosesion=" + fechaPosesion + '}';
    }


}
