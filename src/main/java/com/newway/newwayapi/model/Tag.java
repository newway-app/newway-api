package com.newway.newwayapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Tag extends AbstractEntity {

    @Column(nullable = false, unique = true)
    private String name;
}
