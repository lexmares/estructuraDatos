package clases;

import java.time.LocalDate;
    public class Asociado {

        private int noSocio;
        private String nombre;
        private LocalDate fechaIngreso;
        private int noTelefono;

        public Asociado() {
        }



        public Asociado(int noSocio, String nombre, LocalDate fechaIngreso, int noTelefono) {
            this.noSocio = noSocio;
            this.nombre = nombre;
            this.fechaIngreso = fechaIngreso;
            this.noTelefono = noTelefono;
        }

        public int getNoSocio() {
            return noSocio;
        }

        public void setNoSocio(int noSocio) {
            this.noSocio = noSocio;
        }

        public java.lang.String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public LocalDate getFechaIngreso() {
            return fechaIngreso;
        }

        public void setFechaIngreso(LocalDate fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
        }

        public int getNoTelefono() {
            return noTelefono;
        }

        public void setNoTelefono(int noTelefono) {
            this.noTelefono = noTelefono;
        }

        @Override
        public String toString() {
            return "[numero de Socio : " + noSocio + ", nombre : " + nombre + ", fecha de Ingreso : " + fechaIngreso + ", noTelefono : " + noTelefono + ']';
        }



    }
