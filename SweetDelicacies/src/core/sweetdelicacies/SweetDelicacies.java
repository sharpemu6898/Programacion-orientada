/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package core.sweetdelicacies;

import java.util.ArrayList;

import core.person.Client;
import core.person.Employee;
import core.sweetdelicacies.product.Product;
import java.time.LocalDate;

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
    
    public boolean addInvoice(Client client, ArrayList<Product> products, ArrayList<Integer> quantities, LocalDate date) {
        Invoice invoice = new Invoice(client, products, quantities, date);
        if (!this.invoices.contains(invoice)){
            this.invoices.add(invoice);
            return true;
        }
        return false;
    }
    
    public void addProduct(Product product) {
        this.products.add(product);
    }
    
    public Product getProduct(int index) {
        return this.products.get(index);
    }
    public Client getClient(int index) {
        return this.clients.get(index);
    }
    
    public Employee getEmployee(int index) {
        return this.employees.get(index);
    }
}
