/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sweetdelicacies;

import java.util.ArrayList;

import core.person.Client;
import core.person.Employee;
import core.sweetdelicacies.product.Product;

/**
 *
 * @author AAAAA
 */
public class SweetDelicacies {
    ArrayList<Client> clients;
    ArrayList<Employee> employees;
    ArrayList<Product> products;
    ArrayList<Invoice>invoices;
    public SweetDelicacies() {
        this.clients = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.products = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

    

    
}
