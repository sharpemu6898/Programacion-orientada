
package core.sweetdelicacies.product;

import java.time.LocalDate;

public abstract class Product {
    
    protected String name;
    protected float weight;
    protected float unitPrice;
    protected LocalDate fabricationDate;
    
    public Product(String name, float weight, float unitPrice, LocalDate fabricationDate) {
        this.name = name;
        this.weight = weight;
        this.unitPrice = unitPrice;
        this.fabricationDate = fabricationDate;
    }
}