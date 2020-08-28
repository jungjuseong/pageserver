package com.clbee.pageserver.model;

import javax.persistence.*;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = true)
	private final String name;

	@Column(nullable = true)
	private final String email;

	Customer() {
		this(null,null);
	}

	Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Customer [" +
						"id=" + id +
						", name='" + name + '\'' +
						", email='" + email + '\'' +
						']';
	}
}
