
package core.sweetdelicacies.product;

import java.time.LocalDate;

public abstract class Product {
    
    protected String name;
    protected double weight;
    protected double unitPrice;
    protected LocalDate fabricationDate;
    
    public Product(String name, double weight, double unitPrice, LocalDate fabricationDate) {
        this.name = name;
        this.weight = weight;
        this.unitPrice = unitPrice;
        this.fabricationDate = fabricationDate;
    }
}

