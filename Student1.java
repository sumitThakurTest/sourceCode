 
class Student  implements Cloneable {
	private int rollNumber;
	private String name ;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		 this.name=name;
	}
	
	
	public int getRollNumber(){
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber){
		 this.rollNumber=rollNumber;
	}
	
	public  Student clone() throws CloneNotSupportedException{
		return (Student)super.clone();
	}
	
}