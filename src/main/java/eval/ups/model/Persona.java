package eval.ups.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Persona {
	
    @Id
    private String cedula;
    private String nombre;
    private String direccion;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    
    @Override
    public String toString() {
        return "Persona [cedula=" + cedula + ", direccion=" + direccion + ", nombre=" + nombre + "]";
    }

	
	
}
