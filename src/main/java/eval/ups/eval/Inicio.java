package eval.ups.eval;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;
import eval.ups.model.DetalleFactura;
import eval.ups.model.Factura;
import eval.ups.model.Persona;
import eval.ups.model.KiloWatt;
import eval.ups.dao.DetalleFacturaDAO;
import eval.ups.dao.FacturaDAO;
import eval.ups.dao.PersonaDAO;
import eval.ups.dao.KiloWattDAO;

@Singleton
@Startup
public class Inicio {
	@Inject PersonaDAO personaDAO;

	@Inject KiloWattDAO kiloWattDAO;

	@Inject FacturaDAO facturaDAO;

	@Inject DetalleFacturaDAO detalleFacturaDAO;
	
	@PostConstruct
	public void init()	{

		InsertKiloWatts();
		InsertClientes();
		CreateFactura();

		personaDAO.getAll().forEach(e -> System.out.println(e.toString()) );
		kiloWattDAO.getAll().forEach(e -> System.out.println(e.toString()) );
		facturaDAO.getAll().forEach(e -> System.out.println(e.toString()) );		
	}

	
	private void CreateFactura(){
		Factura factura = new Factura();
		factura.setNumero(1);
		factura.setFecha("01-06-2024");
		factura.setCliente(personaDAO.get("0107951170"));
		factura.setEstado("Pagado");
		factura.setDetalles(GetDetalles());
		facturaDAO.create(factura);
	}
	
	
	private List<DetalleFactura> GetDetalles(){
		List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
		DetalleFactura detalle = new DetalleFactura();
		KiloWatt kiloWatt = kiloWattDAO.get(1);
		detalle.setCantidad(32);
		detalle.setKiloWatt(kiloWatt);
		detalle.setPrecio(kiloWatt.getPrecio());
		detalles.add(detalle);
		return detalles;
	}
	
	private void InsertKiloWatts(){
		KiloWatt producto = new KiloWatt();
		producto.setCodigo(1);
		producto.setPrecio(0.03);
	}
	private void InsertClientes(){
	    Persona persona = new Persona();
	    persona.setCedula("0107951170");
	    persona.setNombre("Juan Pérez");
	    persona.setDireccion("123 Calle Principal");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951171");
	    persona.setNombre("Ana Gómez");
	    persona.setDireccion("456 Calle Elm");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951172");
	    persona.setNombre("Carlos Rodríguez");
	    persona.setDireccion("789 Calle Roble");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951173");
	    persona.setNombre("María López");
	    persona.setDireccion("321 Calle Pino");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951174");
	    persona.setNombre("Pedro Sánchez");
	    persona.setDireccion("654 Calle Arce");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951175");
	    persona.setNombre("Lucía Fernández");
	    persona.setDireccion("987 Calle Cedro");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951176");
	    persona.setNombre("Andrés Morales");
	    persona.setDireccion("654 Calle Abedul");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951177");
	    persona.setNombre("Sofía Ramírez");
	    persona.setDireccion("321 Calle Sauce");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951178");
	    persona.setNombre("Diego Hernández");
	    persona.setDireccion("987 Calle Pino");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951179");
	    persona.setNombre("Laura Vargas");
	    persona.setDireccion("123 Calle Palma");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951180");
	    persona.setNombre("Miguel Torres");
	    persona.setDireccion("456 Calle Acacia");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951181");
	    persona.setNombre("Elena Cruz");
	    persona.setDireccion("789 Calle Haya");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951182");
	    persona.setNombre("Luis Castro");
	    persona.setDireccion("321 Calle Nogal");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951183");
	    persona.setNombre("Paula Ibáñez");
	    persona.setDireccion("654 Calle Fresno");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951184");
	    persona.setNombre("Javier Flores");
	    persona.setDireccion("987 Calle Ciprés");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951185");
	    persona.setNombre("Carmen Gutiérrez");
	    persona.setDireccion("123 Calle Olivo");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951186");
	    persona.setNombre("Ricardo Navarro");
	    persona.setDireccion("456 Calle Castaño");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951187");
	    persona.setNombre("Patricia Ortiz");
	    persona.setDireccion("789 Calle Laurel");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951188");
	    persona.setNombre("Julio Aguilar");
	    persona.setDireccion("321 Calle Olmo");
	    personaDAO.create(persona);

	    persona = new Persona();
	    persona.setCedula("0107951189");
	    persona.setNombre("Isabel Paredes");
	    persona.setDireccion("654 Calle Tejo");
	    personaDAO.create(persona);
	}
	
}
