package org.hillel.homework_34.mapp;

import org.hillel.homework_34.dto.OrderDto;
import org.hillel.homework_34.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    Order toEntity(OrderDto dto);
    OrderDto toDto(Order entity);
    List<Order> toEntity(List<OrderDto> dtos);
    List<OrderDto> toDto(List<Order> entities);

}
