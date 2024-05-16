package com.productservice.demo.model;

import org.springframework.data.annotation.Id;


public class productservice {
    @Id
    String id;
    String productName;
    String userId;
    Integer productQuantity;
}
