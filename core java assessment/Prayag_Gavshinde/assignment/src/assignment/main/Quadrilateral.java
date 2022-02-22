package assignment.main;

public abstract class Quadrilateral {
	private Integer base;
	private Integer height;
	
	Quadrilateral(){}
	
	Quadrilateral(int b,int h){
		this.base = b;
		this.height = h;
	}
	
	public abstract void area();
	/**
	 * @return the base
	 */
	public Integer getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(Integer base) {
		this.base = base;
	}
	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	
		
}
