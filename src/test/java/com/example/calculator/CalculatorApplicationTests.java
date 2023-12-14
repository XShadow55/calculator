package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

@SpringBootTest
class CalculatorApplicationTests {
	private final LogikCalculator calculator = new LogikCalculator();

	@ParameterizedTest
	@MethodSource("paramsForTest")
	void summaTest(int a,int b) {
		int result = calculator.getSum(a,b);

		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );
		int expected = a+b;
		Assertions.assertEquals(result,expected);
	}
	@ParameterizedTest
	@MethodSource("paramsForTest")
	void multiplyTest(int a,int b) {
		int result = calculator.getMultiplication(a,b);
		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );
		int expected = a*b;
		Assertions.assertEquals(result,expected);

	}
	@ParameterizedTest
	@MethodSource("paramsForTest")
	void differenceTest(int a,int b) {
		int result = calculator.getDifference(a,b);
		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );
		int expected = a-b;
		Assertions.assertEquals(result,expected);
	}

	@ParameterizedTest
	@MethodSource("paramsForTest")
	void divisionTest(int a,int b) throws DivisionNull {
		int  result = calculator.getDivision(a,b);
		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );
		int expected = a/b;
		Assertions.assertEquals(result,expected);

	}

	@Test
	void divisionTest2()  {
		Assertions.assertThrows(IllegalAccessException.class,() ->calculator.getDivision(1,0));

	}
	public static Stream<Arguments> paramsForTest(){
		return Stream.of(Arguments.of(3,6),Arguments.of(65,8));
	}



}
