package id.ac.undiksha.siak.entities;

public class Staff {
	private String 	nip;
	private String 	name;
	private String 	address;
	private boolean gender;
	private String 	faculty;

	public Staff() {
		this.name 				= "<ivalid name>";
		this.address 			= "<ivalid address>";
		this.nip 				= "<ivalid nip>";
		this.faculty 			= "<ivalid faculty>";
	}


	public Staff(String nip, String name, String address, boolean gender, String faculty) {
		super();
		this.nip = nip;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.faculty = faculty;
	}


	public void printAllInfo() {
		System.out.println("NIP: " 				+ this.nip);
		System.out.println("Name: " 			+ this.name);
		System.out.println("Address: " 			+ this.address);
		System.out.println("Faculty: " 			+ this.faculty);
		
		System.out.println("Gender: " + 
				(gender ? "Male" : "Female"));
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getName() {
		return this.name;
	}
}





