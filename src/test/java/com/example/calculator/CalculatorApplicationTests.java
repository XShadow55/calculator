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
	@MethodSource("paramsForTestSumma")
	void summaTest() {
		int result = calculator.getSum(2,4);
		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );
	}
	@ParameterizedTest
	@MethodSource("paramsForTestSumma")
	void multiplyTest() {
		int result = calculator.getMultiplication(2,4);
		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );

	}
	@ParameterizedTest
	@MethodSource("paramsForTestSumma")
	void differenceTest() {
		int result = calculator.getDifference(2,4);
		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );


	}

	@ParameterizedTest
	@MethodSource("paramsForTestSumma")
	void divisionTest() throws DivisionNull {
		int  result = calculator.getDivision(2,4);
		Assertions.assertNotNull(result);
		Assertions.assertDoesNotThrow(() -> result );

	}

	@Test
	void divisionTest2()  {
		Assertions.assertThrows(IllegalAccessException.class,() ->calculator.getDivision(1,0));

	}
	public static Stream<Arguments> paramsForTestSumma(){
		return Stream.of(Arguments.of(3,6),Arguments.of(65,8));
	}
	public static Stream<Arguments> paramsForTestMultiply(){
		return Stream.of(Arguments.of(3,6),Arguments.of(65,8));
	}
	public static Stream<Arguments> paramsForTestDifference(){
		return Stream.of(Arguments.of(3,6),Arguments.of(65,8));
	}
	public static Stream<Arguments> paramsForTestDivision(){
		return Stream.of(Arguments.of(3,6),Arguments.of(65,8));
	}


}
