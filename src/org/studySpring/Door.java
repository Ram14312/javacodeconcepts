package org.studySpring;

  abstract class Lock{
	public abstract Boolean isUnLocked(String key);
	
	public void test() {
		System.out.println("test passed");
		 
		
	}
}

public class Door {
	Lock l = new Lock() {

	@Override
	public Boolean isUnLocked(String key) {
		 if(key.equals( "query")) {
			 return true;
		 }else {
			 return false; 
		 }
		 
	}
	};

	public Lock getL() {
		return l;
	}
	

}


