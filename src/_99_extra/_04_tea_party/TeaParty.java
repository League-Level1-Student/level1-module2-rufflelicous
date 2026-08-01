package _99_extra._04_tea_party;

public class TeaParty {
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	String e = "Hello ";

    	if(isWoman == true && isKnighted == true) {
			e+= "Lady ";
		}
    	else if(isWoman == true && isKnighted == false) {
    		e+= "Ms. ";
    	}
    	else if(isWoman == false && isKnighted == false) {
    		e+= "Mr. ";
    	}
    	else {
    		e+= "Sir ";
    	}
    	e += name;
    	
    	return e;
        
    }
}
