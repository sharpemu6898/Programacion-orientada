package main;

import core.person.Client;
import core.person.Employee;
import core.sweetdelicacies.SweetDelicacies;
import core.sweetdelicacies.product.Product;
import core.sweetdelicacies.utils.Area;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainParcial2138 {
    
    public static void main(String[] args) {
        // Create SweetDelicacies
        SweetDelicacies sweetDelicacies = new SweetDelicacies();
        
        // Create Clients
        sweetDelicacies.addClient(new Client(200100000, "Magda Vincent", "2626 Peaceful Lane"));
        sweetDelicacies.addClient(new Client(200100001, "Max Vida", "1141 Alexander Drive"));
        sweetDelicacies.addClient(new Client(200100002, "Gwenddoleu Thacker", "2697 Heather Sees Way"));
        sweetDelicacies.addClient(new Client(200100003, "Devaki Hawk", "917 Irving Place"));
        sweetDelicacies.addClient(new Client(200100004, "Helena Browne", "2138 Franklee Lane"));
        
        // Create Employees
        sweetDelicacies.addEmployee(new Employee(200200000, "Hildefons Abioye", "Production Manager", 12, Area.PRODUCTION));
        sweetDelicacies.addEmployee(new Employee(200200001, "Jamila Merino", "Distribution Manager", 10, Area.DISTRIBUTION));
        sweetDelicacies.addEmployee(new Employee(200200002, "Chi Sniegowski", "Packer", 5, Area.DISTRIBUTION));
        sweetDelicacies.addEmployee(new Employee(200200003, "Fabius Boros", "Machine Operator", 6, Area.PRODUCTION));
        sweetDelicacies.addEmployee(new Employee(200200004, "Nyree Van der Venne", "Engineer", 10, Area.PRODUCTION));
        sweetDelicacies.addEmployee(new Employee(200200005, "Sveinn Klymenko", "Sales Manager", 15, Area.SALES));
        sweetDelicacies.addEmployee(new Employee(200200006, "Kasimir Hayden", "Packer", 2, Area.DISTRIBUTION));
        sweetDelicacies.addEmployee(new Employee(200200007, "Herakleides Aoyama", "Machine Operator", 1, Area.PRODUCTION));
        
        // Create Products
        sweetDelicacies.addProduct(new Chocolate("Almost 99% Almond Chocolate", 25.85, 31.40, LocalDate.of(2022, 2, 18), 98.49, "Almond"));
        sweetDelicacies.addProduct(new Cookie("Chocolate Chips Cookie", 169.16, 29.33, LocalDate.of(2023, 5, 6), "Oats", "Chocolate"));
        sweetDelicacies.addProduct(new Candy("Strawberry Candy", 197.65, 23.85, LocalDate.of(2022, 2, 28), "Strawberry", "Paper"));
        sweetDelicacies.addProduct(new Chocolate("Strong Chocolate", 250.22, 30.45, LocalDate.of(2021, 5, 5), 60.44, "Almond"));
        sweetDelicacies.addProduct(new Candy("Lemon Candy", 176.78, 13.76, LocalDate.of(2021, 8, 21), "Lemon", "Paper"));
        sweetDelicacies.addProduct(new Cookie("Gluten-Free Cookie", 167.52, 24.72, LocalDate.of(2021, 2, 4), "Gluten-Free", "Chocolate"));
        sweetDelicacies.addProduct(new Candy("Mint Candy", 21.54, 4.68, LocalDate.of(2024, 2, 18), "Mint", "Plastic"));
        sweetDelicacies.addProduct(new Chocolate("Mild Chocolate", 34.48, 9.61, LocalDate.of(2021, 6, 27), 21.29, "Hazelnut"));
        sweetDelicacies.addProduct(new Cookie("Boring Cookie", 264.13, 16.68, LocalDate.of(2021, 7, 18), "Oats", "None"));
        sweetDelicacies.addProduct(new Chocolate("Almost 99% Chocolate", 270.35, 18.55, LocalDate.of(2022, 3, 25), 98.59, "Unfilled"));
        
        // Create Invoices
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(5));
        quantities.add(3);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(47);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(1);
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(37);
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(2);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(46);
        products.add(sweetDelicacies.getProduct(3));
        quantities.add(29);
        products.add(sweetDelicacies.getProduct(8));
        quantities.add(29);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(1), products, quantities, LocalDate.of(2024, 5, 1));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(5));
        quantities.add(14);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(26);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(36);
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(12);
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(13);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(4), products, quantities, LocalDate.of(2024, 7, 27));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(36);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(24);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(4), products, quantities, LocalDate.of(2024, 6, 22));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(33);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(0), products, quantities, LocalDate.of(2024, 9, 12));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(3));
        quantities.add(16);
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(4);
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(21);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(2), products, quantities, LocalDate.of(2024, 9, 28));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(13);
        products.add(sweetDelicacies.getProduct(1));
        quantities.add(3);
        products.add(sweetDelicacies.getProduct(3));
        quantities.add(47);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(24);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(30);
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(13);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(3);
        products.add(sweetDelicacies.getProduct(5));
        quantities.add(1);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(2), products, quantities, LocalDate.of(2024, 11, 7));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(42);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(22);
        products.add(sweetDelicacies.getProduct(5));
        quantities.add(28);
        products.add(sweetDelicacies.getProduct(3));
        quantities.add(19);
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(11);
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(48);
        products.add(sweetDelicacies.getProduct(8));
        quantities.add(4);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(18);
        products.add(sweetDelicacies.getProduct(1));
        quantities.add(48);
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(15);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(3), products, quantities, LocalDate.of(2024, 5, 13));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(20);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(3), products, quantities, LocalDate.of(2024, 3, 17));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(8);
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(36);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(35);
        products.add(sweetDelicacies.getProduct(1));
        quantities.add(12);
        products.add(sweetDelicacies.getProduct(5));
        quantities.add(46);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(46);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(2), products, quantities, LocalDate.of(2024, 11, 14));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(7);
        products.add(sweetDelicacies.getProduct(5));
        quantities.add(1);
        products.add(sweetDelicacies.getProduct(8));
        quantities.add(13);
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(15);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(32);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(31);
        products.add(sweetDelicacies.getProduct(3));
        quantities.add(49);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(13);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(1), products, quantities, LocalDate.of(2024, 5, 2));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(6);
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(23);
        products.add(sweetDelicacies.getProduct(3));
        quantities.add(46);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(29);
        products.add(sweetDelicacies.getProduct(8));
        quantities.add(28);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(3), products, quantities, LocalDate.of(2024, 12, 21));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(1));
        quantities.add(39);
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(14);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(33);
        products.add(sweetDelicacies.getProduct(8));
        quantities.add(2);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(30);
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(29);
        products.add(sweetDelicacies.getProduct(3));
        quantities.add(9);
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(26);
        products.add(sweetDelicacies.getProduct(5));
        quantities.add(37);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(43);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(1), products, quantities, LocalDate.of(2024, 6, 6));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(2);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(22);
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(18);
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(20);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(24);
        products.add(sweetDelicacies.getProduct(8));
        quantities.add(49);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(1), products, quantities, LocalDate.of(2024, 11, 4));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(1));
        quantities.add(46);
        products.add(sweetDelicacies.getProduct(6));
        quantities.add(37);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(27);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(0), products, quantities, LocalDate.of(2024, 3, 12));

        products = new ArrayList<>();
        quantities = new ArrayList<>();
        products.add(sweetDelicacies.getProduct(2));
        quantities.add(48);
        products.add(sweetDelicacies.getProduct(0));
        quantities.add(42);
        products.add(sweetDelicacies.getProduct(1));
        quantities.add(1);
        products.add(sweetDelicacies.getProduct(7));
        quantities.add(1);
        products.add(sweetDelicacies.getProduct(8));
        quantities.add(16);
        products.add(sweetDelicacies.getProduct(9));
        quantities.add(6);
        products.add(sweetDelicacies.getProduct(4));
        quantities.add(49);
        sweetDelicacies.addInvoice(sweetDelicacies.getClient(4), products, quantities, LocalDate.of(2024, 10, 15));
        
        // Create Tasks
        sweetDelicacies.getEmployee(0).addTask(new Task(LocalDate.of(2021, 12, 9), 24));
        sweetDelicacies.getEmployee(4).addTask(new Task(LocalDate.of(2024, 5, 26), 9));
        sweetDelicacies.getEmployee(1).addTask(new Task(LocalDate.of(2023, 5, 11), 5));
        sweetDelicacies.getEmployee(0).addTask(new Task(LocalDate.of(2024, 5, 15), 17));
        sweetDelicacies.getEmployee(6).addTask(new Task(LocalDate.of(2021, 8, 23), 21));
        sweetDelicacies.getEmployee(3).addTask(new Task(LocalDate.of(2024, 3, 3), 11));
        sweetDelicacies.getEmployee(2).addTask(new Task(LocalDate.of(2024, 9, 10), 18));
        sweetDelicacies.getEmployee(3).addTask(new Task(LocalDate.of(2021, 6, 12), 13));
        sweetDelicacies.getEmployee(0).addTask(new Task(LocalDate.of(2023, 2, 26), 7));
        sweetDelicacies.getEmployee(0).addTask(new Task(LocalDate.of(2022, 12, 6), 9));
        sweetDelicacies.getEmployee(1).addTask(new Task(LocalDate.of(2023, 4, 9), 15));
        sweetDelicacies.getEmployee(1).addTask(new Task(LocalDate.of(2023, 3, 1), 29));
        sweetDelicacies.getEmployee(7).addTask(new Task(LocalDate.of(2023, 9, 5), 27));
        sweetDelicacies.getEmployee(5).addTask(new Task(LocalDate.of(2023, 8, 8), 12));
        sweetDelicacies.getEmployee(6).addTask(new Task(LocalDate.of(2022, 12, 13), 1));
        sweetDelicacies.getEmployee(4).addTask(new Task(LocalDate.of(2024, 2, 15), 16));
        sweetDelicacies.getEmployee(0).addTask(new Task(LocalDate.of(2023, 9, 4), 17));
        sweetDelicacies.getEmployee(3).addTask(new Task(LocalDate.of(2023, 7, 21), 27));
        sweetDelicacies.getEmployee(2).addTask(new Task(LocalDate.of(2021, 5, 13), 23));
        sweetDelicacies.getEmployee(6).addTask(new Task(LocalDate.of(2024, 12, 23), 18));
        sweetDelicacies.getEmployee(1).addTask(new Task(LocalDate.of(2024, 9, 6), 17));
        
        // Execute Methods
        sweetDelicacies.companySummary();
        System.out.println("The client who has spent the most is " + sweetDelicacies.clientMostSpent().getName() + " with $" + sweetDelicacies.valueMostSpent());
    }
    
}

/**
------------- Resultados -------------

---------- Company Summary ----------
Clients: 5
- Id: 200100000, Name: Magda Vincent, Address: 2626 Peaceful Lane, Invoices ID: [3, 13]
- Id: 200100001, Name: Max Vida, Address: 1141 Alexander Drive, Invoices ID: [0, 9, 11, 12]
- Id: 200100002, Name: Gwenddoleu Thacker, Address: 2697 Heather Sees Way, Invoices ID: [4, 5, 8]
- Id: 200100003, Name: Devaki Hawk, Address: 917 Irving Place, Invoices ID: [6, 7, 10]
- Id: 200100004, Name: Helena Browne, Address: 2138 Franklee Lane, Invoices ID: [1, 2, 14]

Employees: 8
- Id: 200200000, Name: Hildefons Abioye, Area: PRODUCTION, Position: Production Manager, Aging: 12, Tasks ID: [0, 3, 8, 9, 16]
- Id: 200200001, Name: Jamila Merino, Area: DISTRIBUTION, Position: Distribution Manager, Aging: 10, Tasks ID: [2, 10, 11, 20]
- Id: 200200002, Name: Chi Sniegowski, Area: DISTRIBUTION, Position: Packer, Aging: 5, Tasks ID: [6, 18]
- Id: 200200003, Name: Fabius Boros, Area: PRODUCTION, Position: Machine Operator, Aging: 6, Tasks ID: [5, 7, 17]
- Id: 200200004, Name: Nyree Van der Venne, Area: PRODUCTION, Position: Engineer, Aging: 10, Tasks ID: [1, 15]
- Id: 200200005, Name: Sveinn Klymenko, Area: SALES, Position: Sales Manager, Aging: 15, Tasks ID: [13]
- Id: 200200006, Name: Kasimir Hayden, Area: DISTRIBUTION, Position: Packer, Aging: 2, Tasks ID: [4, 14, 19]
- Id: 200200007, Name: Herakleides Aoyama, Area: PRODUCTION, Position: Machine Operator, Aging: 1, Tasks ID: [12]

Products: 10
- Name: Almost 99% Almond Chocolate, Weight: 25.85, Unit Price: 31.40, Fabrication Date: 2022-02-18, Cocoa Percentage: 98.49%, Filling: Almond
- Name: Chocolate Chips Cookie, Weight: 169.16, Unit Price: 29.33, Fabrication Date: 2023-05-06, Flour: Oats, Chips: Chocolate
- Name: Strawberry Candy, Weight: 197.65, Unit Price: 23.85, Fabrication Date: 2022-02-28, Flavor: Strawberry, Wrapper: Paper
- Name: Strong Chocolate, Weight: 250.22, Unit Price: 30.45, Fabrication Date: 2021-05-05, Cocoa Percentage: 60.44%, Filling: Almond
- Name: Lemon Candy, Weight: 176.78, Unit Price: 13.76, Fabrication Date: 2021-08-21, Flavor: Lemon, Wrapper: Paper
- Name: Gluten-Free Cookie, Weight: 167.52, Unit Price: 24.72, Fabrication Date: 2021-02-04, Flour: Gluten-Free, Chips: Chocolate
- Name: Mint Candy, Weight: 21.54, Unit Price: 4.68, Fabrication Date: 2024-02-18, Flavor: Mint, Wrapper: Plastic
- Name: Mild Chocolate, Weight: 34.48, Unit Price: 9.61, Fabrication Date: 2021-06-27, Cocoa Percentage: 21.29%, Filling: Hazelnut
- Name: Boring Cookie, Weight: 264.13, Unit Price: 16.68, Fabrication Date: 2021-07-18, Flour: Oats, Chips: None
- Name: Almost 99% Chocolate, Weight: 270.35, Unit Price: 18.55, Fabrication Date: 2022-03-25, Cocoa Percentage: 98.59%, Filling: Unfilled

Invoices: 15
- Candies Sold: 758
- Chocolates Sold: 806
- Cookies Sold: 420
- Minimun Earnings: $477.00
- Maximun Earnings: $5319.38
- Total Earnings: $38056.11

Areas:
- PRODUCTION:
  - Number of Employees: 4
  - Number of Tasks: 11
- SALES:
  - Number of Employees: 1
  - Number of Tasks: 1
- DISTRIBUTION:
  - Number of Employees: 3
  - Number of Tasks: 9

The client who has spent the most is Max Vida with $13161.10
*/