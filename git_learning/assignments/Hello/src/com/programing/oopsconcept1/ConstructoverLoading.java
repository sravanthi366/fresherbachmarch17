package com.programing.oopsconcept1;

public class ConstructoverLoading {
	 private int empId;
	    private String empName;
	    private int empAge;

	    //Non Parameterized Constructor - Default Data
	    ConstructoverLoading(){
	        empId = 99;
	        empName ="XYZ";
	        empAge = 25;
	    }
	    ConstructoverLoading(int empId){
	        this.empId = empId;
	        empName ="XYZ";
	        empAge = 25;
	    }
	    ConstructoverLoading(int empId, String empName){
	        this.empId = empId;
	        this.empName = empName;
	        empAge = 35;
	    }

	    ConstructoverLoading(int empId, String empName, int empAge){
	        this.empId = empId;
	        this.empName = empName;
	        this.empAge = empAge;
	    }

	    public static void main(String[] args) {

	    	ConstructoverLoading emp1 = new ConstructoverLoading(); //Default Data
	        System.out.println(emp1.empId);
	        System.out.println(emp1.empName);
	        System.out.println(emp1.empAge);

	        ConstructoverLoading emp2 = new ConstructoverLoading(125, "Java1", 29); //Default Data
	        System.out.println(emp2.empId);
	        System.out.println(emp2.empName);
	        System.out.println(emp2.empAge);

	        ConstructoverLoading emp3 = new ConstructoverLoading(126, "Java2", 30); //Default Data
	        System.out.println(emp3.empId);
	        System.out.println(emp3.empName);
	        System.out.println(emp3.empAge);

	        ConstructoverLoading emp4 = new ConstructoverLoading(145, "Java3"); //Default Data
	        System.out.println(emp4.empId);
	        System.out.println(emp4.empName);
	        System.out.println(emp4.empAge);

	    }

}
