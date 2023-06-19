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

public class department extends JFrame implements ActionListener// implements ActionListener{
{
	JPanel panel, panel2, panel3, panel4;
	JTextField Tcode, Tname, TMajorname, Tsearch;
	JLabel depname, code, name, Majorname;
	JButton search, search_all, input, revise, del, end;
	JComboBox cb1;
	JTable table;
	JScrollPane jsp;
	TitledBorder tBorder, inBorder;
	DefaultTableModel dtm;
	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs;
	SimpleAttributeSet set;
	menu np;
	String query = "SELECT * FROM department where dep_code = ?";

	department(menu np) throws SQLException {
		this.np= np;
		this.setTitle("학과관리");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 580, 60);
		depname = new JLabel("학과관리");
		depname.setBounds(250, 25, 580, 20);
		depname.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		depname.setForeground(Color.WHITE);
		panel.setBackground(Color.black);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 80, 580, 160);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);

		code = new JLabel("학과코드");
		code.setBounds(20, 20, 60, 25);

		Tcode = new JTextField();
		Tcode.setBounds(80, 20, 120, 25);

		name = new JLabel("학과명");
		name.setBounds(210, 20, 50, 25);

		Tname = new JTextField();
		Tname.setBounds(260, 20, 120, 25);

		Majorname = new JLabel("전공명");
		Majorname.setBounds(390, 20, 60, 25);

		TMajorname = new JTextField();
		TMajorname.setBounds(440, 20, 120, 25);

		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 250, 580, 80);
		panel3.setBackground(Color.pink);

		String[] list = { "학과코드", "학과명", "전공명", "검색할 카테고리 선택하세요" };
		cb1 = new JComboBox(list);
		// cb1.addActionListener(this);
		cb1.setBounds(10, 20, 180, 30);

		Tsearch = new JTextField();
		Tsearch.setBounds(200, 20, 140, 30);

		search = new JButton("조회");
		search.setBackground(Color.green);
		search.setForeground(Color.WHITE);
		search.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		search.setBounds(350, 20, 90, 40);

		search_all = new JButton("전체조회");
		search_all.setBounds(450, 20, 120, 40);
		// searchall.setFont(new Font("한컴 바겐세일 B", Font.ITALIC, 10));
		search_all.setBackground(Color.green);
		search_all.setForeground(Color.WHITE);
		search_all.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		String[] colheading = { "학과코드", "학과명", "전공명", };
		String[][] rowdata = {};
		dtm = new DefaultTableModel(rowdata, colheading) { // 모델 생성
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER); // 셀 데이터 가운데 정렬
		
		table = new JTable(dtm); // 모델에 테이블 연결
		jsp = new JScrollPane(table);
		jsp.setBounds(0, 340, 580, 80);
		inBorder = new TitledBorder("테이블");
		jsp.setBorder(inBorder);
		jsp.setBounds(0, 350, 580, 300);
		
		table.setBackground(new Color(255, 255, 204));
		table.setSelectionBackground(Color.blue);
		table.setSelectionForeground(Color.WHITE);
		table.setRowHeight(25);
		table.getColumn("학과코드").setPreferredWidth(20); 
		table.getColumn("학과코드").setCellRenderer(celAlignCenter);
		table.getColumn("학과명").setPreferredWidth(20); 
		table.getColumn("학과명").setCellRenderer(celAlignCenter);
		table.getColumn("전공명").setPreferredWidth(20); 
		table.getColumn("전공명").setCellRenderer(celAlignCenter);

		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(0, 660, 580, 80);
		panel4.setBackground(Color.pink);
		

		input = new JButton("입력");
		input.setBounds(50, 20, 100, 50);
		input.setBackground(Color.gray);
		input.setForeground(Color.WHITE);
		input.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		revise = new JButton("수정");
		revise.setBounds(170, 20, 100, 50);
		revise.setBackground(Color.gray);
		revise.setForeground(Color.WHITE);
		revise.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		del = new JButton("삭제");
		del.setBounds(290, 20, 100, 50);
		del.setBackground(Color.gray);
		del.setForeground(Color.WHITE);
		del.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		end = new JButton("종료");
		end.setBounds(410, 20, 100, 50);
		end.setBackground(Color.gray);
		end.setForeground(Color.WHITE);
		end.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));

		panel4.add(input);
		panel4.add(revise);
		panel4.add(del);
		panel4.add(end);
		panel3.add(search);
		panel3.add(search_all);
		panel3.add(cb1);
		panel3.add(Tsearch);
		panel2.add(Tname);
		panel2.add(name);
		panel2.add(TMajorname);
		panel2.add(Majorname);
		panel2.add(Tcode);
		panel2.add(code);
		panel.add(depname);

		add(jsp);
		add(panel4);
		add(panel3);
		add(panel2);
		add(panel);
		cb1.addActionListener(this);
		search.addActionListener(this);
		search_all.addActionListener(this);
		input.addActionListener(this);
		revise.addActionListener(this);
		del.addActionListener(this);
		end.addActionListener(this);
		table.addMouseListener(new MyMouseListener());
		
		DBConnect();
		getListALL();

		setSize(600, 800);
		setVisible(true);
	}
	public void DBConnect() throws SQLException {
		connector = new DBConm();

	}

	public void getListALL() {
		try {
			dtm.setRowCount(0);
			String quary = "SELECT * FROM department";
			pstmt = connector.conn.prepareStatement(quary);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dep_code = rs.getString(1);
				String dep_name = rs.getString(2);
				String major_name = rs.getString(3);
			
				Object[] rowdata = { dep_code, dep_name, major_name};
				dtm.addRow(rowdata);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public int input() { // 입력
		int result = 0;
		
		String query = "SELECT * FROM department where dep_code = '" + Tcode.getText() + "'";
		try {
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("11213");
				JOptionPane.showMessageDialog(this, "이미 등록된 학과입니다!");
				return result;
			}
			
			query = "INSERT INTO department(dep_code, dep_name, major_name)" + "values(?,?,?)";
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tcode.getText());
			pstmt.setString(2, Tname.getText());
			pstmt.setString(3, TMajorname.getText());
			
			
			result = pstmt.executeUpdate();
			getListALL();
			
		} catch (SQLException e) {
			e.printStackTrace();

		}
		if (result != 0) {
			JOptionPane.showMessageDialog(this, Tname.getText() + "님이 추가 되었습니다.");
		} else {
			JOptionPane.showMessageDialog(getParent(), "추가 실패");

		}
		return result;

	}
	public int revise() {// 수정
		int result =0;
		try {
			String query = "UPDATE department SET dep_name=?,major_name=? where dep_code= ?";

			pstmt = connector.conn.prepareStatement(query);
			
			pstmt.setString(1, Tname.getText());
			pstmt.setString(2, TMajorname.getText());
			pstmt.setString(3, Tcode.getText());

			result = pstmt.executeUpdate();
			System.out.println(result);

			getListALL();

		} catch (SQLException e) {
			e.printStackTrace();

		}
		if (result != 0) {
			JOptionPane.showMessageDialog(this, Tcode.getText() + "님이 수정되었습니다..");
		} else {
			JOptionPane.showMessageDialog(getParent(), "수정 실패");
		}

		return result;

	}
	public void delete() throws SQLException { // 삭제
		int srow = table.getSelectedRow();
		dtm.setRowCount(0);
		String query = "DELETE FROM department where  dep_code=?";
		try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tsearch.getText());
			int result = pstmt.executeUpdate();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		getListALL();

	}
	public void search() throws SQLException {// 검색
		dtm.setRowCount(0); // 0으로 초기화시켜줌
		
		pstmt = connector.conn.prepareStatement(query);
		pstmt.setString(1, Tsearch.getText());
		
		rs = pstmt.executeQuery();

		while (rs.next()) {
			String dep_code = rs.getString(1);
			String dep_name = rs.getString(2);
			String major_name = rs.getString(3);
			

			Object[] rowData = { dep_code, dep_name, major_name };
			dtm.addRow(rowData);
			

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
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (ob == end) {// 종료
			System.exit(0);
		}

		
		if (ob == search) {// 조회
			try {
				search();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		if (ob == search_all) {// 전체조회
			getListALL();
		}
		
		String str = (String) cb1.getSelectedItem();
		Tcode.setText(str);
		
		if (ob == cb1) {

			String a = cb1.getSelectedItem().toString();
			if (a.equals("학과코드")) {
				query = "SELECT * FROM department where dep_code = ?";
			}
			if (a.equals("학과명")) {
				query = "SELECT * FROM department where dep_name = ?";
			}
			if (a.equals("전공명")) {
				query = "SELECT * FROM department where major_name = ?";
			}
		}
		
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int srow = table.getSelectedRow();

			// String code = ((String) table.getValueAt(selRow, 0));
			// Tcode.setText(code);
			// Tname.setText(table.getValueAt(selRow, 1).toString());
			// TMajorname.setText(table.getValueAt(selRow, 2).toString());

			Tcode.setText((String) table.getValueAt(srow, 0));
			Tname.setText((String) table.getValueAt(srow, 1));
			TMajorname.setText((String) table.getValueAt(srow, 2));
		}
	}

	

}
