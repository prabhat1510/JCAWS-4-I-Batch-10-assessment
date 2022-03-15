package com.springassessmentdeve.service;

import com.springassessmentdeve.entity.Collage;
import com.springassessmentdeve.exception.CollageNotFoundException;

public interface CollageService {
	public Collage getCollageById(Integer collageId) throws CollageNotFoundException;
	public Collage addcollage(Collage collage);
}
