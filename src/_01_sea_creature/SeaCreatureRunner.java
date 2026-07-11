package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature squidward = new SeaCreature("Squidward");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature spongebob = new SeaCreature("Spongebob");
		System.out.println(spongebob.getName());
		spongebob.eat();
		spongebob.laugh();
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		System.out.println(squidward.getName());
		squidward.eat();
		squidward.laugh();
	}

}
