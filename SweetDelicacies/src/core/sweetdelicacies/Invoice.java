
package core.sweetdelicacies;

import java.time.LocalDate;
import java.util.ArrayList;

import core.person.Client;
import core.sweetdelicacies.product.Product;

public class Invoice {
    private static int ID = 0;
    
    private int id;
    private Client client;
    private ArrayList<Product> products;
    private ArrayList<Integer> quantities ;
    private LocalDate date;
    private float total;
    
    public Invoice(Client client, ArrayList<Product> products, ArrayList<Integer> quantities, LocalDate date) {
        this.id = Invoice.ID;
        this.client = client;
        this.products = products;
        this.quantities = quantities;
        this.date = date;
        this.total = 0;
        
        //ID autoincremental
        Invoice.ID++;
    }
    
    public void setClient(Client Client) {
        this.client = client;
    }
}
