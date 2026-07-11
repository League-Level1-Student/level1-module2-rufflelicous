package _02_smurf;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=7-RDGT5Lsp8 
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3. & 4. see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		if(name == "Smurfette") {
			return "My name is "+name+".";
		}
		else {
		return "My name is " + name + " Smurf.";
		}
	}

	public String eat() {
		if(name == "Smurfette") {
			return name + " is eating Smurfberries.";		
			}
		else {
			return name + " Smurf is eating Smurfberries.";
		}
		}

	// Papa Smurf wears a red hat, all the others are white.
	public String getHatColor() {
		// 3. Fill in this method
		if(name == "Papa") {
			return name + " Smurf wears a red hat.";
		}
		else if(name == "Smurfette") {
			return name + " wears a white hat.";		
			}
		else {
		return name + " Smurf wears a white hat.";
		}
	}

	// Smurfette is the only female Smurf.
	public String isGirlOrBoy() {
		if(name == "Smurfette") {
			return name + " is a girl. \n";
		}
		// 4. Fill in this method
		else if(name == "Handy") {
			return name + " Smurf is a boy. \n";
		}
		else {
			return name + " Smurf is a boy.";
		}
	}

}


