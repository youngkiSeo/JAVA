package com.green.java.Academic_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;

 
public class student extends JFrame implements ActionListener{
	JPanel panel, panel2, panel3, panel4;

	JLabel stu,stu_ID, name, Rnumber,addr,phone,phone2,year,graduate,graduate_year,department,professor,gender;
	
	JLabel y, y2, y3;
	JTextField Tstu_ID, Tname, TRnumber,TRnumber2,Taddr,Tphone,Tphone2,Tphone3,Tphone4,Tyear,Tgraduate,Tgraduate_year,Tdepartment,Tprofessor,Tgender,Tsearch;
	JComboBox department2, cb1,cb2,cb3;
	JButton input, revise, del, end1, search, search_all;
	JRadioButton man, wo;
	TitledBorder tBorder, inBorder;

	DefaultTableModel dtm;
	JTable table;
	JScrollPane jsp;
	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs;
	SimpleAttributeSet set;
	String g,f;
	ResultSet rs1, rs2;
	String dept_name="";
	String dept_code="";
	String prof_name="";
	String prof_code="";
	String deptcategory= "";
	
	menu np;
	
	
	student(menu np) throws SQLException{
		this.np= np;
		this.setTitle("학생관리");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 60);

		stu = new JLabel("학생관리");
		stu.setBounds(350, 25, 780, 20);
		stu.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		stu.setForeground(Color.WHITE);
		panel.setBackground(Color.black);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 65, 780, 170);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);

		stu_ID = new JLabel("학과코드");
		stu_ID.setBounds(30, 20, 60, 25);

		Tstu_ID = new JTextField();
		Tstu_ID.setBounds(90, 20, 120, 25);

		name = new JLabel("이름");
		name.setBounds(230, 20, 30, 25);

		Tname = new JTextField();
		Tname.setBounds(270, 20, 120, 25);

		Rnumber = new JLabel("주민번호");
		Rnumber.setBounds(420, 20, 50, 25);

		TRnumber = new JTextField();
		TRnumber.setBounds(480, 20, 120, 25);

		y = new JLabel("-");
		y.setBounds(600, 20, 10, 25);

		TRnumber2 = new JTextField();
		TRnumber2.setBounds(610, 20, 120, 25);
		
		addr = new JLabel("주소");
		addr.setBounds(30, 50, 50, 25);

		Taddr = new JTextField();
		Taddr.setBounds(90, 50, 640, 25);

		phone = new JLabel("휴대폰");
		phone.setBounds(30, 80, 50, 25);

		Tphone = new JTextField();
		Tphone.setBounds(90, 80, 100, 25);

		y2 = new JLabel("-");
		y2.setBounds(190, 80, 10, 25);

		Tphone2 = new JTextField();
		Tphone2.setBounds(200, 80, 100, 25);

		y3 = new JLabel("-");
		y3.setBounds(300, 80, 10, 25);

		Tphone3 = new JTextField();
		Tphone3.setBounds(310, 80, 100, 25);

		phone2 = new JLabel("전화번호");
		phone2.setBounds(420, 80, 50, 25);

		Tphone4 = new JTextField();
		Tphone4.setBounds(480, 80, 250, 25);

		year = new JLabel("입학년도");
		year.setBounds(30, 110, 50, 25);

		Tyear = new JTextField();
		Tyear.setBounds(90, 110, 100, 25);

		graduate = new JLabel("졸업고교");
		graduate.setBounds(250, 110, 50, 25);

		Tgraduate = new JTextField();
		Tgraduate.setBounds(310, 110, 100, 25);

		graduate_year = new JLabel("졸업년도");
		graduate_year.setBounds(420, 110, 50, 25);
		
		Tgraduate_year = new JTextField();
		Tgraduate_year.setBounds(480, 110, 250, 25);

		
		
		department= new JLabel("학과");
		department.setBounds(30, 140, 50, 25);
		
		String[] list = { "개설학과", "컴퓨터공학", "방사선", "물리치료", "사무자동화", "간호1" };
		cb1 = new JComboBox(list);
		cb1.setBounds(90, 140, 100, 25);
		
		professor= new JLabel("지도교수");
		professor.setBounds(250, 140, 50, 25);
		
		String[] list2 = { "담당교수", "김하나", "김두리", "정교수", "정두리"};
		cb2 = new JComboBox(list2);
		cb2.setBounds(310, 140, 100, 25);
		
		
		gender = new JLabel("성별");
		gender.setBounds(420, 140, 50, 25);

		man = new JRadioButton("남자");
		man.setBounds(470, 140, 60, 25);
		wo = new JRadioButton("여자");
		wo.setBounds(530, 140, 60, 25);
		ButtonGroup b = new ButtonGroup();
		b.add(man);
		b.add(wo);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 250, 780, 80);
		panel3.setBackground(Color.pink);

		String[] list3 = { "학생", "주소", "학과", "교수","졸업고교","성별","검색할 카테고리 선택하세요"};
		cb3 = new JComboBox(list3);
		// cb1.addActionListener(this);
		cb3.setBounds(10, 20, 180, 30);

		Tsearch = new JTextField();
		Tsearch.setBounds(200, 20, 180, 30);

		search = new JButton("조회");
		search.setBackground(Color.green);
		search.setForeground(Color.WHITE);
		search.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		search.setBounds(400, 20, 120, 40);

		search_all = new JButton("전체조회");
		search_all.setBounds(550, 20, 120, 40);
		// searchall.setFont(new Font("한컴 바겐세일 B", Font.ITALIC, 10));
		search_all.setBackground(Color.green);
		search_all.setForeground(Color.WHITE);
		search_all.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		
		String[] colheading = { "학번", "이름", "주소", "주민번호", "휴대폰", "전화번호", "입학년도", "졸업고교", "졸업년도", "학과", "지도교수","성별"  };
		String[][] rowdata = {};
		dtm = new DefaultTableModel(rowdata, colheading) { // 모델 생성
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER); // 셀 데이터 가운데 정렬

		table = new JTable(dtm); // 모델에 테이블 연결
		jsp = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setBounds(0, 340, 780, 80);
		inBorder = new TitledBorder("테이블");
		jsp.setBorder(inBorder);
		jsp.setBounds(0, 350, 780, 300);

		table.setBackground(new Color(255, 255, 204));
		table.setSelectionBackground(Color.blue);
		table.setSelectionForeground(Color.WHITE);
		table.setRowHeight(25);

		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(0, 660, 780, 80);
		panel4.setBackground(Color.pink);

		input = new JButton("입력");
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

		end1 = new JButton("종료");
		end1.setBounds(570, 20, 100, 50);
		end1.setBackground(Color.gray);
		end1.setForeground(Color.WHITE);
		end1.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		
		panel4.add(input);
		panel4.add(revise);
		panel4.add(del);
		panel4.add(end1);
		panel3.add(Tsearch);
		panel3.add(cb3);
		panel3.add(search);
		panel3.add(search_all);
		panel2.add(wo);
		panel2.add(man);
		panel2.add(gender);
		panel2.add(cb2);
		panel2.add(professor);
		panel2.add(cb1);
		panel2.add(department);
		panel2.add(Tgraduate_year);
		panel2.add(graduate_year);
		panel2.add(Tgraduate);
		panel2.add(graduate);
		panel2.add(Tyear);
		panel2.add(year);
		panel2.add(Tphone4);
		panel2.add(Tphone3);
		panel2.add(Tphone2);
		panel2.add(phone2);
		panel2.add(Tphone);
		panel2.add(phone);
		panel2.add(Taddr);
		panel2.add(addr);
		panel2.add(TRnumber2);
		panel2.add(TRnumber);
		panel2.add(Rnumber);
		panel2.add(Tname);
		panel2.add(name);
		panel2.add(Tstu_ID);
		panel2.add(stu_ID);
		panel2.add(y);
		panel2.add(y2);
		panel2.add(y3);
		panel.add(stu);
		add(jsp);
		add(panel4);
		add(panel3);
		add(panel2);
		add(panel);
		
		DBConnect();
		getListALL();
		
		
		//department2.addActionListener(this);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		input.addActionListener(this);
		revise.addActionListener(this);
		del.addActionListener(this);
		end1.addActionListener(this);
		search.addActionListener(this);
		search_all.addActionListener(this);
		table.addMouseListener(new MyMouseListener());
		
		setSize(800, 800);
		setVisible(true);
		
		man.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g = e.getActionCommand();
			}
		});
		wo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g = e.getActionCommand();
			}
		});
		cb1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				deptcategory = (String) cb1.getSelectedItem();
				try {
					String query = "SELECT * FROM department where dep_name = ?";
					pstmt = connector.conn.prepareStatement(query);
					pstmt.setString(1, deptcategory);
					rs = pstmt.executeQuery();

					while (rs.next()) {
						dept_code = rs.getString(1);
						dept_name = rs.getString(2);
					}
				} catch (SQLException a) {
					a.printStackTrace();
				}

			}
		});
		
		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				deptcategory = (String) cb2.getSelectedItem();
				try {
					String query = "SELECT * FROM professor where name = ?";
					pstmt = connector.conn.prepareStatement(query);
					pstmt.setString(1, deptcategory);
					rs = pstmt.executeQuery();

					while (rs.next()) {
						prof_code = rs.getString(1);
						prof_name = rs.getString(2);
					}
				} catch (SQLException a) {
					a.printStackTrace();
				}

			}
		});
	}
	public void dep() {

		cb1.addItem("개설학과");
		try {
			String query = "SELECT * FROM department";
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dep_name = rs.getString(2);
				cb1.addItem(dep_name);

			}
		} catch (SQLException a) {
			a.printStackTrace();
		}
		
	}
	
	public void DBConnect() throws SQLException {
		connector = new DBConm();

	}
	public void getListALL() {
		try {
			dtm.setRowCount(0);
			String query = "SELECT * FROM student ";
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				String juminno = rs.getString(4);
				String mphone = rs.getString(5);
				//mphone= mphone.substring(0,3)+ "-" + mphone.substring(3,7) + "-"+mphone.substring(7,11);
 				String phone = rs.getString(6);
 				//phone = "(" + phone.substring(0, 3)+ ")"+phone.substring(3,6)+"-"+phone.substring(6,10);
				String uin_year = rs.getString(7);
				String hischool = rs.getString(8);
				String end_year = rs.getString(9);
				String dept_code = rs.getString(10);
				String prof_code = rs.getString(11);
				String gender = rs.getString(12);
				
				//department(학과) 테이블에서 학과코드(code)이용 학과 가져오기
				query = "SELECT * FROM department where dep_code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, dept_code);
				rs1 = pstmt.executeQuery();
				
				
				while(rs1.next()) {
					dept_name = rs1.getString(2);
				}
				
				String query2 = "SELECT * FROM professor where code = ?";
				pstmt = connector.conn.prepareStatement(query2);
				pstmt.setString(1, prof_code);
				rs2 = pstmt.executeQuery();
				while(rs2.next()) {
					prof_name = rs2.getString(2);
				}
				
				
				
				Object[] rowdata = { code, name, addr, juminno, mphone, phone, uin_year, hischool, end_year, dept_name,prof_name,
						gender };
				dtm.addRow(rowdata);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public int input(String stucode) throws HeadlessException, SQLException { // 입력
		int result = 0;
		String query = "SELECT * FROM student where code ='" +stucode + "'";
				while(rs.next()) {
					JOptionPane.showMessageDialog(this, "이미 등록된 학생입니다", "코드확인!!!",JOptionPane.WARNING_MESSAGE);
					stu_ID.requestFocus();
					return result;
				}
		try {
			String query2 = "INSERT INTO student(code,name, addr,juminno,mphone,phone,uin_year,hischool,end_year,dept_code,prof_code,gender)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = connector.conn.prepareStatement(query2);
			pstmt.setString(1, Tstu_ID.getText());
			pstmt.setString(2, Tname.getText());
			pstmt.setString(3, Taddr.getText());
			pstmt.setString(4, TRnumber.getText() + "-" + TRnumber2.getText());
			pstmt.setString(5, Tphone.getText() + "-" + Tphone2.getText() + "-" + Tphone3.getText());
			pstmt.setString(6, Tphone4.getText());
			pstmt.setString(7, Tyear.getText());
			pstmt.setString(8, Tgraduate.getText());
			pstmt.setString(9, Tgraduate_year.getText());
			pstmt.setString(10, dept_code);
			pstmt.setString(11, prof_code);
			pstmt.setString(12, g);
			result = pstmt.executeUpdate();
			getListALL();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		if (result != 0) {
			JOptionPane.showMessageDialog(this, Tname.getText() + "가 추가 되었습니다.");
		} else {
			JOptionPane.showMessageDialog(getParent(), "추가 실패");

		}
		return result;

	}
	public int revise(String profcode) {// 수정
		int result =0;
		
			String query = "UPDATE student SET name=?,addr=?,juminno=?,mphone=?,phone=?, uin_year=?, hischool=?, end_year=?, dept_code=?,prof_code=?, gender=? where code=?";
			
			try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tname.getText());
			pstmt.setString(2, Taddr.getText());
			pstmt.setString(3, TRnumber.getText()+"-"+TRnumber2.getText());
			pstmt.setString(4, Tphone.getText()+"-"+Tphone2.getText()+"-"+Tphone3.getText());
			pstmt.setString(5, Tphone4.getText());
			pstmt.setString(6, Tyear.getText());
			pstmt.setString(7, Tgraduate.getText());
			pstmt.setString(8, Tgraduate_year.getText());
			pstmt.setString(9, dept_code);
			pstmt.setString(10, prof_code);
			pstmt.setString(11, g);
			pstmt.setString(12, Tstu_ID.getText());
			result = pstmt.executeUpdate();
			getListALL();

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		if (result != 0) {
			JOptionPane.showMessageDialog(this, Tname.getText() + "수정되었습니다..");
		} else {
			JOptionPane.showMessageDialog(getParent(), "수정 실패");
		}

		return result;

	}
	public void search(String s) {// 조회
		
		String[] scombofield = {"code", "addr", "dept_code","hischool","prof_code","gender"};
		s= scombofield[cb3.getSelectedIndex()];
		dtm.setRowCount(0); // 0으로 초기화시켜줌
		
		String dept_code = null; dept_name=null;
		String prof_code = null; prof_name=null;
		String deptcode = null;  String deptname= null;
		String profcode= null; String profname= null;
		
		String scode= null; String sname=null;
		try {
			if(Tsearch.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "조회할 내용을 입력하세요?", "조회!!!",JOptionPane.CANCEL_OPTION);
					Tsearch.requestFocus();
				return;
			}
			
			if(s.equals("code")) {
				String query = "SELECT * FROM student where name = ? or code=?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, Tsearch.getText());
				pstmt.setString(2, Tsearch.getText());
				rs = pstmt.executeQuery();
				
				
				while(rs.next()) {
					scode = rs.getString(1);
					sname = rs.getString(2);
					}
				query = "SELECT * FROM student where " + s + " = '" + scode + "'";
				pstmt = connector.conn.prepareStatement(query);
	
				
				
				}
			else if(s.equals("dept_code")) {
				String query = "SELECT * FROM department where dep_code =? or dep_name=?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, Tsearch.getText());
				pstmt.setString(2, Tsearch.getText());
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					deptcode = rs.getString(1);
					deptname = rs.getString(2);
				
				}
				
				query = "SELECT * FROM subject where " + s + "='" + deptcode + "'";
				pstmt = connector.conn.prepareStatement(query);
				
				
			}
			else if(s.equals("prof_code")) {
				String query = "SELECT * FROM professor where code =? or name=?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, Tsearch.getText());
				pstmt.setString(2, Tsearch.getText());
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					profcode = rs.getString(1);
					profname= rs.getString(2);
				
				}
				
				query = "SELECT * FROM subject where " + s + "='" + profcode + "'";
				pstmt = connector.conn.prepareStatement(query);
				
			}

			else {
					String query = "SELECT * FROM student where " + s + " = '" + Tsearch.getText() + "'";
					pstmt = connector.conn.prepareStatement(query);
					}
					rs = pstmt.executeQuery();

				while (rs.next()) {
				String code = rs.getString(1);
				String name= rs.getString(2);
				String addr = rs.getString(3);
				String juminno = rs.getString(4);
				String mphone = rs.getString(5);
				String phone = rs.getString(6);
				String uin_year = rs.getString(7);
				String hischool = rs.getString(8);
				String end_year = rs.getString(9);
				String dept_code1= rs.getString(10);
				String prof_code1 = rs.getString(11);
				String gender = rs.getString(12);
				
				String query = "SELECT * FROM department where dep_code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, dept_code1);
				rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {
					dept_name = rs1.getString(2);
				}
				
				String query2 = "SELECT * FROM professor where code = ?";
				pstmt = connector.conn.prepareStatement(query2);
				pstmt.setString(1, prof_code1);
				rs2 = pstmt.executeQuery();
				
				while(rs2.next()) {
					prof_name = rs2.getString(2);
				}
				
				Object[] rowdata = { code, name, addr, juminno, mphone, phone, uin_year, hischool, end_year, dept_name,prof_name,
						gender };
				dtm.addRow(rowdata);
				
				}
		}catch (SQLException e1) {
			e1.printStackTrace();
		} 
	}
	public void delete() throws SQLException { // 삭제
		int srow = table.getSelectedRow();
		dtm.setRowCount(0);
		String query = "DELETE FROM student where code=?";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tsearch.getText());
			int result = pstmt.executeUpdate();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	
		getListALL();

		
		

	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		

		if (ob == input) {// 입력
			try {
				input(Tstu_ID.getText());
			} catch (HeadlessException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (ob == revise) {// 수정
			revise(Tstu_ID.getText());
		}
			
		if (ob == del) {// 삭제
			try {
				delete();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		if (ob == end1) {// 종료
			//this.dispose();
			this.setVisible(false);
		}
		if (ob == search) {// 조회
			
		search(Tstu_ID.getText());
		}
		
		if (ob == search_all) {// 전체조회
			getListALL();
		}
		
		}
	
	

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int srow = table.getSelectedRow();
			
			String code = (String)table.getValueAt(srow, 0);
			Tstu_ID.setText(code);
			
			Tname.setText(table.getValueAt(srow,1).toString());
			String txtnumber = (String) table.getValueAt(srow, 3);
			Taddr.setText(table.getValueAt(srow,2).toString());
			String txtphone = (String) table.getValueAt(srow, 4);
			Tphone4.setText(table.getValueAt(srow,5).toString());
			Tyear.setText(table.getValueAt(srow,6).toString());
			
			Tgraduate.setText(table.getValueAt(srow,7).toString());
			Tgraduate_year.setText(table.getValueAt(srow,8).toString());
			
			
			//department.(table.getValueAt(srow, 8).toString());
			String dept_code = (String) table.getValueAt(srow, 9);
			cb1.setSelectedItem(dept_code);
			
			
			String prof_code = (String) table.getValueAt(srow, 10);
			cb2.setSelectedItem(prof_code);
			
			TRnumber.setText(txtnumber.substring(0, 6));
			TRnumber2.setText(txtnumber.substring(7, 13));
			
			
			Tphone.setText(txtphone.substring(0, 3));
			Tphone2.setText(txtphone.substring(4, 8));
			Tphone3.setText(txtphone.substring(9, 13));
			
			if (gender.equals("여자")) {
				wo.setSelected(true);
				g = "여자";
			} else {
				man.setSelected(true);
				g = "남자";
			}
		}
	}
	

	

}
