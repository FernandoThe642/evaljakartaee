package eval.ups.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class KiloWatt {

	
    @Id
    private int codigo;
    private double precio;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "KiloWatt [codigo=" + codigo + ", precio=" + precio + "]";
	}
    
    
}
