public class Doctor {
	public void treatpatient() {
		System.out.println("the appointment on next monday");
	}

}
 class Patient extends Doctor{
	public void treatpatient() {
		System.out.println("booking cancelled");
	}

}

