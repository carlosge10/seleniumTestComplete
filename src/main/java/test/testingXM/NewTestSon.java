package test.testingXM;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class NewTestSon extends NewTest{
	
  @Test
  public void f1() {
	  try {
		  int rand1 = gen.nextInt() % 10;
		  if(rand1>0)
			  assert(true);
		  else
			  assertTrue(false, "bad luck");
	  }
	  catch(Exception e) 
	  {
		  assert(false);
	  }
  }
  
  @Test
  public void f2() {
	  try {
		  int rand1 = gen.nextInt() % 10;
		  if(rand1>-5)
			  assert(true);
		  else
			  assertTrue(false, "bad luck");
	  }
	  catch(Exception e) 
	  {
		  assert(true);
	  }
  }
  
  @Test
  public void f3() {
	  try {
		  assert(true);
	  }
	  catch(Exception e) 
	  {
		  assert(false);
	  }
  }
  
  @Test
  public void som(){
  	assert(true);
  }
  
}

