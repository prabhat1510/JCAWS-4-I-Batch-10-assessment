package com.springassesment.service;

import java.util.List;

import javax.transaction.Transactional;
import com.springassesment.repository.CollageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springassesment.entites.Collage;
import com.springassesment.exceptions.CollageNotFoundException;

@Service
@Transactional
public class CollageServiceImpl implements CollageService {
	@Autowired
	CollageRepository collageRepo;
	@Override
	public List<Collage> getAllCollage() {
		// TODO Auto-generated method stub
		return (List<Collage>) collageRepo.findAll();
	}

	@Override
	public Collage createCollage(Collage collage) {
		// TODO Auto-generated method stub
		return collageRepo.save(collage);
	}

	@Override
	public Collage retriveCollageById(Integer collageId) throws CollageNotFoundException{
		// TODO Auto-generated method stub
		return collageRepo.findById(collageId).orElseThrow(()->new CollageNotFoundException(collageId));
	}

	@Override
	public void deleteCollageById(Integer collageId) {
		collageRepo.deleteById(collageId);

	}

	@Override
	public Collage updateCollage(Collage newcollage, Integer collageId) {
		// TODO Auto-generated method stub
		return collageRepo.findById(collageId)
				.map(collage->{
					collage.setCollageName(newcollage.getCollageName());
					collage.setAddress(newcollage.getAddress());
					return collageRepo.save(collage);
				})
				.orElseGet(()->{
					newcollage.setCollageId(collageId);
					return collageRepo.save(newcollage);
				});
	}

}
