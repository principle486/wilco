package com.wilco.manage.global.beans.common;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;


@Repository
@Alias("searchBean")
public class SearchBean {
	
	private String rowPerPage="10";		//페이지 ROW 수
	private String currentPage="1";		//현재 페이지
	private int intCurrentPage=0;
	private int pagePerPage=0;
	
	
	public String getRowPerPage() {
		return rowPerPage;
	}
	public void setRowPerPage(String rowPerPage) {
		this.rowPerPage = rowPerPage;
	}
	public String getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}
	public int getIntCurrentPage() {
		return intCurrentPage;
	}
	public void setIntCurrentPage(int intCurrentPage) {
		this.intCurrentPage = intCurrentPage;
	}
	public int getPagePerPage() {
		return pagePerPage;
	}
	public void setPagePerPage(int pagePerPage) {
		this.pagePerPage = pagePerPage;
	}
	
	
	
}