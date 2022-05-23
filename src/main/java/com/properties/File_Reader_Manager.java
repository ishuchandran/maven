package com.properties;

public class File_Reader_Manager {
	//public constructor
	private File_Reader_Manager() {
		//we can't create object in another class
	}
	
	public static File_Reader_Manager getInstanceFRM() {
		
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
}
