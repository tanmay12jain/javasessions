package javaclasses;

import java.security.PublicKey;
import java.util.ArrayList;

public class FunctionTest {
	
	
	// WAF:
		// function name: getDevicesList
		// input param: empName
		// return: ArrayList<String> devicesList
	
	public ArrayList<String> getDevicesList(String empName) {
		System.out.println("getting device list for"+empName);
		ArrayList<String> deviceList = new ArrayList<String>();
		switch (empName) {
		case "srita":
			deviceList.add("mackbook");
			deviceList.add("iphone");
			deviceList.add("android");
			
			break;
			
		case "nukul":
			deviceList.add("mi");
			deviceList.add("iphone 14");
			deviceList.add("android 11");
			break;
			

		default: 
			System.out.println("employ name is not found");
			break;
		}
		return deviceList;
	}

	// WAF: function Name: getStudentMarks
	// input Param: studenName (String)
	// return: marks (int)
	// student not found --> return something
	
	public int getStudentMarks(String studentName) {
		int marks = -1;
		if(studentName.trim().equalsIgnoreCase("rajesh")) {
			marks= 90;
		}
		else if(studentName.trim().equalsIgnoreCase("manish")) {
			marks= 50;
		}
		else if(studentName.trim().equalsIgnoreCase("lavish")) {
			marks= 10;
		}
		else {
			System.out.println("student is not found");
		}
		return marks;
	}
	
	
	public int getMarks(String studentName) {
		
		System.out.println("Getting marks for student "+studentName);
		int marks = -1;
		switch (studentName.toLowerCase().trim()) {
		
		case "rajesh":
			marks = 90;
			break;
		case "mahesh":
			marks = 50;
			break;
		case "sulekh":
			marks = 10;
			break;

		default:
			System.out.println("no marksheet is ffound for student "+studentName);
			break;
		}
		return marks;
	}

	public static void main(String[] args) {
		
		FunctionTest obj = new FunctionTest();
		int markss=obj.getMarks(" 3453");
		System.out.println(markss);
		
		int m = obj.getStudentMarks("maniddsh");
		System.out.println(m);
		
		if (m==-1) {
			System.out.println("Marksheet can not be printed");
			
		}
		
		ArrayList<String> devices = obj.getDevicesList("nukul");
		System.out.println(devices);
		System.out.println(devices.size());
	

	}

}
