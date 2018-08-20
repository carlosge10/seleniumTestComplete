package test.testingXM;

import org.testng.annotations.Test;

public class NewTestSon extends NewTest{
	
  @Test
  public void f() {
	  try {
		  System.out.println(wd.getClass().toString());
		  System.out.println("this is the son speaking...");
		  assert(true);
	  }
	  catch(Exception e) 
	  {
		  assert(false);
	  }
  }

}

