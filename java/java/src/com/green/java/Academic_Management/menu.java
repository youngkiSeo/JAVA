package com.green.java.Academic_Management;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.undo.UndoManager;

public class menu extends JFrame implements ActionListener {
	JMenuBar mb;
	JMenu stu, pro, dep, sub, add_id;
	JMenu signup, grade, add_id2;
	JMenu stu3, sub3, grade3, add_id3;

	JMenuItem f1, f2, f3, f4, f5;
	JMenuItem f11, f12, f13, f14, f15;
	JMenuItem f21, f22, f23, f24, f25;
	JTextPane text;
	UndoManager undoManager;
	SimpleAttributeSet saset;
	String np;
	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs;
	String user_permission;
	student Tstudent;
	professor Tprofessor;
	department Tdepartment;
	Admin TAdmin;
	Results_std TResults_std;
	attended Tattended;
	Results_prof TResults_prof;
	subject Tsubject;
	
	String user2;
	String user;

	menu(String np) {
		this.np = np;
		
		text = new JTextPane();
		undoManager = new UndoManager();
		saset = new SimpleAttributeSet();

		mb = new JMenuBar();
		stu = new JMenu("학생관리");
		pro = new JMenu("교수관리");
		dep = new JMenu("학과관리");
		sub = new JMenu("교과목관리");
		add_id = new JMenu("사용자등록");

		f1 = new JMenuItem("등록");
		f2 = new JMenuItem("등록");
		f3 = new JMenuItem("등록");
		f4 = new JMenuItem("등록");
		f5 = new JMenuItem("사용자등록");

		signup = new JMenu("수강관리");
		grade = new JMenu("성적관리");
		add_id2 = new JMenu("사용자등록");

		f11 = new JMenuItem("등록");
		f12 = new JMenuItem("조회");
		f13 = new JMenuItem("사용자등록");

		stu3 = new JMenu("학생관리");
		sub3 = new JMenu("교수관리");
		grade3 = new JMenu("학과관리");
		add_id3 = new JMenu("사용자등록");

		f21 = new JMenuItem("등록");
		f22 = new JMenuItem("등록");
		f23 = new JMenuItem("등록");
		f24 = new JMenuItem("사용자등록");

		this.setJMenuBar(mb);

		add(text);
		DBConnect();
		
		

		f1.addActionListener(this);
		f2.addActionListener(this);
		f3.addActionListener(this);
		f4.addActionListener(this);
		f5.addActionListener(this);
		f11.addActionListener(this);
		f12.addActionListener(this);
		f13.addActionListener(this);
		f21.addActionListener(this);
		f22.addActionListener(this);
		f23.addActionListener(this);
		f24.addActionListener(this);
		
		
		String query = "SELECT * FROM admin where id = ?";
		try {
			pstmt = connector.conn.prepareStatement(query);

			pstmt.setString(1, np);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				user = rs.getString(3);
				user_permission = rs.getString(5);
				
			}
			if (user_permission.equals("관리자")) {
				menu1(user);
			}

			if (user_permission.equals("학생")) {
				menu2(user);
			}

			if (user_permission.equals("교수")) {
				menu3(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		setSize(800, 800);
		setVisible(true);
	}

	public void menu1(String user) {
		user2=user;
		stu = new JMenu("학생관리");
		pro = new JMenu("교수관리");
		dep = new JMenu("학과관리");
		sub = new JMenu("교과목관리");
		add_id = new JMenu("사용자등록");

		f1 = new JMenuItem("등록");
		f2 = new JMenuItem("등록");
		f3 = new JMenuItem("등록");
		f4 = new JMenuItem("등록");
		f5 = new JMenuItem("사용자등록");

		stu.add(f1);
		pro.add(f2);
		sub.add(f3);
		dep.add(f4);
		add_id.add(f5);

		mb.add(stu);
		mb.add(pro);
		mb.add(sub);
		mb.add(dep);
		mb.add(add_id);

		this.setJMenuBar(mb);
		f1.addActionListener(this);
		f2.addActionListener(this);
		f3.addActionListener(this);
		f4.addActionListener(this);
		f5.addActionListener(this);
		
		add(text);
		this.setTitle("사용자: " + np + user2 );
		setSize(800, 800);
		setVisible(true);

	}

	public void menu2(String user) {
		user2= user;
		
		signup = new JMenu("수강관리");
		grade = new JMenu("성적관리");
		add_id2 = new JMenu("사용자등록");

		f11 = new JMenuItem("등록");
		f12 = new JMenuItem("조회");
		f13 = new JMenuItem("사용자등록");

		signup.add(f11);
		grade.add(f12);
		add_id2.add(f13);

		mb.add(signup);
		mb.add(grade);
		mb.add(add_id2);

		this.setJMenuBar(mb);

		f11.addActionListener(this);
		f12.addActionListener(this);
		f13.addActionListener(this);
		add(text);
		
		this.setTitle("사용자: " + np + user2 );
		setSize(800, 800);
		setVisible(true);

	}

	public void menu3(String user) {
		user2= user;
		System.out.println(user);
		stu3 = new JMenu("학생관리");
		sub3 = new JMenu("교수관리");
		grade3 = new JMenu("학과관리");
		add_id3 = new JMenu("사용자등록");

		f21 = new JMenuItem("등록");
		f22 = new JMenuItem("등록");
		f23 = new JMenuItem("등록");
		f24 = new JMenuItem("사용자등록");

		stu3.add(f21);
		sub3.add(f22);
		grade3.add(f23);
		add_id3.add(f24);

		mb.add(stu3);
		mb.add(sub3);
		mb.add(grade3);
		mb.add(add_id3);

		this.setJMenuBar(mb);
		
		add(text);
		
		f21.addActionListener(this);
		f22.addActionListener(this);
		f23.addActionListener(this);
		f24.addActionListener(this);
		
		this.setTitle("사용자: " + np + user2 );
		setSize(800, 800);
		setVisible(true);

	}

	public void DBConnect() {
		try {
			connector = new DBConm();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == f1) { // 학생관리
			setVisible(false);
			try {
				Tstudent = new student(this);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}

		if (ob == f2) { // 교수관리
			setVisible(false);
			try {
				Tprofessor = new professor(this);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}

		if (ob == f3) { // 교과목관리
			setVisible(false);
			try {
				Tsubject = new subject(this);
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}

		if (ob == f4) { // 학과관리
			setVisible(false);
			try {
				Tdepartment = new department(this);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		if (ob == f5) { // 사용자등록
			setVisible(false);
			try {
				TAdmin = new Admin(this);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
		if (ob == f11) { // 수강관리
			setVisible(false);
			try {
				Tattended = new attended(np, this);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}

		if (ob == f12) { // 성적관리

			setVisible(false);
			try {
				TResults_std = new Results_std(np, this);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
		if (ob == f13) { // 사용자등록
			setVisible(false);
			try {
				TAdmin = new Admin(this);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
			
			
			if (ob == f21) { // 학생관리
				setVisible(false);
				try {
					Tstudent = new student(this);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
			
			
			if (ob == f22) { // 교과목관리
				setVisible(false);
				try {
					Tsubject = new subject(this);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

			}
			
			if (ob == f23) { // 성적관리
				setVisible(false);
				try {
					TResults_prof = new Results_prof(np, this);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
			if (ob == f23) { // 사용자등록
				setVisible(false);
				try {
					TAdmin = new Admin(this);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}

		}
	}

