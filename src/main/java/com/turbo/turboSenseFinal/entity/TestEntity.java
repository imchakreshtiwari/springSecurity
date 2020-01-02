package com.turbo.turboSenseFinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private int orderNo;
	
	private String dbcol;
	
	private String mahindraCol;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getDbcol() {
		return dbcol;
	}

	public void setDbcol(String dbcol) {
		this.dbcol = dbcol;
	}

	public String getMahindraCol() {
		return mahindraCol;
	}

	public void setMahindraCol(String mahindraCol) {
		this.mahindraCol = mahindraCol;
	}
}
