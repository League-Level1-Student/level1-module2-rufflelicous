package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf("Papa");
		Smurf ette = new Smurf("Smurfette");		
		//shocked face expression
		
		System.out.println(ette.getName());
		System.out.println(ette.eat());
		System.out.println(ette.getHatColor());
		System.out.println(ette.isGirlOrBoy());
		
		System.out.println(handy.getName());
		System.out.println(handy.eat());
		System.out.println(handy.getHatColor());
		System.out.println(handy.isGirlOrBoy());
		
		System.out.println(papa.getName());
		System.out.println(papa.eat());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
	}

}
