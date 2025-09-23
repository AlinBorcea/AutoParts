package dev.alin.AutoParts.manufacturer;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@Table
public class Manufacturer {
    @Id
    private long id;
    @Column
    private String name;

    @Column
    @ColumnDefault("")
    private String description;

    public Manufacturer() {}

}
