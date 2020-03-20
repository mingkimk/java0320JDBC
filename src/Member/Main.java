package Member;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO myDao = new MemberDAO();

		// 1.데이터 삽입
		MemberDTO a = new MemberDTO();
//		a.setId("aaa");
//		a.setName("aname");
//		myDao.insertOne(a);
//		int k= myDao.insertOne(a);
		
//		if(k==1) {
//			System.out.println("성공");
//		}else if(k==0){
//			System.out.println("실패");
//		}
//		// 2. 데이터 삽입
		a = new MemberDTO();
		a.setId("ccc");
		a.setName("cname");
		myDao.insertOne(a);

		// 2-1.갱신
		// 시나리오 : aaa라는 사람의 이름을 kim 변경
		// / /
		// update mmember set name='kim' where id='aaa'; 로 변경
//		a.setId("aaa");
//		a.setName("kim");
//		myDao.updateOne(a);

		// aaa라는 사람이 탈퇴함 . 관련 튜플 삭제 id가 aaa 라는 사람 삭제
		// myDao.delOne("ccc");

		// 2-2 aaa 라는 사람의 정보만 가져 오기
//		MemberDTO nowUser =myDao.selOne("bbb");
//		if(nowUser!=null){
//			System.out.println("id: "+ nowUser.getId());
//			System.out.println("name: "+ nowUser.getName());
//			System.out.println("point: "+ nowUser.getPoint());
//		}else {
//			System.out.println("등록 X");
//		}
		// 3. 데이터 모두 가져오기
//	ArrayList<MemberDTO> userList=myDao.selAll();
//	for(MemberDTO m:userList) {
//			System.out.println("id: "+ m.getId());
//			System.out.println("name: "+ m.getName());
//			System.out.println("point: "+ m.getPoint());
	
		
		
	
	}

}
