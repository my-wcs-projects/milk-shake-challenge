package net.aouali.milkshakechallenge.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int quantity;
    private String ingredientFar;
    public Recipe() {}
    public Recipe(String name, int quantity, String ingredientFar) {
        this.name = name;
        this.quantity = quantity;
        this.ingredientFar = ingredientFar;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIngredientFar() {
        return ingredientFar;
    }
    public void setIngredientFar(String ingredientFar) {
        this.ingredientFar = ingredientFar;
    }
}
