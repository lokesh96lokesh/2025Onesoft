package com.e_Book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class Order {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookId;
    private int quantity;
    private Double totalPrice;
    private String orderDate;

}
