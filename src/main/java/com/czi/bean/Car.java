package com.czi.bean;

public class Car {

	private String CarNo;
	private String Manufacture;
	private String Model;
	private int KmsRan;
	private int PriceExpected;
	private int NoOfOwners;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Car(String carNo, String manufacture, String model, int kmsRan, int priceExpected, int noOfOwners) {
		super();
		CarNo = carNo;
		Manufacture = manufacture;
		Model = model;
		KmsRan = kmsRan;
		PriceExpected = priceExpected;
		NoOfOwners = noOfOwners;
	}


	public String getCarNo() {
		return CarNo;
	}
	public void setCarNo(String carNo) {
		CarNo = carNo;
	}
	public String getManufacture() {
		return Manufacture;
	}
	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getKmsRan() {
		return KmsRan;
	}
	public void setKmsRan(int kmsRan) {
		KmsRan = kmsRan;
	}
	public int getPriceExpected() {
		return PriceExpected;
	}
	public void setPriceExpected(int priceExpected) {
		PriceExpected = priceExpected;
	}
	public int getNoOfOwners() {
		return NoOfOwners;
	}
	public void setNoOfOwners(int noOfOwners) {
		NoOfOwners = noOfOwners;
	}
	
	
	
}
