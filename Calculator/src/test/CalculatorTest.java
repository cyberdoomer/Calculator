package test;

import static org.junit.Assert.*;

import java.util.Random;

import main.BasicCalculator;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Random random = new Random();
		int a = random.nextInt(100);
		int b = random.nextInt(100);
		
		int answer = BasicCalculator.add(a, b);
		assertTrue(a +" + " +b + " = " +(a+b), answer == a+b);
	}

}
