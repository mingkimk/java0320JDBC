package Member;

public class MemberDTO {
//DTO-data transfer object 박스
	//DAO-data acc전송과 가져오는 역활
	private int no;
	private String id;
	private String name;
	private float point; //float은 소수점 둘
	
	
	// 박스 포장지 준비
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPoint() {
		return point;
	}
	public void setPoint(float point) {
		this.point = point;
	}
	
	// 박스 포장지 준비
	
	
	
	
	
	
}
