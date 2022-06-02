package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
		@Id
		@GeneratedValue
		private int empId;
		
		private String empName;
		
		private double empSalary;
		
		private String empCity;

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public double getEmpSalary() {
			return empSalary;
		}

		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}

		public String getEmpCityString() {
			return empCity;
		}

		public void setEmpCityString(String empCityString) {
			this.empCity = empCityString;
		}
		
		
}
