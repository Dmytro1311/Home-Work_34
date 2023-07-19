package org.hillel.homework_34.mapp;

import org.hillel.homework_34.dto.ProductDto;
import org.hillel.homework_34.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(ProductDto dto);
    ProductDto toDto(Product entity);
    List<Product> toEntity(List<ProductDto> dtos);
    List<ProductDto> toDto(List<Product> entities);

}
