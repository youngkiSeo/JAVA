package com.green.java.Academic_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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

public class Results_std extends JFrame implements ActionListener{
	JPanel panel, panel2, panel3, panel4;
	JLabel proname,code, name, year, grade,semester;
	JComboBox Cyear, Cgrade,Csemester,Csearch;
	JTextField Tcode, Tname,Tsearch;
	JButton search, search_all,save ,exit;
	TitledBorder tBorder, inBorder;
	DefaultTableModel dtm;
	JTable table;
	JScrollPane jsp;
	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs, rs2;
	menu np;
	Results_std(String abc,menu np) throws SQLException  {
		this.np= np;
		this.setTitle(" 성적관리");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 60);

		proname = new JLabel("성적관리");
		proname.setBounds(350, 25, 780, 20);
		proname.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		proname.setForeground(Color.WHITE);
		panel.setBackground(Color.black);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 65, 780, 170);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);
		
		code = new JLabel("학생코드");
		code.setBounds(30, 20, 80, 25);
		
		Tcode = new JTextField();
		Tcode.setBounds(120, 20, 120, 25);
		Tcode.setText(abc);
		
		name = new JLabel("학생이름");
		name.setBounds(255, 20, 80, 25);

		Tname = new JTextField();
		Tname.setBounds(340, 20, 120, 25);
		
		year= new JLabel("개설년도");
		year.setBounds(475, 20, 80, 25);
		
		String[] list = { "2021", "2022", "2023", "2024", "2025", "2026","2027","2028","2029" };
		Cyear = new JComboBox(list);
		Cyear.setBounds(560, 20, 120, 25);
		
		grade = new JLabel("개설학년");
		grade.setBounds(30, 50, 80, 25);
		
		String[] list2 = { "1학년", "2학년", "3학년", "4학년", "5학년" };
		Cgrade = new JComboBox(list2);
		Cgrade.setBounds(120, 50, 120, 25);
		
		semester= new JLabel("개설학기");
		semester.setBounds(255, 50, 80, 25);
		
		String[] list3 = { "1학기", "2학기", "3여름학기", "4가을학기" };
		Csemester = new JComboBox(list3);
		Csemester.setBounds(340, 50, 120, 25);
		
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 250, 780, 80);
		panel3.setBackground(Color.pink);

		String[] list6 = { "검색할 카테고리 선택하세요"};
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


		String[] colheading = { "교과목명", "출석", "레포트", "중간", "기말", "가산점", "합계", "학점"};
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

		exit = new JButton("종료");
		exit.setBounds(570, 20, 100, 50);
		exit.setBackground(Color.gray);
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		panel4.add(exit);
		panel3.add(search);
		panel3.add(Tsearch);
		panel3.add(Csearch);
		panel2.add(Csemester);
		panel2.add(semester);
		panel2.add(Cgrade);
		panel2.add(grade);
		panel2.add(year);
		panel2.add(Cyear);
		panel2.add(Tname);
		panel2.add(name);
		panel2.add(Tcode);
		panel2.add(code);
		panel.add(proname);

		add(jsp);
		add(panel4);
		add(panel3);
		add(panel2);
		add(panel);

		DBConnect();
		codename();
		getListALL();
		textaddept();
		exit.addActionListener(this);
		search.addActionListener(this);

		setSize(800, 800);
		setVisible(true);

		Csearch.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				String category = (String) ie.getItem();
				try {
					String query = "SELECT * FROM subject where subject = ? ";
					pstmt = connector.conn.prepareStatement(query);
					pstmt.setString(1, category);

					rs = pstmt.executeQuery();
					while (rs.next()) {
						String deptcode = rs.getString(1);
						Tsearch.setText(deptcode);

					}
				} catch (SQLException e) {
					e.printStackTrace();

				}
			}
		});
	}

	public void codename() {

		try {
			String subj_name = null;
			String query = "SELECT * FROM results where std_code = ?";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tcode.getText());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String indexno = rs.getString(1);
				String prof_code = rs.getString(2);
				String std_code = rs.getString(3);
				String subj_code = rs.getString(4);

				query = "SELECT * FROM subject where code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, subj_code);
				rs2 = pstmt.executeQuery();
				while (rs2.next()) {
					subj_name = rs2.getString(2);
				}
				Csearch.addItem(subj_name);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void textaddept() {
		String stdname = "";
		String query = "SELECT * FROM student where code = ? ";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tcode.getText());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				stdname = rs.getString(2);

				Tname.setText(stdname);

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public void DBConnect() throws SQLException {
		connector = new DBConm();
	}

	public void getListALL() {
		String name2 = "";
		dtm.setRowCount(0);
		try {
			dtm.setRowCount(0);
			String query = "SELECT * FROM results where std_code = ?";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tcode.getText());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString(3);
				String name = rs.getString(3);
				String attendance = rs.getString(12);
				String report = rs.getString(10);
				String middle = rs.getString(8);
				String termend = rs.getString(9);
				String point = rs.getString(11);
				String total = rs.getString(13);
				String Grades = rs.getString(14);

				query = "SELECT * FROM student where code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, name);
				rs2 = pstmt.executeQuery();
				while (rs2.next()) {
					name2 = rs2.getString(2);
				}
				Object[] rowdata = { id, name2, attendance, report, middle, termend, point, total, Grades };
				dtm.addRow(rowdata);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void search() throws SQLException {// 검색
		dtm.setRowCount(0); // 0으로 초기화시켜줌

		try {
			if (Tsearch.getText().length() == 0) {
				JOptionPane.showMessageDialog(this, "조회할 내용을 입력하세요?", "조회!!!", JOptionPane.CANCEL_OPTION);
				Tsearch.requestFocus();
				return;
			}

			String name2 = "";
			String query = "SELECT * FROM results where subj_code = ?";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tsearch.getText());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(3);
				String name = rs.getString(3);
				String attendance = rs.getString(11);
				String report = rs.getString(10);
				String middle = rs.getString(8);
				String fainal = rs.getString(9);
				String point = rs.getString(12);
				String total = rs.getString(13);
				String Grades = rs.getString(14);

				query = "SELECT * FROM student where code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, name);
				rs2 = pstmt.executeQuery();
				while (rs2.next()) {
					name2 = rs2.getString(2);
				}
				Object[] rowdata = { id, name2, attendance, report, middle, fainal, point, total, Grades };
				dtm.addRow(rowdata);

			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == search) {
			try {
				search();
			} catch (SQLException e1) {
	
				e1.printStackTrace();
			}
		}

		if (ob == exit) {
			System.exit(0);
		}
	}


	

}
