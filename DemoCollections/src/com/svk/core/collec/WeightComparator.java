package com.svk.core.collec;

import java.util.Comparator;

public class WeightComparator implements Comparator<StudentForComparator>{

	@Override
	public int compare(StudentForComparator student1, StudentForComparator student2) {
		
		int weightOfStudent1 = student1.getStudentWeight();
		int weightOfStudent2 = student2.getStudentWeight();
		
		if(weightOfStudent1 > weightOfStudent2){
			
			return 1;
		
		}else if(weightOfStudent1 < weightOfStudent2){
		
			return -1;
		}
		
		return 0;
	}

}
