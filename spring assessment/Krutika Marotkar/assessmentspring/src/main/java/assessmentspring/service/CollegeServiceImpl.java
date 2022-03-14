package assessmentspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import assessmentspring.entity.College;
import assessmentspring.exception.CollegeNotFoundException;
import assessmentspring.repository.CollegeRepository;

@Service
@Transactional
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public List<College> getAllCollege() {
		// TODO Auto-generated method stub
		return collegeRepository.findAll();
	}

	@Override
	public College getByCollegeId(Integer collegeId) throws CollegeNotFoundException{
		// TODO Auto-generated method stub
		return collegeRepository.getById(collegeId);
	}

	@Override
	public College getByCollegeName(String collegeName) {
		// TODO Auto-generated method stub
		return collegeRepository.getByCollegeName(collegeName);
	}

	@Override
	public College getByCollegeAddress(String address)  {
		// TODO Auto-generated method stub
		return collegeRepository.getByCollegeAddress(address);
	}

	@Override
	public Boolean deleteCollegeById(Integer collegeId) {
		 collegeRepository.deleteById(collegeId);
		 if(collegeRepository.existsById(collegeId))
		 {
			 return false;
		 }
		 return true;
	}

	@Override
	public College updateCollege(College college, Integer collegeId) {
		// TODO Auto-generated method stub
		  return collegeRepository.findById(collegeId).map
				 ( newcollege -> {college.setCollegeName(college.getCollegeName());
		            newcollege.setAddress(college.getAddress());
		            return collegeRepository.save(college);
		 })
		 .orElseGet(() -> {
		        college.setCollegeId(collegeId);
		        return collegeRepository.save(college);
		      });
	}

}
