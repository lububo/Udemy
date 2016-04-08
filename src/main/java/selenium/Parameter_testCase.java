package selenium;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class Parameter_testCase {

	//defining parameters
	String firstName;
	String lastName;
	String password;
	int age;
	
	//third step
	public Parameter_testCase(String firstName,String lastName,String password, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.age = age;
	}
	//4 step
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data = new Object[2][4];
		//first row
		data[0][0]="Joy";
		data[0][1]="Smith";
		data[0][2]="Abcd";
		data[0][3]=18;
		// 2nd row
		data[1][0]="Tom";
		data[1][1]="Williams";
		data[1][2]="Abcde";
		data[1][3]=21;
		
		return Arrays.asList(data);
		
	}
	@Test
	public void doLogin(){
		System.out.println("FirstName "+ firstName+" Lastname "+lastName+" Password "+password+" Age "+ age);
		
	}
	
	
}
