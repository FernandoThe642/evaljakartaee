package eval.ups.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import eval.ups.model.KiloWatt;

@Entity
public class DetalleFactura {

    @Id
    private int codigo;
    private int cantidad;
    private double precio;

    @OneToOne
    @JoinColumn(name = "codigo_producto")
    private KiloWatt KiloWatt;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public KiloWatt getKiloWatt() {
		return KiloWatt;
	}
	public void setKiloWatt(KiloWatt kiloWatt) {
		KiloWatt = kiloWatt;
	}
	@Override
	public String toString() {
		return "DetalleFactura [codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + ", KiloWatt="
				+ KiloWatt + "]";
	}

	
}
