package springassesment.entity;

	import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

	@Entity
	public class College {

		@Id
		@Column(name = "college_id")
		private Integer collegeId ;
		private String collegeName;
		private String address ;
		
		public College() {
			// TODO Auto-generated constructor stub
		}
		
		public Integer getCollegeId() {
			return collegeId;
		}
		public void setCollegeId(Integer collegeId) {
			this.collegeId = collegeId;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		@Override
		public String toString() {
			return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", address=" + address + "]";
		}

}
