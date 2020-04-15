package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.ProductCategoryMapper;
import com.example.model.ProductCategory;

@Service
public class CategoryServiceImpl implements CategoryService{

  @Autowired
  private ProductCategoryMapper categoryMapper;

  @Override
  public List<ProductCategory> findAll() {
    
    return categoryMapper.selectAll();
  }

}
