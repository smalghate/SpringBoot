package com.shubham.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class EmployeeBean {
private Long id;
private String name;
private String mobile;
private Long salary;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}
/**
 * @param id
 * @param name
 * @param mobile
 * @param salary
 */
public EmployeeBean(Long id, String name, String mobile, Long salary) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
	this.salary = salary;
}

}
