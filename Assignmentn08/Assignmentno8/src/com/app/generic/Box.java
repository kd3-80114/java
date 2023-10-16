package com.app.generic;
import com.app.employees.*;

public class Box<T extends Employee> {
 private T obj;
public T getObj() {
	return obj;
}
public void setObj(T obj) {
	this.obj = obj;
}
 public void calculateSalaries()
 {
	  this.obj.calculateSalary();
 }
}
