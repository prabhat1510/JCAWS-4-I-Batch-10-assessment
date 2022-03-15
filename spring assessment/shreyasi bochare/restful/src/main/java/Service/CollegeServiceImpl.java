package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springassessment.entity.College;
import com.springassessment.exception.CollegeNotFoundException;
import com.springassessment.repository.CollegeRepository;


@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
	CollegeRepository collegeRepository;
	
	@Override
	public List<College> retrieveAllCollege() {
		// TODO Auto-generated method stub
		return (List<College>) collegeRepository.findAll();
	}

	@Override
	public College createCollegeDetail(College college) {
		// TODO Auto-generated method stub
		return collegeRepository.save(college);
	}

	@Override
	public College retrieveCollegeById(Integer collegeId) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findById(collegeId).orElseThrow(() -> new CollegeNotFoundException(collegeId));
	}

	@Override
	public void deleteCollegeById(Integer id) {
		collegeRepository.deleteById(id);
	}

	@Override
	public College updateCollegeDetails(College newCollege, Integer collegeId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public College replaceCollege(College newCollege, Integer id) {
		return collegeRepository.findById(id)
			      .map(college -> {
			        college.setCollegeName(newCollege.getCollegeName());
			        college.setAddress(newCollege.getAddress());
			        return collegeRepository.save(college);
			      })
			      .orElseGet(() -> {
			        newCollege.setCollegeId(id);
			        return collegeRepository.save(newCollege);
			      });
	}

}