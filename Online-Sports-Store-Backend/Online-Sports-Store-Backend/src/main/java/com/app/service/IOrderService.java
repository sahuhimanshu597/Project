package com.app.service;

import java.util.List;

import com.app.dto.OrderResponse;

public interface IOrderService {

	String placeOrderForUser(Integer userId, Integer addrId, String paymentMode);

	List<OrderResponse> getAllOrders();

	List<OrderResponse> getAllCustomerOrders(Integer userId);

	void assignEmployee(Integer userId, Integer orderId);

	List<OrderResponse> getAllAssignedOrders(Integer userId);

	void updateOrderStatus(Integer orderId, String status);
}
