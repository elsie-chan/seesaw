package com.seesaw.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.Collection;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categories")
@Data
public class CategoryModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(
            name = "category_id",
            columnDefinition = "VARCHAR(255)"
    )
    private String id;

    @Column(name = "name_brand")
    private String name;

    private String description;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Collection<ProductModel> products;
}