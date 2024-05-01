package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.PatientController;
import com.nt.model.Patient;

@SpringBootApplication
public class Project03MiniProjectCoronaDetailsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
		SpringApplication.run(Project03MiniProjectCoronaDetailsApplication.class, args);
		PatientController control = ctx.getBean("pCont",PatientController.class);
		try {
			List<Patient> list1 = control.viewPatientDetails("Telangana", "Delhi", "Maharshtra");
		list1.forEach(ptm->{
			System.out.println(ptm);
		});
		System.out.println("All Details are here");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("Internal Problem");
		}
	
	}
}