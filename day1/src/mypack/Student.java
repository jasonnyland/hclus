package mypack;

public class Student {
	
	private String stuName;
	private String stuCity;
	private int stuGrade;
	public Student() {
		 
		System.out.println("its called without calling it");
 	}
	public Student(String stuName, String stuCity, int stuGrade) {
		super();
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.stuGrade = stuGrade;
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuCity=" + stuCity + ", stuGrade=" + stuGrade + "]";
	}
	
	
	
	
	

}
