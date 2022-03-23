package com.javastudy.os.api.common;

import com.javastudy.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Order order;
    private Payment payment;
	public Order getOrder() {
		return order;
	}
	public Payment getPayment() {
		return payment;
	}
    
    
}
