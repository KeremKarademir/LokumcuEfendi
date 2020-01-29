package com.lokumcuefendi.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class FranchiserDAO{
	
	@Autowired
	private JdbcTemplate template;
	
	
	/*
	 * 
	 * 
	 * 
	 * */
	
	public void add(FranchiserCandidate candidate) {
		String sql = "INSERT INTO bayiler "
				+ "(tc,ad,soyad,adres,telefon,email,dogumtarihi,WORKEDASRETAILER,CAUSEOFPREFERENCE,LOC,AMOUNT,ADDITIONAL)"
				+ " VALUES ("+candidate.getTc()+","+candidate.getName()+","+candidate.getSurname()+","+candidate.getAddress()+","+candidate.getPhone()+","+candidate.geteMail()+","+candidate.getDateOfBirth()+","+candidate.isWorkedAsRetailer()+","+candidate.getCauseOfPreference()+","+candidate.getLocationOfFranchising()+","+candidate.getAmountOfInvestment()+","+candidate.getAdditionalInfo()+")";
		
		template.update(sql);
	}


	public FranchiserDAO(JdbcTemplate template) {
		super();
		this.template = template;
	}
	
	
}
