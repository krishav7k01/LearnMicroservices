package com.project.ecommerce.order_service.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderRequestDTO {

    private long id;
    private List<OrderRequestItemDTO> items;
    private BigDecimal totalPrice;

}
