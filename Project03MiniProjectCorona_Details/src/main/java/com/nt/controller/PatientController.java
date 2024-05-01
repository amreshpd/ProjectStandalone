package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Patient;
import com.nt.service.PatientManagement;

@Controller("pCont")
public class PatientController {
	@Autowired
    private PatientManagement ptm;
	
	 public List<Patient> viewPatientDetails(String state1,String state2,String state3)throws Exception{
     List<Patient> pt=ptm.fetchPatientDetails(state1, state2, state2);
     return pt;
	 }
}
