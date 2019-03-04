package consumidor;

import proveedor.Proveedor;

public class Tostador {
	private final Proveedor proveedor;
	
	public Tostador(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	public void imprimirProveedor() {
		proveedor.imprimir();
	}
	
}
