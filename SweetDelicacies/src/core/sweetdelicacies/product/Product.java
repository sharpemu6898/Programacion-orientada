/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.sweetdelicacies.product;

import java.time.LocalDate;

/**
 *
 * @author AAAAA
 */
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
