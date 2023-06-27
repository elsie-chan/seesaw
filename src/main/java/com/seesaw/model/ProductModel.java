package com.seesaw.model;

import java.util.Collection;
import java.util.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@Data
public class ProductModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(
            name = "product_id",
            columnDefinition = "VARCHAR(255)"
    )
    private String id;

    @Column(name = "name_product")
    private String name;
    private String description;
    private Float price;
    private Integer quantity;
    private String image_path;
    private Date date_created;
    private Date date_updated;

    @ManyToOne
    @JoinColumn(name = "collection_id")
    private CollectionModel collection;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;

    @OneToMany(mappedBy = "products",cascade = CascadeType.ALL)
    private Collection<FeedbackModel> feedbacks;

    @OneToMany(mappedBy = "products",cascade = CascadeType.ALL)
    private Collection<InvoiceModel> invoices;

    @OneToMany(mappedBy = "products",cascade = CascadeType.ALL)
    private Collection<CartDetailModel> cart_detail;
}