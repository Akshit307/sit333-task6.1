package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "s224011787"; // <-- put your ID here
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Akshit Bhullar"; // <-- put your name here
		Assert.assertNotNull("Student name is null", studentName);
	}

	// ---- isEven tests ----

	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	}

	@Test
	public void testTrueNumberIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(4));
	}

	@Test
	public void testZeroIsEven() {
		Assert.assertTrue(WeatherAndMathUtils.isEven(0));
	}

	// ---- isPrime tests ----

	@Test
	public void testIsPrime_One() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}

	@Test
	public void testIsPrime_Two() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
	}

	@Test
	public void testIsPrime_Prime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
	}

	
	@Test
	public void testIsPrime_NotPrime() {
	    Assert.assertTrue(WeatherAndMathUtils.isPrime(9));
	}
	// ---- weatherAdvice - CANCEL tests ----

	@Test
	public void testCancelWeatherAdvice() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
	}

	@Test
	public void testCancelDangerousRain() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.1));
	}

	@Test
	public void testCancelCombined() {
		Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.1));
	}

	// ---- weatherAdvice - WARN tests ----

	@Test
	public void testWarnHighWind() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 2.0));
	}

	@Test
	public void testWarnHighRain() {
		Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(10.0, 5.0));
	}

	// ---- weatherAdvice - ALL CLEAR tests ----

	@Test
	public void testAllClear() {
		Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(10.0, 1.0));
	}
}