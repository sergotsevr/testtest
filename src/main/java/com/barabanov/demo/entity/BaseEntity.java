package com.barabanov.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@SuperBuilder
@MappedSuperclass
public abstract class BaseEntity<T extends Serializable>
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private T id;
}
