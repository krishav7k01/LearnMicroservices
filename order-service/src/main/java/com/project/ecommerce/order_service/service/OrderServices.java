package com.project.ecommerce.order_service.service;

import com.project.ecommerce.order_service.dto.OrderRequestDTO;
import com.project.ecommerce.order_service.entity.Orders;
import com.project.ecommerce.order_service.repository.OrdersRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServices {

    private final OrdersRepository orderRepository;
    private final ModelMapper modelMapper;

    public List<OrderRequestDTO> getAllOrders() {
        log.info("Fetching all orders");
        List<Orders> orders = orderRepository.findAll();
        return orders.stream().map(order -> modelMapper.map(order, OrderRequestDTO.class)).toList();
    }

    public OrderRequestDTO getOrderById(Long id) {
        log.info("Fetching order with ID: {}", id);
        Orders order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        return modelMapper.map(order, OrderRequestDTO.class);
    }


}
