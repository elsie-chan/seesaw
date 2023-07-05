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
@Table(name = "carts")
@Data
public class CartModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(
            columnDefinition = "VARCHAR(255)"
    )
    private String id;
    private Float total_amount;

    @OneToOne(targetEntity = UserModel.class)
    @JoinColumn(name = "user_id")
    private UserModel user;

    @OneToMany(mappedBy = "carts", targetEntity = CartDetailModel.class)
    private Collection<CartDetailModel> cart_detail;
}
