/** 
 * <pre>项目名称:ssm_car 
 * 文件名称:EasyuiPage.java 
 * 包名:com.jk.sp.utils 
 * 创建日期:2019年2月15日下午2:38:32 
 * Copyright (c) 2019, 1207727105@qq.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

/** 
 * <pre>项目名称：ssm_car    
 * 类名称：EasyuiPage    
 * 类描述：    
 * 创建人：孙鹏  
 * 创建时间：2019年2月15日 下午2:38:32 
 * 人生感悟：天行健，君子以自强不息！
 * 修改人：孙鹏
 * 修改时间：2019年2月15日 下午2:38:32    
 * 修改备注：       
 * @version </pre>    
 */
public class EasyuiPage {

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
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "EasyuiPage [total=" + total + ", rows=" + rows + "]";
	}
	
}
