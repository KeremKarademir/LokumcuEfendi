package com.lokumcuefendi.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FranchiserCandidate {
	private int tc;
	private String name;
	private String surname;
	private String address;
	private String phone;
	private String eMail;
	private String dateOfBirth;
	private boolean workedAsRetailer;
	private String causeOfPreference;
	private String locationOfFranchising;
	private int amountOfInvestment;
	private String additionalInfo;
	
	public FranchiserCandidate() {
		System.out.println("Franchiser created!!!");
	}
	
	public FranchiserCandidate(int tc, String name, String surname, String address, String phone, String eMail,
			String dateOfBirth, boolean workedAsRetailer, String causeOfPreference, String locationOfFranchising,
			int amountOfInvestment, String additionalInfo) {
		super();
		this.tc = tc;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
		this.eMail = eMail;
		this.dateOfBirth = dateOfBirth;
		this.workedAsRetailer = workedAsRetailer;
		this.causeOfPreference = causeOfPreference;
		this.locationOfFranchising = locationOfFranchising;
		this.amountOfInvestment = amountOfInvestment;
		this.additionalInfo = additionalInfo;
	}

	public void validatefake() {
		System.out.println("Franchiser validated.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isWorkedAsRetailer() {
		return workedAsRetailer;
	}
	public void setWorkedAsRetailer(boolean workedAsRetailer) {
		this.workedAsRetailer = workedAsRetailer;
	}
	public String getCauseOfPreference() {
		return causeOfPreference;
	}
	public void setCauseOfPreference(String causeOfPreference) {
		this.causeOfPreference = causeOfPreference;
	}
	public String getLocationOfFranchising() {
		return locationOfFranchising;
	}
	public void setLocationOfFranchising(String locationOfFranchising) {
		this.locationOfFranchising = locationOfFranchising;
	}
	public int getAmountOfInvestment() {
		return amountOfInvestment;
	}
	public void setAmountOfInvestment(int amountOfInvestment) {
		this.amountOfInvestment = amountOfInvestment;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public int getTc() {
		return tc;
	}

	public void setTc(int tc) {
		this.tc = tc;
	}
}
