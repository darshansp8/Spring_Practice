package com.aopdemo;

public class Account {

		private String name;
		private int accno;
		private double balance;
		public Account() {
			System.out.println("AccountBean created.....");
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
			System.out.println("In setName "+name);
		}
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
			System.out.println("In setAccno "+accno);
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
			System.out.println("In setBalance "+balance);
		}
		@Override
		public String toString() {
			return "Account [name=" + name + ", accno=" + accno + ", balance=" + balance + "]";
		}
		
		public Account(int accno, String name, double balance) {
			super();
			this.accno = accno;
			this.name =name;
			this.balance = balance;
		}
		
		public void printThrowException() {
			System.out.println("Exception Raised");
			throw new IllegalArgumentException();
		}
		
}
