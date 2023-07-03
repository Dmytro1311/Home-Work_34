package org.hillel.homework_34.dto;

import lombok.Data;
import org.hillel.homework_34.entity.Product;
import java.util.Date;
import java.util.List;


@Data
public class OrderDto {

    int id;
    Date date = new Date();
    double cost;
    List<Product> products;
}
