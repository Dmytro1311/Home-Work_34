package org.hillel.homework_34.controller;

import lombok.RequiredArgsConstructor;
import org.hillel.homework_34.dto.OrderDto;
import org.hillel.homework_34.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;
    @GetMapping
    public ResponseEntity<List<OrderDto>> getAllOrders(){
        return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("/{id}")
    private ResponseEntity<OrderDto> getOrderById(@PathVariable("id") int id ){
        return ResponseEntity.ok(service.getById(id));
    }
    @PostMapping
    public ResponseEntity<OrderDto> addOrder(@RequestBody OrderDto orderDto){
        return ResponseEntity.ok(service.addOrder(orderDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")int id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }



}
