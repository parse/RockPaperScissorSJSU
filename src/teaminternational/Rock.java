package teaminternational;

public class Rock extends Throw {
	
	public int compareTo (Throw t) {	    
	    if (t instanceof Paper) {
	    	return BEFORE;
	    } else if (t instanceof Scissor) {
	    	return AFTER;
	    } else if (t instanceof Rock) {
	    	return EQUAL;
	    } else {
	    	return EQUAL;
	    }
	}
	
	public String toString() {
		return "Rock";
	}
}
