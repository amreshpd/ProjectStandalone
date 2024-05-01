package com.nt.model;

import lombok.Data;

@Data
public class Patient {
     private String patientName;
     private String patientCity;
     private String patientFname,patientState;
     private Long patientMbNo,patientId;
     private Integer patientAge;
     
}
/*
create table corona_details(patientName varchar2(150),patientCity varchar2(100),
patientMbNo number(15),patientId number(15),patientState varchar2(150),
patientFName varchar2(100),patientAge number(3),primary key(patientMbNo));



*/