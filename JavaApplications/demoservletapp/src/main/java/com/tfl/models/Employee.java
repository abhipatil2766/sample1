package com.tfl.models;

import jakarta.persistence.*;
 

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstName;

    // Getters and setters

    @Column(name = "lastname")
    private String lastName;

    public Employee() {
		super();
	}
	
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName =firstName;
		this.lastName = lastName;
	}

    public int getId() {
		return this.id;
	}

	public void setId(int  id) {
		this.id = id;
	}

    public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firsName) {
		this.firstName = firsName;
	}

    public String geLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
