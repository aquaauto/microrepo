package com.demo.customer.bean;

import java.io.Serializable;
import java.util.UUID;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private UUID id;

	public Customer(String name, UUID id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

}
