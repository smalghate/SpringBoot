package com.shubham.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shubham.bean.EmployeeBean;

public class EmployeeService {
	
	private static Map<Long, EmployeeBean> employeeMap = new HashMap<>();
	private static Long index = 2L;
	
	static {
		EmployeeBean emp1 = new EmployeeBean(1L,"Shubham","5689568956",2000000L);
		EmployeeBean emp2 = new EmployeeBean(2L,"Aishwarya","9856895689",3000000L);
		employeeMap.put(1L, emp1);
		employeeMap.put(2L, emp2);
	}

	public static List<EmployeeBean> getAllEmployee(){
		return new ArrayList<>(employeeMap.values());
	}
	
	public static EmployeeBean getEmployeeDetailsById(Long id) {
		return employeeMap.get(id);
	}
	
	public static EmployeeBean addEmpoyee(EmployeeBean bean) {
		index = 1L;
		bean.setId(index);
		employeeMap.put(index, bean);
		return bean;
	}
	
	public static EmployeeBean deleteEmployeeById(Long id) {
		return employeeMap.remove(id);
	}
	
	public static EmployeeBean updateEmpoyee(Long id, EmployeeBean bean) {
		bean.setId(id);
		employeeMap.put(id, bean);
		return bean;
	}
	
}
