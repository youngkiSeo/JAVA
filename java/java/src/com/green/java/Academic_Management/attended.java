package com.green.java.Academic_Management;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.text.SimpleAttributeSet;


public class attended extends JFrame implements ActionListener {
	JPanel panel, panel2, panel3, panel4;
	JLabel atte,code, name, dep;
	JTextField Tcode, Tname, Tdep, Tdep2,Tdep3;
	JComboBox Cdep;
	JButton del, exit, search, search_all;
	TitledBorder tBorder,inBorder,ieBorder;
	
	DefaultTableModel dtm, dtm2;
	JTable subject_table, sign_uptable;
	JScrollPane jsp,jsp2;
	
	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs;
	SimpleAttributeSet set;
	String g,f;
	ResultSet rs1;
	String dep_name= "";
	String deptcode = "";
	ResultSet rs2;
	ResultSet rs3;
	
	String[] scombo = { "컴퓨터공학", "방사선", "물리치료", "사무자동화","간호1" };
	String[] scombofield = { "code", "name", "dept_code", "gender" };
	
	menu np;

	
	attended(String abc,menu np) throws SQLException {
		this.np= np;
		this.setTitle("교수 관리");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 60);

		atte = new JLabel("수강신청");
		atte.setBounds(350, 25, 780, 20);
		atte.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		atte.setForeground(Color.WHITE);
		panel.setBackground(Color.black);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 65, 780, 130);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);
		
		code= new JLabel("학생코드");
		code.setBounds(30, 20, 60, 25);
		
		
		Tcode = new JTextField();
		Tcode.setBounds(90, 20, 120, 25);
		
		Tcode.setText(abc);
		
		name= new JLabel("이름");
		name.setBounds(230, 20, 30, 25);
		
		Tname = new JTextField();
		Tname.setBounds(270, 20, 120, 25);
		
		dep= new JLabel("학과");
		dep.setBounds(420, 20, 50, 25);
		
		Tdep = new JTextField();
		Tdep.setBounds(480, 20, 120, 25);
		
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 200, 780, 80);
		panel3.setBackground(Color.pink);
		
		String[] list2 = { "개설학과 선택하세요", "컴퓨터공학", "방사선","물리치료","사무자동화" ,"간호1" };
		Cdep = new JComboBox(list2);
		// cb1.addActionListener(this);
		Cdep.setBounds(10, 20, 180, 30);

		Tdep2 = new JTextField();
		Tdep2.setBounds(200, 20, 120, 30);
		
		Tdep3 = new JTextField();
		Tdep3.setBounds(330, 20, 120, 30);

		search = new JButton("조회");
		search.setBackground(Color.green);
		search.setForeground(Color.WHITE);
		search.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		search.setBounds(470, 20, 120, 40);

		search_all = new JButton("전체조회");
		search_all.setBounds(600, 20, 120, 40);
		// searchall.setFont(new Font("한컴 바겐세일 B", Font.ITALIC, 10));
		search_all.setBackground(Color.green);
		search_all.setForeground(Color.WHITE);
		search_all.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		
		String[] colheading = { "교과목코드", "교과목명", "개설학과","수업시수","담당교수","학점"} ;
		String[][] rowdata = {};
		dtm = new DefaultTableModel(rowdata, colheading) { // 모델 생성
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		
		subject_table = new JTable(dtm); // 모델에 테이블 연결
		jsp = new JScrollPane(subject_table);
		jsp.setBounds(0, 280, 780, 50);
		inBorder = new TitledBorder("교과목 테이블");
		jsp.setBorder(inBorder);
		jsp.setBounds(0, 280, 780, 200);
		
		
		
		String[] colheading2 = { "교과목코드", "교과목명", "개설학과","수업시수","담당교수","학점"} ;
		String[][] rowdata2 = {};
		dtm2 = new DefaultTableModel(rowdata2, colheading2) { // 모델 생성
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		sign_uptable = new JTable(dtm2); // 모델에 테이블 연결
		jsp2 = new JScrollPane(sign_uptable);
		jsp2.setBounds(0, 480, 780, 50);
		ieBorder = new TitledBorder("수강신청 테이블");
		jsp2.setBorder(ieBorder);
		jsp2.setBounds(0, 480, 780, 200);
		
		sign_uptable.setBackground(new Color(255, 255, 204));
		sign_uptable.setSelectionBackground(Color.blue);
		sign_uptable.setSelectionForeground(Color.WHITE);
		sign_uptable.setRowHeight(25);
		
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(0, 680, 780, 80);
		panel4.setBackground(Color.pink);
		
		del = new JButton("삭제");
		del.setBounds(390, 20, 100, 50);
		del.setBackground(Color.gray);
		del.setForeground(Color.WHITE);
		del.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		
		exit = new JButton("종료");
		exit.setBounds(570, 20, 100, 50);
		exit.setBackground(Color.gray);
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		
		panel4.add(del);
		panel4.add(exit);
		panel3.add(search_all);
		panel3.add(search);
		panel3.add(Tdep3);
		panel3.add(Tdep2);
		panel3.add(Cdep);
		panel2.add(dep);
		panel2.add(Tdep);
		panel2.add(Tname);
		panel2.add(name);
		panel2.add(Tcode);
		panel2.add(code);
		panel.add(atte);
		add(jsp2);
		add(jsp);
		add(panel4);
		add(panel3);
		add(panel2);
		add(panel);
		
		//search.addItemListener(this);
		
		DBConnect();
		textaddept(); // 텍스트에 학과 표시(학생코드 이용 department 테이블)
		getdepartment();
		getListALLsubject();
		getListALLAttended();
		del.addActionListener(this);
		search.addActionListener(this);
		search_all.addActionListener(this);
		exit.addActionListener(this);
		subject_table.addMouseListener(new MyMouseListener());
		

		setSize(800, 800);
		setVisible(true);
		
		Cdep.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				String category = (String) ie.getItem();
				try {
					String query = "SELECT * FROM department where dep_name = ? ";
					pstmt = connector.conn.prepareStatement(query);
					pstmt.setString(1, category);

					rs = pstmt.executeQuery();
					while (rs.next()) {
						String deptcode = rs.getString(1);
						String deptname = rs.getString(2);
						Tdep2.setText(deptcode);
						Tdep3.setText(deptname);
					}
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}
		});

	}
	
	
	//텍스트필드에 학과표시
	public void textaddept() {
		String stdname = null;
		String deptname = null;
		String deptcode = null;
		String query = "SELECT * FROM student where code = ? ";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tcode.getText());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				stdname = rs.getString(2);
				deptcode= rs.getString(10);
				
				Tname.setText(stdname);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		String query2 = "SELECT * FROM department where dep_code = ? ";
		try {
			pstmt = connector.conn.prepareStatement(query2);
			pstmt.setString(1, deptcode);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				deptname = rs.getString(2);
				Tdep.setText(deptname);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	//콤보에 학과명 추가
	public void getdepartment() {
		String query = "SELECT * FROM department";
		try {
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dept_code = rs.getString(1);
				String dept = rs.getString(2);
				// search.addItem(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public void DBConnect() throws SQLException {
		connector = new DBConm();
	}

	public void getListALLsubject() {
		String dept_name = "";
		try {
			dtm.setRowCount(0);
			String query = "SELECT * FROM subject left OUTER JOIN (SELECT * FROM attended where std_code=?) as att on(subject.code = att.subj_code)";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, code.getText());
			rs = pstmt.executeQuery();

			// 두테이블(subject + attend) JOIN 결과 레코드
			while (rs.next()) {
				// 조인원 레코드 (subject 테이블 + attended 테이블)에서
				// subject 테이블 필드
				String subjcode = rs.getString(1);// 교과코드
				String subject = rs.getString(2);// 교과목명
				String deptcode = rs.getString(3);// 학과코드
				String year = rs.getString(4);
				String grade = rs.getString(5);
				String term = rs.getString(6);
				String time = rs.getString(7);
				String profcode = rs.getString(8); // 교수코드
				String credit = rs.getString(9);
				// attended 테이블 필드, s101 학생이 수강 신청한 교과목코드
				String att_subj_code = rs.getString(13);

				if (att_subj_code != null) // null 이면 수강신청 안한 교과목
					continue;

				// null 이면 수강신청 위해 위테이블 표시
				String deptname = "", profname = ""; // 학과명, 교수명

				query = "SELECT * FROM department where dep_code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, deptcode);
				rs1 = pstmt.executeQuery();

				while (rs1.next()) {
					dept_name = rs1.getString(2);
				}

				String query2 = "SELECT * FROM professor where code = ?";
				pstmt = connector.conn.prepareStatement(query2);
				pstmt.setString(1, profcode);
				ResultSet rs2 = pstmt.executeQuery();

				while (rs2.next()) {
					profname = rs2.getString(2);
				}

				Object[] rowdata = { subjcode, subject, dept_name, time, profname, credit };
				dtm.addRow(rowdata);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	 
	public void getListALLAttended() {
		
		dtm2.setRowCount(0);
		try {
			//attended(수강신청 테이블)
			dtm2.setRowCount(0);
			String query = "SELECT * FROM attended where std_code = ?";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tcode.getText());
			rs = pstmt.executeQuery();
			
		
		while(rs.next()) {
			String indexno = rs.getString(1);
			String std_code = rs.getString(2);
			String prof_code = rs.getString(3);
			String subj_code = rs.getString(4);
			String year = rs.getString(5);
			
			String dept_code = null;
			String subject = null;
			String deptname = "";
			String profname = "";
			String grade = "";
			String term = "";
			String time = "";
			String credit = "";
			String profcode = "";
			
			query = "SELECT * FROM subject where code = ?";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, subj_code);
			rs1 = pstmt.executeQuery();
			while(rs1.next()) {
				subj_code = rs1.getString(1);
				subject = rs1.getString(2);
				dept_code = rs1.getString(3);
				year = rs1.getString(4);
				grade = rs1.getString(5);
				term = rs1.getString(6);
				time = rs1.getString(7);
				profcode = rs1.getString(8);
				credit = rs1.getString(9);
				
			}
			//department 테이블
			query = "SELECT * FROM department where dep_code = ?";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, dept_code);
			rs2 = pstmt.executeQuery();
			while(rs2.next()) {
				deptname = rs2.getString(2);
			}
			//교수 테이블
			query = "SELECT * FROM professor where code = ?";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, profcode);
			rs2 = pstmt.executeQuery();
			while(rs2.next()) {
				profname = rs2.getString(2);
			}
			
			Object[] rowdata = { subj_code, subject, deptname, time, profname, credit };
			dtm2.addRow(rowdata);
		}
	}catch (SQLException e) {
		e.printStackTrace();
	}
	}
	
	
	
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			// subject_table.getMouseListeners();

			int selRow=subject_table.getSelectedRow();
			String subj_code = (String) subject_table.getValueAt(selRow, 0);  // 교과목 코드
			String stu_code = Tcode.getText();
			String dept_code = null;
			String deptname = "";
			String profname = "";
			String grade = "";
			String term = "";
			String profcode = "";
			String year = "";
			//String stucode = "";
			String indexno = null;
			
			
			
			String query = "SELECT * FROM attended where std_code = ? and subj_code = ? ";
			try {
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, stu_code);		//s_code 학생코드
				pstmt.setString(2, subj_code);	//subj_code 교과목코드
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					JOptionPane.showMessageDialog(null, "이미 수강신청되어 있습니다. 다시 선택하세요 ? ", "수강신청!!!",
							JOptionPane.WARNING_MESSAGE);
					return;
				}

			} catch (SQLException ae) {
				ae.printStackTrace(); 
			}
			
			int result = 0;

			query = "SELECT * FROM subject where code = '" + subj_code + "'";
			try {
				pstmt = connector.conn.prepareStatement(query);
				rs1 = pstmt.executeQuery();

				while (rs1.next()) {
					subj_code = rs1.getString(1);
					
					dept_code = rs1.getString(3);
					year = rs1.getString(4);
					grade = rs1.getString(5);
					term = rs1.getString(6);
					
					profcode = rs1.getString(8);
					

				}

				

				query = "INSERT INTO attended (indexno, std_code, prof_code, subj_code, year)" + "values(?,?,?,?,?)";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, null);
				pstmt.setString(2, stu_code);
				pstmt.setString(3, profcode);
				pstmt.setString(4, subj_code);
				pstmt.setString(5, year);

				result = pstmt.executeUpdate();

				query = "INSERT INTO results(indexno, prof_code,std_code,subj_code,year,grade,term, middle,fainal,report,attended,added,sum,grade_value)"
						+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, null);
				pstmt.setString(2, profcode);
				pstmt.setString(3, stu_code);
				pstmt.setString(4, subj_code);
				pstmt.setString(5, year);
				pstmt.setString(6, grade);
				pstmt.setString(7, term);
				pstmt.setInt(8, 0);
				pstmt.setString(9, "0");
				pstmt.setString(10, "0");
				pstmt.setString(11, "0");
				pstmt.setString(12, "0");
				pstmt.setString(13, "0");
				pstmt.setString(14, "0");
				result = pstmt.executeUpdate();
				
				getListALLsubject();
				getListALLAttended();
	
				

			} catch (SQLException ie) {
				ie.printStackTrace();
			}

		}
	}

	public void delete() throws SQLException { // 삭제
		int srow = sign_uptable.getSelectedRow();
		dtm.setRowCount(0);
		String query = "DELETE FROM attended where subj_code=?";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tdep2.getText());
			int result = pstmt.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		getListALLsubject();
		getListALLAttended();
		

	}
	
	public void search() throws SQLException {
		dtm.setRowCount(0); // 0으로 초기화시켜줌
		String query = "SELECT * FROM subject where dept_code = ?";

		pstmt = connector.conn.prepareStatement(query);
		pstmt.setString(1, Tdep2.getText());

		rs = pstmt.executeQuery();

		while (rs.next()) {
			String code = rs.getString(1);
			String dep_name = rs.getString(2);
			String subject = rs.getString(3);
			String time = rs.getString(4);
			String prof = rs.getString(5);
			String grade = rs.getString(6);

			Object[] rowData = { code, dep_name, subject,time,prof,grade };
			dtm.addRow(rowData);
		}
	}
	public void getListALL() {
		try {
			dtm.setRowCount(0);
			String query = "SELECT * FROM subject ";
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String code = rs.getString(1);
				String dep_name = rs.getString(2);
				String subject = rs.getString(3);
				String time = rs.getString(4);
				String prof = rs.getString(5);
				String grade = rs.getString(6);

				Object[] rowData = { code, dep_name, subject,time,prof,grade };
				dtm.addRow(rowData);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

		
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == search) {
			try {
				search();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(o == search_all) {
			getListALL();
			
		}
		if(o == exit) {
			this.dispose();
		}
		if(o == del) {
			try {
				delete();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	



}
