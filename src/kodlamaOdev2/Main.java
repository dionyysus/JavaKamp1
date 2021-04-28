package kodlamaOdev2;

public class Main {

	public static void main(String[] args) {
		Courses courses1 = new Courses(1,"C#","Engin Demirog",21);
		
		Courses courses2 = new Courses();
		
		courses2.id = 2;
		courses2.name = "Java";
		courses2.instructorName = "Engin Demirog";
		courses2.day = 16;
		
		Courses[] courses = {courses1, courses2};
		
		for(Courses course : courses)
		{
			System.out.println(course.name + " " + course.instructorName);
		}
		
		Profile profile1 = new Profile("Gizem","gizemcsk1@gmail.com",123456);
		
		Profile[] profiles = {profile1};
		
		for(Profile profile: profiles) {
			System.out.println("Name: " + profile.name + "\nMail: "+ profile.mail + "\nPassword: " + profile.password);
		}

	}

}
