package dev.alin.AutoParts.part;

import dev.alin.AutoParts.manufacturer.Manufacturer;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Getter
@Entity
@Data
@Table(name = "autoparts")
public class Part {

    @Id
    private long id;
    @Column()
    private String name;
    @ManyToOne
    @JoinColumn(name = "manufacturer_id", nullable = false)
    private Manufacturer manufacturer;
    @Column()
    private String description;
    @Column()
    private int price;

    public Part() {}
}