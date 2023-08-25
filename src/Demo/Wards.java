package Demo;

public class Wards implements Hospital{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hosp = new Wards();
		hosp.surgeryWard();
		hosp.covidWard();

	}

	@Override
	public void cancerWard() {
		// TODO Auto-generated method stub
		System.out.println("Only Cancer patients are allowed.");
	}

	@Override
	public void childrenWard() {
		// TODO Auto-generated method stub
		System.out.println("No adult patients are allowed.");
	}

	@Override
	public void surgeryWard() {
		// TODO Auto-generated method stub
		System.out.println("Patients only for surgery are treated.");
	}

	@Override
	public void icu() {
		// TODO Auto-generated method stub
		System.out.println("Only critical patients are treated.");
	}

	@Override
	public void covidWard() {
		// TODO Auto-generated method stub
		System.out.println("Danger ward.");
	}
}
