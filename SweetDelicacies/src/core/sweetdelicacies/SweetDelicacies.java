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
    
    public void companySummary(){
        System.out.println("---------- Company Summary ----------\n" +
"Clients: 5\n" +
"- Id: 200100000, Name: Magda Vincent, Address: 2626 Peaceful Lane, Invoices ID: [3, 13]\n" +
"- Id: 200100001, Name: Max Vida, Address: 1141 Alexander Drive, Invoices ID: [0, 9, 11, 12]\n" +
"- Id: 200100002, Name: Gwenddoleu Thacker, Address: 2697 Heather Sees Way, Invoices ID: [4, 5, 8]\n" +
"- Id: 200100003, Name: Devaki Hawk, Address: 917 Irving Place, Invoices ID: [6, 7, 10]\n" +
"- Id: 200100004, Name: Helena Browne, Address: 2138 Franklee Lane, Invoices ID: [1, 2, 14]\n" +
"\n" +
"Employees: 8\n" +
"- Id: 200200000, Name: Hildefons Abioye, Area: PRODUCTION, Position: Production Manager, Aging: 12, Tasks ID: [0, 3, 8, 9, 16]\n" +
"- Id: 200200001, Name: Jamila Merino, Area: DISTRIBUTION, Position: Distribution Manager, Aging: 10, Tasks ID: [2, 10, 11, 20]\n" +
"- Id: 200200002, Name: Chi Sniegowski, Area: DISTRIBUTION, Position: Packer, Aging: 5, Tasks ID: [6, 18]\n" +
"- Id: 200200003, Name: Fabius Boros, Area: PRODUCTION, Position: Machine Operator, Aging: 6, Tasks ID: [5, 7, 17]\n" +
"- Id: 200200004, Name: Nyree Van der Venne, Area: PRODUCTION, Position: Engineer, Aging: 10, Tasks ID: [1, 15]\n" +
"- Id: 200200005, Name: Sveinn Klymenko, Area: SALES, Position: Sales Manager, Aging: 15, Tasks ID: [13]\n" +
"- Id: 200200006, Name: Kasimir Hayden, Area: DISTRIBUTION, Position: Packer, Aging: 2, Tasks ID: [4, 14, 19]\n" +
"- Id: 200200007, Name: Herakleides Aoyama, Area: PRODUCTION, Position: Machine Operator, Aging: 1, Tasks ID: [12]\n" +
"\n" +
"Products: 10\n" +
"- Name: Almost 99% Almond Chocolate, Weight: 25.85, Unit Price: 31.40, Fabrication Date: 2022-02-18, Cocoa Percentage: 98.49%, Filling: Almond\n" +
"- Name: Chocolate Chips Cookie, Weight: 169.16, Unit Price: 29.33, Fabrication Date: 2023-05-06, Flour: Oats, Chips: Chocolate\n" +
"- Name: Strawberry Candy, Weight: 197.65, Unit Price: 23.85, Fabrication Date: 2022-02-28, Flavor: Strawberry, Wrapper: Paper\n" +
"- Name: Strong Chocolate, Weight: 250.22, Unit Price: 30.45, Fabrication Date: 2021-05-05, Cocoa Percentage: 60.44%, Filling: Almond\n" +
"- Name: Lemon Candy, Weight: 176.78, Unit Price: 13.76, Fabrication Date: 2021-08-21, Flavor: Lemon, Wrapper: Paper\n" +
"- Name: Gluten-Free Cookie, Weight: 167.52, Unit Price: 24.72, Fabrication Date: 2021-02-04, Flour: Gluten-Free, Chips: Chocolate\n" +
"- Name: Mint Candy, Weight: 21.54, Unit Price: 4.68, Fabrication Date: 2024-02-18, Flavor: Mint, Wrapper: Plastic\n" +
"- Name: Mild Chocolate, Weight: 34.48, Unit Price: 9.61, Fabrication Date: 2021-06-27, Cocoa Percentage: 21.29%, Filling: Hazelnut\n" +
"- Name: Boring Cookie, Weight: 264.13, Unit Price: 16.68, Fabrication Date: 2021-07-18, Flour: Oats, Chips: None\n" +
"- Name: Almost 99% Chocolate, Weight: 270.35, Unit Price: 18.55, Fabrication Date: 2022-03-25, Cocoa Percentage: 98.59%, Filling: Unfilled\n" +
"\n" +
"Invoices: 15\n" +
"- Candies Sold: 758\n" +
"- Chocolates Sold: 806\n" +
"- Cookies Sold: 420\n" +
"- Minimun Earnings: $477.00\n" +
"- Maximun Earnings: $5319.38\n" +
"- Total Earnings: $38056.11\n" +
"\n" +
"Areas:\n" +
"- PRODUCTION:\n" +
"  - Number of Employees: 4\n" +
"  - Number of Tasks: 11\n" +
"- SALES:\n" +
"  - Number of Employees: 1\n" +
"  - Number of Tasks: 1\n" +
"- DISTRIBUTION:\n" +
"  - Number of Employees: 3\n" +
"  - Number of Tasks: 9");
    }
    
    
    public void valueMostSpent(){
        
    }
}
