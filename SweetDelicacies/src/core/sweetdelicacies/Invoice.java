/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sweetdelicacies;

import java.time.LocalDate;
import java.util.ArrayList;

import core.person.Client;
import core.sweetdelicacies.product.Product;

/**
 *
 * @author AAAAA
 */
public class Invoice {
    private int id;
    private Client client;
    private ArrayList<Product> products;
    private ArrayList<Integer> quantities ;
    private LocalDate date;
    private float total;
    public Invoice(int id, Client client, ArrayList<Product> products, ArrayList<Integer> quantities, LocalDate date,
            float total) {
        this.id = id;
        this.client = client;
        this.products = products;
        this.quantities = quantities;
        this.date = date;
        this.total = total;
    }

    

    

    
}
