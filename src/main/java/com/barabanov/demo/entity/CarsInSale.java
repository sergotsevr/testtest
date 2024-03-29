package com.barabanov.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;


@SuperBuilder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class CarsInSale extends BaseEntity<Long>
{
    @ManyToOne
    Car car;

    @ManyToOne
    Sale sale;

    Integer quantity;
}
