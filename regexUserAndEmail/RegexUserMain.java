package regexUserAndEmail;

import java.util.ArrayList;

public class RegexUserMain {
	public static void main(String[] args) {
		ArrayList<String>validEmail=new ArrayList<>();
		validEmail.add("abc@yahoo.com");
		validEmail.add("abc-100@yahoo.com");
		validEmail.add("abc.100@yahoo.com");
		validEmail.add("abc111@abc.com");
		validEmail.add("abc-100@abc.net");
		validEmail.add("abc.100@abc.com.au");
		validEmail.add("abc@1.com");
		validEmail.add("abc@gmail.com.com");
		validEmail.add("abc+100@gmail.com");
		//		validEmail.add(null);
		//		validEmail.add(null);

		EmailValidator emailValidator = new EmailValidator();


		for(String email:validEmail) {
			System.out.println(email + "  is valid= " + emailValidator.validate(email));
		}

		System.out.println( "-----------------------------INVALID EMAIL-------------------------------------" );

		ArrayList<String>invalidEmail=new ArrayList<>();
		invalidEmail.add("abc");
		invalidEmail.add("abc@.com.my");
		invalidEmail.add("abc123@gmail.a");
		invalidEmail.add("abc123@.com");
		invalidEmail.add("abc123@.com.com");
		invalidEmail.add(".abc@abc.com");
		invalidEmail.add("abc()*@gmail.com ");
		invalidEmail.add("abc@%*.com");
		invalidEmail.add("abc..2002@gmail.com");
		invalidEmail.add("abc@abc@gmail.com ");
		invalidEmail.add("abc.@gmail.com");
		invalidEmail.add(" abc@gmail.com.1a");
		invalidEmail.add("abc@gmail.com.aa.au ");


		for(String email:invalidEmail) {
			System.out.println(email + "  is valid= " + emailValidator.validate(email));
		}
		System.out.println( "-----------------------------FIRSTNAME------------------------------------" );

		ArrayList<String>userName=new ArrayList<>();
		userName.add("Abhishek");
		userName.add("Rahul");
		userName.add("Abhi");
		userName.add("shek");
		for(String email:userName) {
			System.out.println(email + "  is valid= " + emailValidator.validate(email));
		}
		System.out.println( "------------------------------LASTNAME-------------------------------------" );

		ArrayList<String>lastName=new ArrayList<>();
		lastName.add("Abhishek");
		lastName.add("Rahul");
		lastName.add("Abhi");
		lastName.add("shek");
		for(String email:lastName) {
			System.out.println(email + "  is valid= " + emailValidator.validate(email));
		}
		System.out.println( "------------------------------PHONENO-------------------------------------" );

		ArrayList<String>PH=new ArrayList<>();
		PH.add("919810175342");
		PH.add("9198342");
		PH.add("919810175346");
		PH.add("919810175344");
		for(String email:PH) {
			System.out.println(email + "  is valid= " + emailValidator.validate(email));
		}
		System.out.println( "------------------------------Password-------------------------------------" );

		ArrayList<String>Pass=new ArrayList<>();
		Pass.add("Engineer@21");
		Pass.add("Abhishek@123");
		Pass.add("abc@xyz");
		Pass.add("998272");
		for(String email:Pass) {
			System.out.println(email + "  is valid= " + emailValidator.validate(email));
		}

	}


}
