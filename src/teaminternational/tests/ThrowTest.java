package teaminternational.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import teaminternational.Throw;
import teaminternational.Rock;
import teaminternational.Paper;
import teaminternational.Scissor;

public class ThrowTest {
	final static int BEFORE = -1;
	final static int EQUAL 	= 0;
	final static int AFTER 	= 1;
	
	@Test public void throwRockPaper() {
		Throw t1 = new Rock();
		Throw t2 = new Paper();
		
		assertEquals(t1.compareTo(t2), AFTER); 
	}
	
	@Test public void throwScissorPaper() {
		Throw t1 = new Scissor();
		Throw t2 = new Paper();
		
		assertEquals(t1.compareTo(t2), BEFORE); 
	}
	
	@Test public void throwPaperPaper() {
		Throw t1 = new Paper();
		Throw t2 = new Paper();
		
		assertEquals(t1.compareTo(t2), EQUAL); 
	}
	
	@Test public void throwScissorRock() {
		Throw t1 = new Scissor();
		Throw t2 = new Rock();
		
		assertEquals(t1.compareTo(t2), AFTER); 
	}
	
	@Test public void throwPaperRock() {
		Throw t1 = new Paper();
		Throw t2 = new Rock();
		
		assertEquals(t1.compareTo(t2), BEFORE); 
	}
	
	@Test public void throwRockRock() {
		Throw t1 = new Rock();
		Throw t2 = new Rock();
		
		assertEquals(t1.compareTo(t2), EQUAL); 
	}
	
	@Test public void throwScissorScissor() {
		Throw t1 = new Scissor();
		Throw t2 = new Scissor();
		
		assertEquals(t1.compareTo(t2), EQUAL); 
	}
	
	@Test public void throwRockScissor() {
		Throw t1 = new Rock();
		Throw t2 = new Scissor();
		
		assertEquals(t1.compareTo(t2), BEFORE); 
	}
}
