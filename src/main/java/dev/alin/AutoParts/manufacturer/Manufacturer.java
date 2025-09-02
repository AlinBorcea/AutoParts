package dev.alin.AutoParts.manufacturer;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table
public class Manufacturer {
    @Id
    private long id;
    @Column
    private String name;

    public Manufacturer() {}

}
