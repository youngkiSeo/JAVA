package com.green.java.Academic_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;


public class Admin extends JFrame implements ActionListener {
	JPanel panel, panel2, panel3, panel4;
	JTextField Tid, Tpassword, Tpassword2, Tuser, Tdate, TPermission;
	JLabel a, id, password, password2, user, date, Permission;
	JButton Jbid, Jbpw, input, revise, del, end;
	JTable table;
	JScrollPane jsp;
	TitledBorder tBorder, inBorder;
	DefaultTableModel dtm;

	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs;
	SimpleAttributeSet set;
	menu np;

	Admin(menu np) throws SQLException {
		this.np= np;
		this.setTitle("사용자관리");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 60);
		a = new JLabel("사용자 관리");
		a.setBounds(350, 25, 780, 20);
		a.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		a.setForeground(Color.WHITE);
		panel.setBackground(Color.black);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 65, 780, 170);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);

		id = new JLabel("아이디");
		id.setBounds(50, 20, 60, 25);
		Tid = new JTextField();
		Tid.setBounds(120, 20, 120, 25);

		Jbid = new JButton("ID 중복확인");
		Jbid.setBounds(260, 20, 120, 25);
		Jbid.setBackground(Color.green);
		Jbid.setForeground(Color.WHITE);
		Jbid.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 13));

		password = new JLabel("패스워드");
		password.setBounds(50, 50, 60, 25);
		Tpassword = new JTextField();
		Tpassword.setBounds(120, 50, 120, 25);

		password2 = new JLabel("패스워드확인");
		password2.setBounds(260, 50, 80, 25);
		Tpassword2 = new JTextField();
		Tpassword2.setBounds(350, 50, 120, 25);

		Jbpw = new JButton("PW 중복확인");
		Jbpw.setBounds(500, 50, 120, 25);

		Jbpw.setBackground(Color.green);
		Jbpw.setForeground(Color.WHITE);
		Jbpw.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 13));

		user = new JLabel("사용자");
		user.setBounds(50, 80, 60, 25);
		Tuser = new JTextField();
		Tuser.setBounds(120, 80, 120, 25);

		Permission = new JLabel("사용권한");
		Permission.setBounds(260, 80, 80, 25);
		TPermission = new JTextField();
		TPermission.setBounds(350, 80, 120, 25);

		date = new JLabel("등록날짜");
		date.setBounds(50, 110, 60, 25);
		Tdate = new JTextField();
		Tdate.setBounds(120, 110, 120, 25);

		String[] colheading = { "아이디", "패스워드", "사용자", "등록날짜", "사용권한" };
		String[][] rowdata = {};
		dtm = new DefaultTableModel(rowdata, colheading) { // 모델 생성
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER); // 셀 데이터 가운데 정렬

		table = new JTable(dtm); // 모델에 테이블 연결
		jsp = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		// jsp.setBounds(0, 340, 780, 80);
		jsp.setBounds(0, 350, 780, 300);

		table.setBackground(new Color(255, 255, 204));
		table.setSelectionBackground(Color.blue);
		table.setSelectionForeground(Color.WHITE);
		table.setRowHeight(25);

		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(0, 660, 780, 80);
		panel4.setBackground(Color.pink);

		input = new JButton("등록");
		input.setBounds(50, 20, 100, 50);
		input.setBackground(Color.gray);
		input.setForeground(Color.WHITE);
		input.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		revise = new JButton("수정");
		revise.setBounds(220, 20, 100, 50);
		revise.setBackground(Color.gray);
		revise.setForeground(Color.WHITE);
		revise.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		del = new JButton("삭제");
		del.setBounds(390, 20, 100, 50);
		del.setBackground(Color.gray);
		del.setForeground(Color.WHITE);
		del.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		end = new JButton("종료");
		end.setBounds(570, 20, 100, 50);
		end.setBackground(Color.gray);
		end.setForeground(Color.WHITE);
		end.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		panel4.add(input);
		panel4.add(revise);
		panel4.add(del);
		panel4.add(end);

		panel2.add(Tdate);
		panel2.add(date);
		panel2.add(TPermission);
		panel2.add(Permission);
		panel2.add(Tuser);
		panel2.add(user);
		panel2.add(Jbpw);
		panel2.add(Tpassword2);
		panel2.add(password2);
		panel2.add(Tpassword);
		panel2.add(password);

		panel2.add(Jbid);
		panel2.add(Tid);
		panel2.add(id);
		panel.add(a);
		add(jsp);
		add(panel4);
		add(panel2);
		add(panel);

		input.addActionListener(this);
		revise.addActionListener(this);
		del.addActionListener(this);
		end.addActionListener(this);
		Jbid.addActionListener(this);
		Jbpw.addActionListener(this);
		table.addMouseListener(new MyMouseListener());
		DBConnect();
		getListALL();
		setSize(800, 800);
		setVisible(true);
	}

	public void DBConnect() throws SQLException {
		connector = new DBConm();

	}

	public void getListALL() {
		try {
			dtm.setRowCount(0);
			String quary = "SELECT * FROM admin";
			pstmt = connector.conn.prepareStatement(quary);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String password = rs.getString(2);
				String user = rs.getString(3);
				String user_permission = rs.getString(4);
				String registration_date = rs.getString(5);

				Object[] rowdata = { id, password, user, user_permission, registration_date };
				dtm.addRow(rowdata);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int input() { // 입력
		int result = 0;

		try {
			String query = "INSERT INTO admin(id,password,user,user_permission,registration_date)"
					+ "values(?,?,?,?,?)";

			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tid.getText());
			pstmt.setString(2, Tpassword.getText());
			pstmt.setString(3, Tuser.getText());
			pstmt.setString(4, Tdate.getText());
			pstmt.setString(5, TPermission.getText());
			result = pstmt.executeUpdate();
			getListALL();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		if (result != 0) {
			JOptionPane.showMessageDialog(this, Tid.getText() + "님이 추가 되었습니다.");
		} else {
			JOptionPane.showMessageDialog(getParent(), "추가 실패");

		}
		return result;

	}
	
	public void delete() throws SQLException { // 삭제
		int srow = table.getSelectedRow();
		dtm.setRowCount(0);
		String query = "DELETE FROM Admin where code=?";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tid.getText());
			int result = pstmt.executeUpdate();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
	

	}
	public int revise() {// 수정
		int result =0;
		
			String query = "UPDATE Admin SET password=?,user=?,user_permission=?,registration_date=? where id=?";
			;
			try {
			pstmt = connector.conn.prepareStatement(query);
			
			pstmt.setString(1, Tpassword.getText());
			pstmt.setString(2, Tuser.getText());
			pstmt.setString(3, Tdate.getText());
			pstmt.setString(4, TPermission.getText());
			pstmt.setString(5, Tid.getText());
			result = pstmt.executeUpdate();
			getListALL();

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		if (result != 0) {
			JOptionPane.showMessageDialog(this, Tid.getText() + "님이 수정되었습니다..");
		} else {
			JOptionPane.showMessageDialog(getParent(), "수정 실패");
		}
		
		return result;

	}

	public void id() {

		try {
			
			//String query = "SELECT * FROM Admin where id = '" + id.getText() + "" ;
			String query = "SELECT * FROM Admin where id = ?";
					
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tid.getText());
			rs = pstmt.executeQuery();		

			while(rs.next()) {
				JOptionPane.showMessageDialog(this, Tid.getText() + "는 이미 사용중인 아이디 입니다.");
				id.requestFocus();
				//id.selectAll();
				return;
			}
			//Jbid = true;
			JOptionPane.showMessageDialog(this, Tid.getText() + "는 이미 사용가능한 아이디 입니다.");
			
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		getListALL();

	}
	
	
	public void pw() {
		
		if(Tpassword.getText().equals(Tpassword2.getText())) {
			JOptionPane.showMessageDialog(this, "비밀번호가 맞습니다.");
		}
		else {
			JOptionPane.showMessageDialog(this, "비밀번호가 올바르지 않습니다");
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == input) {// 입력
			input();
		}
		if (ob == revise) {// 수정
			revise();
			
		}
		if (ob == del) {// 삭제
			try {
				delete();
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}

		}
		if (ob == end) {
			System.exit(0);

		}
		if (ob == Jbid) {
			id();
		}
		if (ob == Jbpw) {
			pw();

		}
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int srow = table.getSelectedRow();
			
			String code = (String)table.getValueAt(srow, 0);
			Tid.setText(code);
			
			Tpassword.setText(table.getValueAt(srow,1).toString());
			Tpassword2.setText(table.getValueAt(srow,1).toString());
			Tuser.setText(table.getValueAt(srow,2).toString());
			Tdate.setText(table.getValueAt(srow,3).toString());
			TPermission.setText(table.getValueAt(srow,4).toString());

			}
		}
	



}
