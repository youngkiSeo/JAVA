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

import javax.swing.JButton;
import javax.swing.JComboBox;
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



public class subject extends JFrame implements ActionListener{
	JPanel panel, panel2, panel3, panel4;
	JLabel subname, code, name, year, department, grade, semester, class_time, professor, grades;
	JComboBox Cyear, Cdepartment, Cgrade, Csemester, Cprofessor, Csearch;
	JTextField Tcode, Tname, Tclass_time, Tgrades, Tsearch;
	JButton input, revise, del, end, search, search_all;
	TitledBorder tBorder, inBorder;
	DefaultTableModel dtm;
	JTable table;
	JScrollPane jsp, scroll;
	
	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs,rs1,rs2;
	String depcode =null; String deptcode= null; String deptname =null;
	String prof_code= null; String profcode= null; String profname= null;
	String abc = null; String dep_name=null; String year2=null; String grade2=null;
	String semester2=null;
	
	menu np;
	subject(menu np) throws SQLException {
		
		this.np= np;

		this.setTitle(" 관리");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 60);

		subname = new JLabel("교과목관리");
		subname.setBounds(350, 25, 780, 20);
		subname.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		subname.setForeground(Color.WHITE);
		panel.setBackground(Color.black);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 65, 780, 170);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);

		code = new JLabel("교과목코드");
		code.setBounds(30, 20, 80, 25);

		Tcode = new JTextField();
		Tcode.setBounds(120, 20, 120, 25);

		name = new JLabel("개설강좌명");
		name.setBounds(255, 20, 80, 25);

		Tname = new JTextField();
		Tname.setBounds(340, 20, 120, 25);

		year = new JLabel("개설년도");
		year.setBounds(475, 20, 80, 25);

		String[] list = { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029" };
		Cyear = new JComboBox(list);
		Cyear.setBounds(560, 20, 120, 25);

		department = new JLabel("개설학과");
		department.setBounds(30, 50, 80, 25);

		String[] list2 = { "개설학과", "컴퓨터공학", "방사선", "물리치료", "사무자동화", "간호1" };
		Cdepartment = new JComboBox(list2);
		Cdepartment.setBounds(120, 50, 120, 25);

		grade = new JLabel("개설학년");
		grade.setBounds(255, 50, 80, 25);

		String[] list3 = { "1학년", "2학년", "3학년", "4학년", "5학년" };
		Cgrade = new JComboBox(list3);
		;
		Cgrade.setBounds(340, 50, 120, 25);

		semester = new JLabel("개설학기");
		semester.setBounds(475, 50, 80, 25);

		String[] list4 = { "1학기", "2학기", "3여름학기", "4가을학기" };
		Csemester = new JComboBox(list4);
		Csemester.setBounds(560, 50, 120, 25);

		class_time = new JLabel("수업시수");
		class_time.setBounds(30, 80, 80, 25);

		Tclass_time = new JTextField();
		Tclass_time.setBounds(120, 80, 120, 25);

		professor = new JLabel("담당교수");
		professor.setBounds(255, 80, 80, 25);

		String[] list5 = { "담당교수", "김하나", "김두리", "정교수", "정두리" };
		Cprofessor = new JComboBox(list5);
		
		Cprofessor.setBounds(340, 80, 120, 25);

		grades = new JLabel("개설학점");
		grades.setBounds(475, 80, 80, 25);

		Tgrades = new JTextField();
		Tgrades.setBounds(560, 80, 120, 25);

		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 250, 780, 80);
		panel3.setBackground(Color.pink);

		String[] list6 = {  "code", "subject", "dept_code", "prof_code", "year","검색할 카테고리 선택하세요" };
		Csearch = new JComboBox(list6);
		// cb1.addActionListener(this);
		Csearch.setBounds(10, 20, 180, 30);

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

		String[] colheading = { "교과코드", "교고명", "개설학과", "개설년도", "개설학년", "개설학기", "수업시수", "담당교수", "학점" };
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
		jsp.setBounds(0, 340, 780, 80);
		inBorder = new TitledBorder("테이블");
		jsp.setBorder(inBorder);
		jsp.setBounds(0, 350, 780, 300);

		table.setBackground(new Color(255, 255, 204));
		table.setSelectionBackground(Color.blue);
		table.setSelectionForeground(Color.WHITE);
		table.setRowHeight(25);
		// scroll = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		// JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		table.setAutoCreateColumnsFromModel(true);
		// add(jsp);

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

		end = new JButton("종료");
		end.setBounds(570, 20, 100, 50);
		end.setBackground(Color.gray);
		end.setForeground(Color.WHITE);
		end.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		panel4.add(input);
		panel4.add(revise);
		panel4.add(del);
		panel4.add(end);
		panel3.add(search);
		panel3.add(search_all);
		panel3.add(Csearch);
		panel3.add(Tsearch);

		panel2.add(grades);
		panel2.add(Tgrades);
		panel2.add(Cprofessor);
		panel2.add(professor);
		panel2.add(Tclass_time);
		panel2.add(class_time);
		panel2.add(Csemester);
		panel2.add(semester);
		panel2.add(Cgrade);
		panel2.add(grade);
		panel2.add(Cdepartment);
		panel2.add(department);
		panel2.add(year);
		panel2.add(Cyear);
		panel2.add(Tname);
		panel2.add(name);
		panel2.add(Tcode);
		panel2.add(code);
		panel.add(subname);
		add(jsp);
		add(panel4);
		add(panel3);
		add(panel2);
		add(panel);
		DBConnect();
		getListALL();
		Major();
		Prof();
		
		search.addActionListener(this);
		search_all.addActionListener(this);
		end.addActionListener(this);
		revise.addActionListener(this);
		input.addActionListener(this);
		del.addActionListener(this);
		table.addMouseListener(new MyMouseListener());
		setSize(800, 800);
		setVisible(true);
		
		
		
		Cdepartment.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				depcode = (String) Cdepartment.getSelectedItem();

				try {
					String query =  "SELECT * FROM department where dep_name = ?";
					pstmt = connector.conn.prepareStatement(query);
					pstmt.setString(1, depcode);
					
					rs = pstmt.executeQuery();

					while (rs.next()) {
						deptcode = rs.getString(1);
						deptname = rs.getString(2);
					}
				} catch (SQLException a) {
					a.printStackTrace();
				}
			}

		});
		
		
		
		Cprofessor.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				prof_code = (String) Cprofessor.getSelectedItem();

				try {
					String sqls =  "SELECT * FROM professor where name = ?";
					pstmt = connector.conn.prepareStatement(sqls);
					pstmt.setString(1, prof_code);
					
					rs = pstmt.executeQuery();

					while (rs.next()) {
						profcode = rs.getString(1);
						profname = rs.getString(2);
					}
				} catch (SQLException a) {
					a.printStackTrace();
				}
			}

		});
		Csearch.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				abc = (String) Csearch.getSelectedItem();
				Tsearch.requestFocus();
			}

		});
	}
	
	void Major() {

		try {
			String query = "SELECT * FROM department";
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dept = rs.getString(2);
				Cdepartment.addItem(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void Prof() {

		try {
			String query = "SELECT * FROM professor";
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String prof = rs.getString(2);
				Cprofessor.addItem(prof);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void DBConnect() throws SQLException {
		connector = new DBConm();

	}
	
	public void getListALL() {
		String prof_name = null;
		try {
			dtm.setRowCount(0);
			String query = "SELECT * FROM subject ";
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String depcode = rs.getString(3);
				String year = rs.getString(4);
				String grade = rs.getString(5);
				String semester = rs.getString(6);
				String class_time = rs.getString(7);
				String procode = rs.getString(8);
				String grades = rs.getString(9);
				
				query = "SELECT * FROM department where dep_code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, depcode);
				rs2 = pstmt.executeQuery();
				
				while(rs2.next()) {
					dep_name = rs2.getString(2);
				}
				
				query = "SELECT * FROM professor where code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, procode);
				rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {
					prof_name = rs1.getString(2);
				}
				Object[] rowdata = { code, name, dep_name, year, grade, semester, class_time, prof_name, grades };
				dtm.addRow(rowdata);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void Search(String s) {
		String [] se = {"code","subject","dept_code","prof_code","year"};
		s = se[Csearch.getSelectedIndex()];
		dtm.setRowCount(0);
		
		String deptcode1 = null; String deptname1 = null;
		String profcode1 = null; String profname1 = null;
		try {
			if(Tsearch.getText().length()==0) {
				JOptionPane.showConfirmDialog(this, "조회할 내용을 입력하세요");
				Tsearch.requestFocus();
				return;
			}
			
			if(s.equals("dept_code")) {
				String query = "SELECT * FROM department where dep_name =? or dep_code=?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, Tsearch.getText());
				pstmt.setString(2, Tsearch.getText());
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					deptcode1 = rs.getString(1);
				
				}
				
				query = "SELECT * FROM subject where " + s + "='" + deptcode1 + "'";
				pstmt = connector.conn.prepareStatement(query);
				
			}
			else if(s.equals("prof_code")) {
				String query = "SELECT * FROM professor where name =? or code=?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(2, Tsearch.getText());
				pstmt.setString(1, Tsearch.getText());
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					profcode1 = rs.getString(1);
				
				}
				
				query = "SELECT * FROM subject where " + s + "='" + profcode1 + "'";
				pstmt = connector.conn.prepareStatement(query);
				
			}
			else {
				String query = "SELECT * FROM subject where "+s + "='" + Tsearch.getText() + "'";
				pstmt = connector.conn.prepareStatement(query); 
			}
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String code = rs.getString(1);
				String subject = rs.getString(2);
				String dept_code = rs.getString(3);
				String year = rs.getString(4);
				String grade = rs.getString(5);
				String term = rs.getString(6);
				String time = rs.getString(7);
				String prof_code = rs.getString(8);
				String credit = rs.getString(9);
				
				
				String query = "SELECT * FROM department where dep_code =?";
				try {
					pstmt = connector.conn.prepareStatement(query);
					pstmt.setString(1, dept_code);
					rs1 = pstmt.executeQuery();

					while (rs1.next()) {
						 deptname1 = rs1.getString(2);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				String query2 = "SELECT * FROM professor where code =?";
				try {
					pstmt = connector.conn.prepareStatement(query2);
					pstmt.setString(1, prof_code);
					rs1 = pstmt.executeQuery();

					while (rs1.next()) {
						 profname1 = rs1.getString(2);
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				

				Object[] rowData = { code, subject, deptname1, year, grade, term, time, profname1, credit };
				dtm.addRow(rowData);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void delete() throws SQLException { // 삭제
		int srow = table.getSelectedRow();
		dtm.setRowCount(0);
		String query = "DELETE FROM subject where code=?";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tsearch.getText());
			int result = pstmt.executeUpdate();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	
		getListALL();

	}
	public int input(String subject2) throws HeadlessException, SQLException { // 입력
		int result = 0;
		String query = "SELECT * FROM subject where code ='" +subject2 + "'";
				while(rs.next()) {
					JOptionPane.showMessageDialog(this, "이미 등록된 과목", "코드확인!!!",JOptionPane.WARNING_MESSAGE);
					Tsearch.requestFocus();
					return result;
				}

		try {
			String query2 = "INSERT INTO subject(code,subject, dept_code,year,grade,term,time,prof_code,credit)"
					+ "values(?,?,?,?,?,?,?,?,?)";
			pstmt = connector.conn.prepareStatement(query2);
			String code = rs.getString(1);
			String subject = rs.getString(2);
			String dept_code = rs.getString(3);
			String year = rs.getString(4);
			String grade = rs.getString(5);
			String term = rs.getString(6);
			String time = rs.getString(7);
			String prof_code = rs.getString(8);
			String credit = rs.getString(9);
			result = pstmt.executeUpdate();
			getListALL();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		if (result != 0) {
			JOptionPane.showMessageDialog(this, code.getText() + "가 추가 되었습니다.");
		} else {
			JOptionPane.showMessageDialog(getParent(), "추가 실패");

		}
		return result;

	}
	
	public int revise(String code) {// 수정
		int result =0;
		
			String query = "UPDATE subject SET subject=?,dept_code=?,year=?,grade=?,term=?, time=?, prof_code=?, credit=?, where code= ?";
			
			try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tname.getText());
			pstmt.setString(2, deptcode);
			pstmt.setString(3, year2);
			pstmt.setString(4, grade2);
			pstmt.setString(5, semester2);
			pstmt.setString(6, Tclass_time.getText());
			pstmt.setString(7, prof_code);
			pstmt.setString(8, Tgrades.getText());
			pstmt.setString(9, Tcode.getText());
			
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
	
	
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == input) {// 입력
			try {
				input(code.getText());
			} catch (HeadlessException | SQLException e1) {
				e1.printStackTrace();
			}
		
		}
			
		if (ob == revise) {// 수정
			revise(Tcode.getText());
		}
		if (ob == del) {// 삭제
			try {
				delete();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		
		}
		if (ob == end) {// 종료
			System.exit(0);
			

		}
		if (ob == search) {// 조회
			Search(abc);
		}
		
		if (ob == search_all) {// 전체조회
			getListALL();
		}
	}
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int srow = table.getSelectedRow();
			String code = (String)table.getValueAt(srow, 0);
			String subject = (String)table.getValueAt(srow, 1);
			String year = (String)table.getValueAt(srow, 2);
			String dep = (String)table.getValueAt(srow, 3);
			String grade = (String)table.getValueAt(srow, 4);
			String term = (String)table.getValueAt(srow, 5);
			String time = (String)table.getValueAt(srow, 6);
			String pro = (String)table.getValueAt(srow, 7);
			String credit = (String)table.getValueAt(srow, 8);
		
			
			
			Tcode.setText(code);
			Tname.setText(code);
			Cyear.setSelectedItem(year);
			Cdepartment.setSelectedItem(dep);
			Csemester.setSelectedItem(grade);
			Tclass_time.setText(time);
			Cprofessor.setSelectedItem(pro);
			Tgrades.setText(credit);

			
			
			
		}
	}

	
}