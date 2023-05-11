package Quiz;
public class ResultModel {
	private String userId;
	private String userName;
	private String examType;
	private String noOfQos;
	private String status;
	private String corAns;
	private String sTime;
	
	public ResultModel() {
		super();
	}
	
	public ResultModel(String userId, String userName, String examType, String noOfQos, String corAns,
			String status, String sTime) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.examType = examType;
		this.noOfQos = noOfQos;
		this.status = status;
		this.corAns = corAns;
		this.sTime = sTime;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public String getNoOfQos() {
		return noOfQos;
	}
	public void setNoOfQos(String noOfQos) {
		this.noOfQos = noOfQos;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCorAns() {
		return corAns;
	}
	public void setCorAns(String corAns) {
		this.corAns = corAns;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
}
