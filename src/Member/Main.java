package Member;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO myDao = new MemberDAO();

		// 1.������ ����
		MemberDTO a = new MemberDTO();
//		a.setId("aaa");
//		a.setName("aname");
//		myDao.insertOne(a);
//		int k= myDao.insertOne(a);
		
//		if(k==1) {
//			System.out.println("����");
//		}else if(k==0){
//			System.out.println("����");
//		}
//		// 2. ������ ����
		a = new MemberDTO();
		a.setId("ccc");
		a.setName("cname");
		myDao.insertOne(a);

		// 2-1.����
		// �ó����� : aaa��� ����� �̸��� kim ����
		// / /
		// update mmember set name='kim' where id='aaa'; �� ����
//		a.setId("aaa");
//		a.setName("kim");
//		myDao.updateOne(a);

		// aaa��� ����� Ż���� . ���� Ʃ�� ���� id�� aaa ��� ��� ����
		// myDao.delOne("ccc");

		// 2-2 aaa ��� ����� ������ ���� ����
//		MemberDTO nowUser =myDao.selOne("bbb");
//		if(nowUser!=null){
//			System.out.println("id: "+ nowUser.getId());
//			System.out.println("name: "+ nowUser.getName());
//			System.out.println("point: "+ nowUser.getPoint());
//		}else {
//			System.out.println("��� X");
//		}
		// 3. ������ ��� ��������
//	ArrayList<MemberDTO> userList=myDao.selAll();
//	for(MemberDTO m:userList) {
//			System.out.println("id: "+ m.getId());
//			System.out.println("name: "+ m.getName());
//			System.out.println("point: "+ m.getPoint());
	
		
		
	
	}

}
