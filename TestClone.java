
class TestClone{
	public static void main(String ...args) throws CloneNotSupportedException{
		Student s = new Student();
		s.setRollNumber(100);
		s.setName("Sumit");
		Student s1=(Student)s.clone(); 
		System.out.println(s1);
	}
}