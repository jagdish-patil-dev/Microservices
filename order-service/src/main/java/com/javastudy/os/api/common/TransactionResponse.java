package com.javastudy.os.api.common;

import com.javastudy.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private Order order;
    private double amount;
    private String transactionId;
    private String message;
    
    
	public TransactionResponse(Order order, double amount, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}
	public Order getOrder() {
		return order;
	}
	public double getAmount() {
		return amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public String getMessage() {
		return message;
	}
    
    
}
