
package core.sweetdelicacies;

import java.util.ArrayList;

import core.person.Client;
import core.person.Employee;
import core.sweetdelicacies.product.Product;

public class SweetDelicacies {
    private ArrayList<Client> clients;
    private ArrayList<Employee> employees;
    private ArrayList<Product> products;
    private ArrayList<Invoice> invoices;
    
    public SweetDelicacies() {
        this.clients = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }
    
    public boolean addClient(Client cliente) {
        if (!this.clients.contains(cliente)){
            this.clients.add(cliente);
            cliente.setSweetDelicacies(this);
            return true;
        }
        return false;
    }
    
    public boolean addEmployee(Employee employee) {
        if (!this.employees.contains(employee)){
            this.employees.add(employee);
            employee.setSweetDelicacies(this);
            return true;
        }
        return false;
    }
    
}
