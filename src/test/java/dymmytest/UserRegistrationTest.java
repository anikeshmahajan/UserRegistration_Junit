package dymmytest;

import org.junit.Test;


import junit.framework.Assert;

import static org.junit.Assert.*;


 

public class UserRegistrationTest {

   
	@Test
	public void givenFirstname_WhenProper_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.validate("Anikesh");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenFirstname_WhenShort_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.validate("Ma");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenFirstname_WhenSmall_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.validate("anikesh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenLastname_WhenProper_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.validatelastName("Mahajan");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenLastname_WhenShort_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.validatelastName("Ma");
		Assert.assertEquals(false, result);
	}
	@Test
	public void givenLastname_WhenSmall_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.validatelastName("anikesh");
		Assert.assertEquals(false, result);
	}
	
	
	@Test
	public void givenMobileNo_WhenProper_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.checkMobileNo("91 9149820208");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNo_WhenSmall_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.checkMobileNo("91 91490208");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenMobileNo_WhenGreater_ShouldReturnFalse(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.checkMobileNo("91 4567791490208");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.checkEmailId("anikesh0725@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue(){
		UserRegistration classUnderTest = new UserRegistration();
		boolean result =classUnderTest.passwordValid("Anikesh@123233");
		Assert.assertEquals(true, result);
	}
	
	
	
	
	
}
