package org.eclipse.wtp.sample.classschedule;

import java.util.ArrayList;
import java.util.List;

public class SchoolSchedule {

	@SuppressWarnings({ "rawtypes" })
	private List classes = new ArrayList();

	@SuppressWarnings("rawtypes")
	public List getClasses() {
		return classes;
	}
	 @SuppressWarnings("unchecked")
	public void addClass(SchoolClass schoolClass){
		 classes.add(schoolClass);
	 }
}
