package Extractresponse;

import java.util.Arrays;
import java.util.List;


public class Ext {
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private List<Details> data;
	private Asupport support;
	
	
	
	
	public Asupport getSupport() {
		return support;
	}
	public void setSupport(Asupport support) {
		this.support = support;
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public List<Details> getData() {
		return data;
	}
	public void setData(List<Details> data) {
		this.data = data;
	}
	

}
