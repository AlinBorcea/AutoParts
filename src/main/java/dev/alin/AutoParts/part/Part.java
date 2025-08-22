package dev.alin.AutoParts.part;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Part {

    @Id
    private long id;
    private String name;
    private String manufacturer;
    private int price;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }
}
