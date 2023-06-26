package scripts;

import org.testng.annotations.Test;

import pages.FaceGenieLogin;
import pages.FaceGenieLogOut;
import pages.BaseClass;
import pages.DashBoard;
import pages.EditStudent;
import pages.ManageStudent;
import pages.AttendanceLogs;
import pages.SearchStudent;

public class LoginPage extends BaseClass {
	@Test
	  public void UserLogIn() throws InterruptedException {
		
		FaceGenieLogin dwslp= new FaceGenieLogin(driver);
		dwslp.LogIn();
		
		DashBoard dwsdb=new DashBoard(driver);
		dwsdb.Verify();
		Thread.sleep(2000);
   
		SearchStudent dwss=new SearchStudent(driver);
		dwss.Sel();
		Thread.sleep(3000);
		
		EditStudent dwes=new EditStudent(driver);
		dwes.editDetails();
		
		ManageStudent dwms=new ManageStudent(driver);
		dwms.Open();
		
		dwms.AddForm();
		
		
	     /*AttendanceLogs dw = new AttendanceLogs(driver);
		 dw.attendance_Over();*/
		 
		Thread.sleep(2000);
		FaceGenieLogOut dwslo= new FaceGenieLogOut(driver);
		dwslo.Logout();
		
		
	}

	

}
