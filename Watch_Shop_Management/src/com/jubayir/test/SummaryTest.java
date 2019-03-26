package com.jubayir.test;

import com.jubayir.domain.Purchase;
import com.jubayir.domain.Summary;
import com.jubayir.service.SummaryService;
import java.util.Date;
import java.util.List;

public class SummaryTest {

    public static void main(String[] args) {
        // SummaryService.createTable();
           Purchase purchase = new Purchase();
        purchase.setId(1);
        Summary summary = new Summary("Casio", "CASIO_400", 5, 300, 500, new Date(), purchase);
        SummaryService.insert(summary);
         
//        List<Summary> list = SummaryService.getSummaryList();
//        for(Summary s: list){
//        System.out.println(s);
        }
    }
//}
