package com.wiprojuly.testng;

import org.testng.annotations.Test;

public class Work1 {

    @Test(groups = "Sanity")
    public void createuser() {
    	
        System.out.println("Testcase1 is executed");
    }

    @Test(groups = "Regression")
    public void updateuser() {
    	
        System.out.println("Testcase2 is executed");
    }

    @Test(groups = {"sanity", "Regression"})
    public void deleteuser() {
    	
        System.out.println("Testcase3 is executed");
    }
    
    @Test(groups = "Smoke")
    public void viewuser() {
    	
    	System.out.println("Testcase4 is executed");
    }
}
