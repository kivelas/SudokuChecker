import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String tc2 = "+17369825632158947958724316825437169791586432346912758289643571573291684164875293";
String tc3 = "-417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String tc5 = "123123123456456456789789789234234234567567567891891891345345345678678678912912912";
String tc6 = "123456789456789123789123456123456789456789123789123456123456789456789123789123456";
String tc7 = "41736982563215894795872431682543716979158643234691275828964357157329168416487529";
String tc8 = "4173698256321589479587243168254371697915864323469127582896435715732916841648752933";
String tc9 = "017369825632158947958724316825437169791586432346912758289643571573291684164875293";
SudokuVerifier v = new SudokuVerifier();

	@Test //TC1
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test //TC4 is covered with this
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}
	
	@Test //TC2
	public void testNaughtyString() {
		int a = v.verify(tc2);
		assertEquals("naughty string", a, 1);
	}
	
	@Test //TC3
	public void testNegativeString() {
		int a = v.verify(tc3);
		assertEquals("negative string", a, -1);
	}
	
	@Test //TC5
	public void testIncorrectStringByRow() {
		int a = v.verify(tc5);
		assertEquals("incorrect string by row", a, -3);
	}
	
	@Test //TC6
	public void testIncorrectStringByColumn() {
		int a = v.verify(tc6);
		assertEquals("incorrect string by column", a, -4);
	}
	
	@Test //TC7
	public void testShortString() {
		int a = v.verify(tc7);
		assertEquals("short string", a, -1);
	}
	
	@Test //TC8
	public void testLongString() {
		int a = v.verify(tc8);
		assertEquals("long string", a, -1);
	}
	
	@Test //TC9
	public void testStringWith0() {
		int a = v.verify(tc9);
		assertEquals("string with 0", a, -1);
	}
}
