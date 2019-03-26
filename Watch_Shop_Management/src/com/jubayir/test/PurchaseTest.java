package com.jubayir.test;

import com.jubayir.domain.ProductCategory;
import com.jubayir.domain.Purchase;
import com.jubayir.domain.User;
import com.jubayir.service.PurchaseService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User
 */
public class PurchaseTest {
    
    public static void main(String[] args) {
        //PurchaseService.createTable();

         Purchase purchase = new Purchase();
        PurchaseService.insert(purchase);

//        ProductCategory c = new ProductCategory();
//        c.setId(2);
//        User user = new User();
//        user.setId(1);
//        Purchase purchase = new Purchase("Casio", "casio_500", 20, 2500, 50000, new Date(), c, user);
//        PurchaseService.insertMain(purchase);



        List<Purchase> list = PurchaseService.getProductList();
        for(Purchase p : list)
        System.out.println(p);
    }
}
