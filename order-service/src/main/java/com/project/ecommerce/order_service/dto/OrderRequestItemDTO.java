package com.project.ecommerce.order_service.dto;

import com.project.ecommerce.order_service.entity.Orders;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class OrderRequestItemDTO {

    private Long id;
    private Long productId;
    private Integer quantity;
}
