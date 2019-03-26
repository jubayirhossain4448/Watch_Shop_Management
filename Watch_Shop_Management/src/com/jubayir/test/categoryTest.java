package com.jubayir.test;

import com.jubayir.domain.ProductCategory;
import com.jubayir.service.ProductCategoryService;
import java.util.Locale;

public class categoryTest {

    public static void main(String[] args) {
        //ProductCategoryService.createTable();
//        ProductCategory cat=new ProductCategory();
//        cat.setName("Men Watch");
//        
//        ProductCategoryService.insert(cat);

//        ProductCategory cat=new ProductCategory();
//        cat.setName("Ladies_Watch");
//        
//        ProductCategoryService.insert(cat);

ProductCategory cat=new ProductCategory();
        cat.setName("Children_Watch");
        
        ProductCategoryService.insert(cat);
    }
}
