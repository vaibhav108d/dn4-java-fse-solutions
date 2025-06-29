package demo;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator(); // Arrange
        int result = calculator.add(2, 3);        // Act
        assertEquals(5, result); // Assert
        response();
    }
    public void response(){
        System.out.println("JUnit Setup Complete");
    }
}