package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO { // �ڹ� sql���� �����ϴ� �����ͺ��̽� / connection �� ���� �ܺζ� �����ϴ� �ڿ�

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	ArrayList<MemberDTO> uList = new ArrayList<>();

	public ArrayList<MemberDTO> selAll() {
		ArrayList<MemberDTO> uList = new ArrayList<>();
		MemberDTO searDTO = null;
		if (connect()) {
			try {
				stmt = conn.createStatement();
				String sql = "select * from mmember";
				rs = stmt.executeQuery(sql);
				while (rs.next()) { // �����°� �ִٸ� , ù��° �ٿ� Ʃ�ÿ� �ִ� �Ÿ� ���� ���°�
					searDTO = new MemberDTO();
					searDTO.setName(rs.getString("name"));
					// �̸� �� rs �������°� // �����ͼ� ���� ���� ��ü�� �ִ°�
					searDTO.setId(rs.getString("id"));
					searDTO.setPoint(rs.getFloat("point"));
					uList.add (searDTO);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("DB ���� ����!!");
		}

		return uList;
	}

	MemberDAO() {
		try {
			// Ŭ������ �ҷ� ���°� ���̺귯�� �о� ��� �Ͷ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Ŭ���� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ���� �ε� ����");
		}

	}

	private boolean connect() { // ����Ŭ db �� ���� �ϱ� ���� �ڿ�
		boolean cFlag = false;
		try {
			conn = DriverManager.getConnection("" + "jdbc:oracle:thin:@localhost:1521:orcl", "system", "11111111");
			cFlag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return cFlag;
	}

	public void delOne(String id) {
		if (connect()) {
			try {
				stmt = conn.createStatement();
				String sql = "delete from mmember where id='" + id + "'";
				stmt.executeQuery(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateOne(MemberDTO m) {
		if (connect()) {
			try {
				String sql = "update mmember set name=? where id=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getName());
				psmt.setString(2, m.getId());

				int k = psmt.executeUpdate();
				// int �� return
				// Ŀ���� ���� �� ���� ����

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("DB ���� ����!!");
		}

	}

	public int insertOne(MemberDTO m) {
		// ����Ŭ�� �� ������ ����Ű�� ��ü�� ����
		// ����: db�� ���� sql query �� ������ �Ѵ� > query ����
		if (connect()) {
			try {
				String sql = "insert into mmember values(mmember_no.nextval,?,?,5)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, m.getId());
				// (1, m.getId() ù��° �ٿ� �ִ� id
				psmt.setString(2, m.getName());

				int k = psmt.executeUpdate();
				// int �� return
				// Ŀ���� ���� �� ���� ����
				return k;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("DB ���� ����!!");
		}
		return 0;
	}

	public MemberDTO selOne(String id) {
		MemberDTO searDTO = null;
		if (connect()) {
			try {
				stmt = conn.createStatement();
				String sql = "select * from mmember where id='" + id + "'";
				rs = stmt.executeQuery(sql);
				if (rs.next()) { // �����°� �ִٸ� , ù��° �ٿ� Ʃ�ÿ� �ִ� �Ÿ� ���� ���°�
					searDTO = new MemberDTO();
					searDTO.setName(rs.getString("name"));
					// �̸� �� rs �������°� // �����ͼ� ���� ���� ��ü�� �ִ°�
					searDTO.setId(rs.getString("id"));
					searDTO.setPoint(rs.getFloat("point"));
					return searDTO;
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("DB ���� ����!!");
		}

		return searDTO;
	}

}
