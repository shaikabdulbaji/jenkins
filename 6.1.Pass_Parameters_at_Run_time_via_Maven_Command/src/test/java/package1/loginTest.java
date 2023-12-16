package package1;

import java.util.Properties;

import org.testng.annotations.Test;

public class loginTest {

	@Test
	public void login() throws Exception {
		
		//Read MyProject.properties
		Properties prop = new Properties();

		// Load properties file
		prop.load(loginTest.class.getClassLoader().getResourceAsStream("MyProject.properties"));

		String uName = prop.getProperty("uName");// AgentHunt
		String pwd = prop.getProperty("Pwd");// MissionImpossible

		System.out.println("Username Value is ==> " + uName);
		System.out.println("Password Value is ==> " + pwd);

		// Run CMD- mvn -Dusername=AgentHunt -Dpassword=MissionImpossible clean install

	}
}
