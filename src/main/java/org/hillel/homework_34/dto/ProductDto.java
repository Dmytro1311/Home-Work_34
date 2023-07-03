package org.hillel.homework_34.dto;

import lombok.Data;

import javax.persistence.*;


@Data
public class ProductDto {


    int id;
    String name;
    double cost;

}
