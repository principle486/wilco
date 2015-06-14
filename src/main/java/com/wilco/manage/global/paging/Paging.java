package com.wilco.manage.global.paging;

import java.util.List;


public class Paging {

	int totalCount;  //총 데이터
	int currentPage; //현재 페이지
	int rowPerPage; //현재 페이지 보여주는 
	int pagePerPage; //페이지 번호 
	int firstPage; //현재 첫페이지 번
	int lastPage; //
	private List list;

	public Paging(List list, int totalCount ,int currentPage, int rowPerPage){
		this.list = list;
		this.totalCount=totalCount;
		this.currentPage=currentPage;
		this.rowPerPage=rowPerPage;
		
		/* 총 데이터가 현재 페이지 보여줘야 하는 수보다 클때 pagePerPage Setting */
		if (totalCount > rowPerPage){
			this.pagePerPage = (totalCount / rowPerPage) + 1;
			System.out.print("pagePerPage==>" + pagePerPage);
		}else{
			pagePerPage = 1;
		}
		
		/* 데이터가 많아지면 로직 개발 필요 */
		this.firstPage = 1;
		this.lastPage = list.size();
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRowPerPage() {
		return rowPerPage;
	}

	public void setRowPerPage(int rowPerPage) {
		this.rowPerPage = rowPerPage;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public int getPagePerPage() {
		return pagePerPage;
	}

	public void setPagePerPage(int pagePerPage) {
		this.pagePerPage = pagePerPage;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}
	
	
	
}