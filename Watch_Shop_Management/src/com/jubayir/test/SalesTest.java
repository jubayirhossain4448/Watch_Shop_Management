package com.jubayir.test;

import com.jubayir.domain.Purchase;
import com.jubayir.domain.Sales;
import com.jubayir.domain.User;
import com.jubayir.service.SalesService;
import java.util.Date;

public class SalesTest {

    public static void main(String[] args) {
        //SalesService.createTable();
        
//        Purchase purchase = new Purchase();
//        purchase.setId(2);
//        User user = new User();
//        user.setId(2);
//        Sales sales = new Sales("Casio", "CASIO_400", 5, 250, 3000, new Date(), purchase, user);
//        SalesService.insert(sales);

        Purchase p = new Purchase();
        p.setId(16);

        /*  Sales sales = new Sales("Hp 6000 Laptop", "HP600", 5, 50000, 250000, new Date(), p);
        SalesService.insertForSales(sales);
         */
    }
}
