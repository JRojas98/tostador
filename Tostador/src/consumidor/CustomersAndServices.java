package consumidor;

import proveedor.Proveedor;
import proveedor.ServiceTypes;

public class CustomersAndServices {
	// immutable object
	private final Proveedor provedor;

	// injeccion de dependencia
	public CustomersAndServices(Proveedor provedor) {
		this.provedor = provedor; // estamos haciendo composicion.
	}

	public void imprimirProvedor() {
		provedor.imprimir();
		
		//holaddd
	}

	
	
	
	public void imprimirClientes() {
		for (String name : provedor.getCustomer().keySet()) {
			System.out.print("cliente: " + name + ", ");
			System.out.println("monto adeudado:" + provedor.getCustomer().get(name));
		}
	}

	public void imprimirServices() {
		for (ServiceTypes type : provedor.getServices()) {
			System.out.print("servicio: " + type.getName() + ", ");
			System.out.println("monto total: " + type.gettotalAmount() );
		}

	}
}
