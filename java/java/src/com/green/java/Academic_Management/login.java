package com.green.java.Academic_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class login extends JFrame implements ActionListener {
	JPanel panel, panel2, panel3, panel4;
	JLabel login_name, id, pw, name;
	JTextField Tname, Tid, Tpw;
	JButton Confirm;
	TitledBorder tBorder;

	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs;
	String userid, userpassword, username;
	menu Tmenu;
	login() {
		this.setTitle("로그인");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 60);

		login_name = new JLabel("로그인");
		login_name.setBounds(350, 25, 780, 20);
		login_name.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		login_name.setForeground(Color.WHITE);
		panel.setBackground(Color.black);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 65, 780, 130);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);

		id = new JLabel("아이디");
		id.setBounds(30, 20, 80, 25);

		Tid = new JTextField();
		Tid.setBounds(120, 20, 120, 25);

		pw = new JLabel("패스워드");
		pw.setBounds(255, 20, 80, 25);

		Tpw = new JTextField();
		Tpw.setBounds(340, 20, 120, 25);

		name = new JLabel("사용자이름");
		name.setBounds(470, 20, 80, 25);

		Tname = new JTextField();
		Tname.setBounds(560, 20, 120, 25);

		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 210, 780, 80);
		panel3.setBackground(Color.pink);

		Confirm = new JButton("확인");
		Confirm.setBounds(500, 20, 100, 30);
		Confirm.setBackground(Color.green);
		Confirm.setForeground(Color.WHITE);
		Confirm.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		panel3.add(Confirm);
		panel2.add(Tpw);
		panel2.add(pw);
		panel2.add(Tname);
		panel2.add(name);
		panel2.add(Tid);
		panel2.add(id);
		panel.add(login_name);

		add(panel3);
		add(panel2);
		add(panel);
		DBConnect();

		setSize(800, 800);
		setVisible(true);

		Confirm.addActionListener(this);

	}

	public void DBConnect() {
		try {
			connector = new DBConm();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int admin() {
		int result = 0;
		String query = "SELECT * FROM admin where id = ? and password = ?";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tid.getText());
			pstmt.setString(2, Tpw.getText());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				userid = rs.getString(1);
				userpassword = rs.getString(2);
				username = rs.getString(3);
				String user_permission = rs.getString(4);
			}
			if (Tid.getText().equals(userid) && Tpw.getText().equals(userpassword)) {
				Tname.setText(username);
				JOptionPane.showMessageDialog(this, username + "님 반갑습니다.", "조회완료", JOptionPane.WARNING_MESSAGE);

				Tmenu = new menu(userid);

				this.dispose();

			} else {
				JOptionPane.showMessageDialog(this, "아이디와 패스워드가 맞지 않아요");

				return result;

			}

		}

		catch (SQLException e) {
			e.printStackTrace();

		}
		return result;

	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == Confirm) {
			int result = admin();
		}
	}
	public static void main(String[] args) {
		new login();
	}
}
