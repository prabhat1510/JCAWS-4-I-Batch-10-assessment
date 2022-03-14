package com.springrest.demo.services;

import com.springrest.demo.entities.College;

public interface Collegeservice {
	 public static College getClgid(Integer collegeid)
	 {
		 College c=null;
		 College[] list;
		for(College college:list)
		{
			if(college.getCollegeId()==collegeid)
			{
				c=college;
				break;
			}
		}
		return c;
	 }

}
