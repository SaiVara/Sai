//real world object
public class Person {
	String name;
	String gender;
	String ContactNo;
	String Address;
	public Person(String name, String gender, String contactNo, String address) {
		this.name = name;
		this.gender=gender;
		this.ContactNo = contactNo;
		this.Address = address;
	}
	public static void main(String []args) {
		Person object=new Person("Vara","Male","+16047296957","Vancouver,Canada");
		System.out.println("Name of the person "+object.name);
		System.out.println("Gender of the person is "+object.gender);
		System.out.println("ContactNo: "+object.ContactNo+" ,Address "+object.Address);
		
	}

}
