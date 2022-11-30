package com.app.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cart")
@NoArgsConstructor
@Getter
@Setter
public class Cart extends BaseEntity{
	
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product selectedProduct;
	
	@OneToOne
	@JoinColumn(name="customer_id")
	private User currentCustomer;

	public Cart(int quantity, Product selectedProduct, User currentCustomer) {
		super();
		this.quantity = quantity;
		this.selectedProduct = selectedProduct;
		this.currentCustomer = currentCustomer;
	}
	
	@Override
	public String toString() {
		return "Cart [ID=" + getId() + ",quantity=" + quantity + "]";
	}
	
}
