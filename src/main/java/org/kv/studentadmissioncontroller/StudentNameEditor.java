package org.kv.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

/**
 * Created by KV on 22/12/2016.
 */
public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		if(studentName.contains("Mr.") || studentName.contains("Ms.")){
			setValue(studentName);
		}else {
			studentName = "Ms. " + studentName;
			setValue(studentName);
		}
	}
}
