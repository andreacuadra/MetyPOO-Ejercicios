package models;

/**
 * @author Andrea
 * @version 1.0
 * @created 03-sep.-2024 17:52:56
 */
public class Admission {

	public Admission(){

	}


	/**
	 * 
	 * @param student
	 */
	public void calScholarship(student student){

		student.setSchoolarship(student.getAverage()>=80);



	}

}