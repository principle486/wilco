package com.wilco.manage.global.beans.product;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;


@Repository
@Alias("productBean")
public class ProductBean {
	
	private String pdMngId; 
	private String pdName;  
	private String pdPo; 
	private String pdPo2;
	private String pdValne;
	private String pdType;
	private String pdType2;
	private String pdPressure;
	private String pdDn;
	private String pdPaint;
	private String pdSta;
	private String pdUd;
	private String pdNo2;
	private String pdBody;
	private String pdDisk;
	private String pdScs13;
	private String regDm;
	private String regId;
	private String updDm;
	private String updId;
	
	
	public String getPdMngId() {
		return pdMngId;
	}
	public void setPdMngId(String pdMngId) {
		this.pdMngId = pdMngId;
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public String getPdPo() {
		return pdPo;
	}
	public void setPdPo(String pdPo) {
		this.pdPo = pdPo;
	}
	public String getPdPo2() {
		return pdPo2;
	}
	public void setPdPo2(String pdPo2) {
		this.pdPo2 = pdPo2;
	}
	public String getPdValne() {
		return pdValne;
	}
	public void setPdValne(String pdValne) {
		this.pdValne = pdValne;
	}
	public String getPdType() {
		return pdType;
	}
	public void setPdType(String pdType) {
		this.pdType = pdType;
	}
	public String getPdType2() {
		return pdType2;
	}
	public void setPdType2(String pdType2) {
		this.pdType2 = pdType2;
	}
	public String getPdPressure() {
		return pdPressure;
	}
	public void setPdPressure(String pdPressure) {
		this.pdPressure = pdPressure;
	}
	public String getPdDn() {
		return pdDn;
	}
	public void setPdDn(String pdDn) {
		this.pdDn = pdDn;
	}
	public String getPdPaint() {
		return pdPaint;
	}
	public void setPdPaint(String pdPaint) {
		this.pdPaint = pdPaint;
	}
	public String getPdSta() {
		return pdSta;
	}
	public void setPdSta(String pdSta) {
		this.pdSta = pdSta;
	}
	public String getPdUd() {
		return pdUd;
	}
	public void setPdUd(String pdUd) {
		this.pdUd = pdUd;
	}
	public String getPdNo2() {
		return pdNo2;
	}
	public void setPdNo2(String pdNo2) {
		this.pdNo2 = pdNo2;
	}
	public String getPdBody() {
		return pdBody;
	}
	public void setPdBody(String pdBody) {
		this.pdBody = pdBody;
	}
	public String getPdDisk() {
		return pdDisk;
	}
	public void setPdDisk(String pdDisk) {
		this.pdDisk = pdDisk;
	}
	public String getPdScs13() {
		return pdScs13;
	}
	public void setPdScs13(String pdScs13) {
		this.pdScs13 = pdScs13;
	}
	public String getRegDm() {
		return regDm;
	}
	public void setRegDm(String regDm) {
		this.regDm = regDm;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getUpdDm() {
		return updDm;
	}
	public void setUpdDm(String updDm) {
		this.updDm = updDm;
	}
	public String getUpdId() {
		return updId;
	}
	public void setUpdId(String updId) {
		this.updId = updId;
	}
	
	
	
}