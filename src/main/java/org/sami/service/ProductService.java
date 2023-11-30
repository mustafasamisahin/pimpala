package org.sami.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sami.dto.ProductDto;
import org.sami.model.Product;
import org.sami.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public void saveProduct(Product product) {
    log.info("service product: {}", product);
    ProductDto productDto = ProductDto.builder()
                                      .name(product.getName())
                                      .price(product.getPrice())
                                      .build();

    log.info("service productdto: {}", productDto);
    productRepository.save(productDto);
  }
}
