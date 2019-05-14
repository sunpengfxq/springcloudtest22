package com.jk.utils;

public class ResultUtil {

	private Integer total;
	
	private Object rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Object getRows() {
		return rows;
	}

	public void setRows(Object rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "ResultUtil [total=" + total + ", rows=" + rows + "]";
	}
	
	
}
