package com.aopdemo;

public class Logging {

		public Logging() {
			System.out.println("Logging Aspect Created....");
		}
		
		public void beforeAdvice() {
			System.out.println("Going to setup account profile....");
		}
		
		public void afterAdvice() {
			System.out.println("Account profile has been setup....");
		}
		
		public void afterReturningAdvice(Object retVal) {
			System.out.println("Returning: "+retVal.toString());
		}
		
		public void AfterThrowingAdvice(IllegalArgumentException ex) {
			System.out.println();
		}
		
		
}
