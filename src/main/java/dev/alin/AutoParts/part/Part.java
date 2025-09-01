package dev.alin.AutoParts.part;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Getter
@Entity
@Data
@Table(name = "autoparts")
public class Part {

    @Id
    @Column(name = "part_id")
    private long id;
    @Column(name = "part_name")
    private String name;
    @Column(name = "part_manufacturer")
    private String manufacturer;
    @Column(name = "part_description")
    private String description;
    @Column(name = "part_price")
    private int price;

    public Part() {}

    public Part(long id, String name, String manufacturer, String description, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.description = description;
        this.price = price;
    }

}
