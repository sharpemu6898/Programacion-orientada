
package core.sweetdelicacies.product;

import java.time.LocalDate;

public abstract class Product {
    String name;
    float weight;
    float unitPrice;
    LocalDate fabricationDate;
    public Product(String name, float weight, float unitPrice, LocalDate fabricationDate) {
        this.name = name;
        this.weight = weight;
        this.unitPrice = unitPrice;
        this.fabricationDate = fabricationDate;
    }

    

    
}
