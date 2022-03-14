package com.springassesment.service;
import java.util.List;

import com.springassesment.entites.Collage;
import com.springassesment.exceptions.CollageNotFoundException;


public interface CollageService {
	
	public List<Collage> getAllCollage();
	
	public Collage createCollage(Collage collage);
	
	public Collage retriveCollageById(Integer collageId) throws CollageNotFoundException;
	
	public void deleteCollageById(Integer collageId);
	
	public Collage updateCollage(Collage newCollage,Integer collageId);
}
