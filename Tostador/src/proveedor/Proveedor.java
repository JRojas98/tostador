package proveedor;

import java.util.List;
import java.util.Map;

public interface Proveedor {
	void imprimir();
	List<ServiceTypes> getServices();
	void addServices(ServiceTypes serviceTypes);
	Map<String, Double> getCustomer();
	void addCustomer(String name, Double amount);
}
