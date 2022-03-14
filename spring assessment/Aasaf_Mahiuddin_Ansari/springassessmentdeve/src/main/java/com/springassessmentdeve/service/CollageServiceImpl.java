package com.springassessmentdeve.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassessmentdeve.entity.Collage;
import com.springassessmentdeve.exception.CollageNotFoundException;
import com.springassessmentdeve.repository.CollageRepository;

@Service
@Transactional
public class CollageServiceImpl implements CollageService {
	@Autowired
	CollageRepository collageRepository;
	
	@Override
	public Collage getCollageById(Integer collageId) throws CollageNotFoundException {
		return collageRepository.findById(collageId).orElseThrow(()-> new CollageNotFoundException(collageId));
	}

	@Override
	public Collage addcollage(Collage collage) {
		return collageRepository.save(collage);
	}

}
