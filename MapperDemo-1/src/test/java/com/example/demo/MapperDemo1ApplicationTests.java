package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.model.ProductCategory;
import com.example.service.CategoryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class MapperDemo1ApplicationTests {

  @Autowired
  private CategoryService categoryService;
	@Test
	public void contextLoads() {
	  PageHelper.startPage(1, 5);
	  PageInfo<ProductCategory>cInfo=new PageInfo<ProductCategory>(categoryService.findAll());
	  System.out.println(cInfo.getList().toString());
	  PageHelper.startPage(1, 5);
      cInfo=new PageInfo<ProductCategory>(categoryService.findAll());
      System.out.println(cInfo.getList().toString());
	  
	}

}
