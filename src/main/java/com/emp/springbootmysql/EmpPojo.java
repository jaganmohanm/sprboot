package com.emp.springbootmysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class EmpPojo {
@Id	
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "EmpPojo [id=" + id + ", name=" + name + "]";
}
}
