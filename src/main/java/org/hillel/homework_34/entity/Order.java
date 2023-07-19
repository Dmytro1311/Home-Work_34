package org.hillel.homework_34.entity;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="orders")
@Getter
@Setter
@RequiredArgsConstructor
public class Order  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Date date = new Date();
    double cost;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "order_products" ,
            joinColumns ={@JoinColumn(name = "order_id")} ,
            inverseJoinColumns = {@JoinColumn(name = "product_id")}
    )
    List<Product> products;
}
