package test.small.json;

public class SubUserBean {
	
	private int subId;
	
	private String subName;
	
	public SubUserBean(){
		
	}

	public SubUserBean(int subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

}
