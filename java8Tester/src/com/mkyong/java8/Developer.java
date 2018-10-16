/**
 * 
 */
package com.mkyong.java8;

import java.math.BigDecimal;

/**
 * @author ongOngongPC
 *
 */
public class Developer {
	
	public Developer(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	private String name ;
	private BigDecimal salary ;
	private int age ;

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName().concat(getSalary().toString()).concat(String.valueOf(this.getAge()) ) ;
		//return super.toString();
	}

}
