package com.newway.newwayapi.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Project extends AbstractEntity {

    @Column(nullable = false)
    private String name;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Developer developer;
    @ManyToMany
    @JoinTable(name = "project_tags", uniqueConstraints = @UniqueConstraint(columnNames = {"project_id", "tags_id"}))
    private List<Tag> tags;

}
