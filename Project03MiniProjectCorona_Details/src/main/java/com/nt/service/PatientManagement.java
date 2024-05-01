package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.PatientDaoImpl;
import com.nt.model.Patient;

@Service("pService")
public class PatientManagement implements IPatientMgt {
	@Autowired
	private PatientDaoImpl pDao;
	
	@Override
	public List<Patient> fetchPatientDetails(String state1, String state2, String state3) throws Exception {
	List<Patient> list=pDao.getPatientDetails(state1, state2, state3);
	return list;
	}

}
