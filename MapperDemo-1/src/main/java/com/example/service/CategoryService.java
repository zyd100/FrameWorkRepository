package com.example.service;

import java.util.List;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import com.example.model.ProductCategory;


public interface CategoryService {

  List<ProductCategory>findAll();

}
