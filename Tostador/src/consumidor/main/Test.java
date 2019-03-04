package consumidor.main;

import consumidor.CustomersAndServices;
import consumidor.Tostador;
import proveedor.ProveddorIcelpml;
import proveedor.Proveedor;
import proveedor.ProveedorMovistarImpl;


import static proveedor.ServiceTypes.ELECTRICIDAD;
import static proveedor.ServiceTypes.TELEFONIA;
import static proveedor.ServiceTypes.OTROS;
public class Test {

	public static void main(String[] args) {
		// Proveedor proveedor = new ProveddorIcelpml();
		
		// proveedor.imprimir();
		
		
		// proveedor = new ProveedorMovistarImpl();
		// proveedor.imprimir();
		
		Tostador tostador = new Tostador(new ProveedorMovistarImpl());
		tostador.imprimirProveedor();
		
		ProveedorMovistarImpl movistar = new ProveedorMovistarImpl();
		movistar.addCustomer("Jorge", 100d);
		movistar.addCustomer("Xinia", 200d);
		movistar.addServices(ELECTRICIDAD);
		movistar.addServices(TELEFONIA);
		movistar.addServices(OTROS);
		imprimirServicios(movistar);
		
		
		tostador = new Tostador(new ProveddorIcelpml() );
		tostador.imprimirProveedor();
		
		ProveddorIcelpml ice = new ProveddorIcelpml();
		ice.addCustomer("Rafa", 100d);
		ice.addCustomer("Jose", 200d);
		ice.addServices(ELECTRICIDAD);
		ice.addServices(TELEFONIA);
		imprimirServicios(ice);
		
	}
	
	private static void imprimirServicios(Proveedor provedor) {
		CustomersAndServices cs = new CustomersAndServices(provedor);
		cs.imprimirClientes();
		cs.imprimirServices();
	}
		
	}


