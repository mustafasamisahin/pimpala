package org.sami.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.sami.model.Product;
import org.sami.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RequiredArgsConstructor
@RestController
public class ProductController {

  private final ProductService productService;

  @PostMapping("/product")
  void saveProduct(Product product) {
    log.info("controller product: {}", product);
    productService.saveProduct(product);
  }

}
