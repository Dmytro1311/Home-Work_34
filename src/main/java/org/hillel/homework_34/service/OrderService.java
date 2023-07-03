package org.hillel.homework_34.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hillel.homework_34.dto.OrderDto;
import org.hillel.homework_34.mapp.OrderMapper;
import org.hillel.homework_34.repo.OrderRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;



@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class OrderService {

    private final OrderRepository repository;
    private final OrderMapper mapper;

    public List<OrderDto> getAll(){
        log.info("Getting all orders");
        return mapper.toDto(repository.findAll());
    }
    public OrderDto getById(int id){
        log.info("Getting order by id: {}", id);
        return mapper.toDto(repository.getReferenceById(id));
    }

    public OrderDto addOrder(OrderDto dto){
        log.info("Adding orders{} ", dto);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }
    public void delete(int id){
        log.info("deleting order by id {}",id);
        repository.deleteById(id);
    }

}
