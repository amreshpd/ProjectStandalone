package com.nt.service;

import java.util.List;

import com.nt.model.Patient;

public interface IPatientMgt {
	 public List<Patient> fetchPatientDetails(String state1,String state2,String state3) throws Exception;
}
