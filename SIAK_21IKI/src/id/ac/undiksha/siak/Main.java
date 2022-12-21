package id.ac.undiksha.siak;

import id.ac.undiksha.siak.entities.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		

			

			
			Lecturer std3 = new Lecturer(
					"696969",
					"Agus",
					"Singaraja",
					true,
					"Computer Science",
					"Informatics",
					"FTK"
			);
			
			std3.printAllInfo();

			Staff std4 = new Staff(
					"424242",
					"Agung",
					"Singaraja",
					true,
					"FTK"
			);
			
			std4.printAllInfo();
			
			//Person prs1 = new Person();
			//prs1.setName("Adi");
			
			//System.out.println(prs1.getName());
			
			/*Student std1 = new Student();
			std1.setName("Adi");
			std1.setAddress("Singaraja");
			std1.printAllInfo();
			
			System.out.println(std1.getName());*/
			
			Person siX = new Student();
			
			siX.getName();
			
			Person siY = new Person("Caca", "Denpasar", false);
			Student siZ = new Student("Doni", "Singaraja", true, "12345", "ILKOM", "TI", "FTK");
			Student siA = new Student("Caca", "Denpasar", false, "12345", "ILKOM", "TI", "FTK");
			
			siA.printAllInfo();
			
	}

}
