package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Patient;

@Repository("pDao")
public class PatientDaoImpl implements IPatientDao{
	public static final String GET_PATIENT_DETAILS="select patientName,patientCity,patientMbNo,patientId,patientState,patientFname,patientAge from corona_details where patientState IN (?,?,?) order by patientState";
	@Autowired
	private DataSource ds;		
	
   
	@Override
	public List<Patient> getPatientDetails(String state1, String state2, String state3) throws Exception{
		List<Patient> list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_PATIENT_DETAILS)){
			ps.setString(1, state1); 
			ps.setString(2, state2);
			ps.setString(3, state3);
	     try(ResultSet rs=ps.executeQuery()){
	    	 
	    	 list=new ArrayList<>();
	    	 while(rs.next()) {
	    		 Patient pt1=new Patient();
	    		 pt1.setPatientName(rs.getString(1));
	    		 pt1.setPatientCity(rs.getString(2));
	    		 pt1.setPatientMbNo(rs.getLong(3));
	    		 pt1.setPatientId(rs.getLong(4));
	    		 pt1.setPatientState(rs.getString(5));
	    		 pt1.setPatientFname(rs.getString(6));
	    		 pt1.setPatientAge(rs.getInt(7));
	    		 list.add(pt1);	    	 
	    	 }//end while
	     }//end res2			
		}//end try1
		catch (Exception e) {
			System.err.println(e.getMessage());
			throw e;
		}
		return list;
	}

}
