package com.generation;

public class SalesRep {
     String name;
     int salesMade;

	public SalesRep(String name, int salesMade) {
		super();
		this.name = name;
		this.salesMade = salesMade;
	} // constructor
	
	public String getName() {
		return name;
	} // setter getName

	public void setName(String name) {
		this.name = name;
	} // getter getName

	public int getSalesMade() {
		return salesMade;
	} // getter

	public void setSalesMade(int salesMade) {
		this.salesMade = salesMade;
	} // setter

	@Override
	public String toString() {
		return "SalesRep [name=" + name + ", salesMade=" + salesMade + "]";
	} // toString()
	
} // class SalesRep
