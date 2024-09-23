package com.generation;

public class Employee {
	String firstName;
	String lastName;
	int registration;
	int age;
	int daysWorked;
	int vacationDays;
	double salary;
	int yearsWorked;

	public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDays,
			double salary, int yearsWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDays = vacationDays;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	} // constructor

	public String getFirstName() {
		return firstName;
	} // getter getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} // setter setFirstName

	public String getLastName() {
		return lastName;
	} // getter lastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	} // setter lastName

	public int getRegistration() {
		return registration;
	} // getter getRegistration

	public void setRegistration(int registration) {
		this.registration = registration;
	} // setter setRegistration

	public int getAge() {
		return age;
	} // getter getAge

	public void setAge(int age) {
		this.age = age;
	} // setter setAge

	public int getDaysWorked() {
		return daysWorked;
	} // getter getDaysWorked

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	} // setter setDaysWorked

	public int getVacationDays() {
		return vacationDays;
	} // getter getVacationsDays

	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	} // setter setVacationsDays

	public double getSalary() {
		return salary;
	} // getter getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	} // setter setSalary

	public int getYearsWorked() {
		return yearsWorked;
	} // getter getYearsWorked

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	} // setter setYearsWorked

	public int timeToRetirement() {
	    // time to retirement = min(60 - age, 40 - yearsWorked)
	    return Math.min(60 - age, 40 - yearsWorked);
	} // method timeToRetirement

	    public int vacationTimeLeft(int vacationDaysTaken) {
	        // vacation time left = (daysWorked / 360) * (30 - vacationDaysTaken)
	        return (this.daysWorked / 360) * (30 - vacationDaysTaken);
	    } // method vacationTimeLeft

	    public double calculateBonus() {
	        // bonus = 2.2 * salary
	        return 2.2 * this.salary;
	    } // method calculateBonus

		@Override
		public String toString() {
			return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
					+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDays=" + vacationDays + ", salary="
					+ salary + ", yearsWorked=" + yearsWorked + ", getFirstName()=" + getFirstName()
					+ ", getLastName()=" + getLastName() + ", getRegistration()=" + getRegistration() + ", getAge()="
					+ getAge() + ", getDaysWorked()=" + getDaysWorked() + ", getVacationDays()=" + getVacationDays()
					+ ", getSalary()=" + getSalary() + ", getYearsWorked()=" + getYearsWorked() + ", calculateBonus()="
					+ calculateBonus() + "]";
		} // toString()
	
} // class Employee