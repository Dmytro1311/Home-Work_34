package org.hillel.homework_34.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hillel.homework_34.dto.ProductDto;
import org.hillel.homework_34.mapp.ProductMapper;
import org.hillel.homework_34.repo.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class ProductService {

    private final ProductMapper mapper;
    private final ProductRepository repository;

    public List<ProductDto> getAll(){
        log.info("Getting all products");
        return mapper.toDto(repository.findAll());
    }
    public ProductDto getById(int id){
        log.info("Getting product by id {}",id);
        return mapper.toDto(repository.getReferenceById(id));
    }
    public ProductDto addProduct(ProductDto dto){
        log.info("Adding product {}",dto);
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }
    public void delete(int id){
        log.info("Deleting by id {}", id);
        repository.deleteById(id);
    }
}
