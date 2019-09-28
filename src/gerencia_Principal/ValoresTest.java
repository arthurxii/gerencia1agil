package gerencia_Principal;

import org.junit.Test;

import junit.framework.TestCase;

public class ValoresTest extends TestCase {
	
	private Valores v;
	
	protected void setUp() throws Exception{
		
		super.setUp();
		v = new Valores();
		v.ins(5);
		v.ins(12);
		v.ins(1);
		v.ins(30);
		v.ins(152);
		v.ins(6);
		v.ins(6);
		v.ins(6);
		
	}
	
	@Test
	public void testIns() {
		v = new Valores();
		assertEquals(false,v.ins(-10));
		assertEquals(false,v.ins(0));
		assertEquals(0,v.greater());
		assertEquals(true,v.ins(11));
	}
	
	public void testDel() throws Exception {
		setUp();
		assertEquals(5,v.del(0));

	}
	
	public void testSize() throws Exception {
		setUp();
		
	}

}