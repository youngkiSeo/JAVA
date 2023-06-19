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

import javax.swing.AbstractButton;
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


public class professor extends JFrame implements ActionListener {
	JPanel panel, panel2, panel3, panel4;

	JLabel proname, code, name, Rnumber, adr, phone, phone2, year, degree, lab_room;
	JLabel y, y2, y3, dep, gender;
	JTextField Tcode, Tname, TRnumber, TRnumber2, Tadr, Tphone, Tphone2, Tphone3, Tphone4, Tyear, Tdegree, Tlab_room,
			Tsearch, Tdep;
	JComboBox cb1, cb2;
	JButton input, revise, del, end, search, search_all;
	JRadioButton man, wo;
	TitledBorder tBorder, inBorder;

	DefaultTableModel dtm;
	JTable table;
	JScrollPane jsp;
	DBConm connector;
	PreparedStatement pstmt;
	ResultSet rs;
	SimpleAttributeSet set;
	String g, f;
	ResultSet rs1;

	String dept_name = "";
	String dept_code = "";
	String deptcategory = "";
	String[] scombo = { "교수코드", "교수명", "학과명", "성별" };
	String[] scombofield = { "code", "name", "dept_code", "gender" };
	menu np;

	professor(menu np) throws SQLException {
		this.np= np;
		this.setTitle("교수 관리");
		setLayout(null);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 780, 60);

		proname = new JLabel("교수관리");
		proname.setBounds(350, 25, 780, 20);
		proname.setFont(new Font("한컴 바겐세일 B", Font.BOLD, 20));
		proname.setForeground(Color.WHITE);
		panel.setBackground(Color.black);

		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(0, 65, 780, 170);
		tBorder = new TitledBorder("입력");
		panel2.setBorder(tBorder);

		code = new JLabel("교수코드");
		code.setBounds(30, 20, 60, 25);

		Tcode = new JTextField();
		Tcode.setBounds(90, 20, 120, 25);

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

		adr = new JLabel("주소");
		adr.setBounds(30, 50, 50, 25);

		Tadr = new JTextField();
		Tadr.setBounds(90, 50, 640, 25);

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

		year = new JLabel("임용년도");
		year.setBounds(30, 110, 50, 25);

		Tyear = new JTextField();
		Tyear.setBounds(90, 110, 100, 25);

		degree = new JLabel("학위");
		degree.setBounds(250, 110, 50, 25);

		Tdegree = new JTextField();
		Tdegree.setBounds(310, 110, 100, 25);

		dep = new JLabel("학과");
		dep.setBounds(420, 110, 50, 25);

		String[] list = { "개설학과", "컴퓨터공학", "방사선", "물리치료", "사무자동화", "간호1", };
		cb2 = new JComboBox(list);
		cb2.setBounds(500, 110, 170, 25);

		lab_room = new JLabel("연구실");
		lab_room.setBounds(30, 140, 50, 25);

		Tlab_room = new JTextField();
		Tlab_room.setBounds(80, 140, 100, 25);

		gender = new JLabel("성별");
		gender.setBounds(250, 140, 50, 25);

		man = new JRadioButton("남자");
		man.setBounds(300, 140, 60, 25);
		wo = new JRadioButton("여자");
		wo.setBounds(360, 140, 60, 25);
		ButtonGroup b = new ButtonGroup();
		b.add(man);
		b.add(wo);
		// cb2.addActionListener(this);

		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(0, 250, 780, 80);
		panel3.setBackground(Color.pink);

		String[] abc = { "교수코드", "교수명", "학과명", "성별", "검색할 카테고리를 선택하세요", };
		cb1 = new JComboBox(abc);
		cb1.setBounds(10, 20, 180, 30);

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

		String[] colheading = { "교수코드", "이름", "주소", "주민번호", "휴대폰", "전화", "임용년도", "학위", "학과", "연구실", "성별" };
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
		panel3.add(cb1);
		panel3.add(Tsearch);
		panel2.add(man);
		panel2.add(wo);
		panel2.add(gender);
		panel2.add(Tlab_room);
		panel2.add(lab_room);
		panel2.add(dep);
		panel2.add(cb2);
		panel2.add(degree);
		panel2.add(Tdegree);
		panel2.add(Tyear);
		panel2.add(year);
		panel2.add(Tphone4);
		panel2.add(phone2);
		panel2.add(Tphone);
		panel2.add(Tphone3);
		panel2.add(Tphone2);
		panel2.add(phone);
		panel2.add(Tadr);
		panel2.add(adr);
		panel2.add(y3);
		panel2.add(y2);
		panel2.add(y);
		panel2.add(TRnumber2);
		panel2.add(TRnumber);
		panel2.add(Rnumber);
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

		search.addActionListener(this);
		search_all.addActionListener(this);
		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb2.addItemListener(null);
		cb2.addItemListener(null);
		input.addActionListener(this);
		revise.addActionListener(this);
		del.addActionListener(this);
		end.addActionListener(this);
		table.addMouseListener(new MyMouseListener());

		DBConnect();
		dep();
		getListALL();

		man.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g = e.getActionCommand();
				System.out.println(g);
			}
		});
		wo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g = e.getActionCommand();
			}
		});
		cb1.addItemListener(new ItemListener() {
			private String category;

			public void itemStateChanged(ItemEvent ie) {
				category = (String) cb1.getSelectedItem();
				Tsearch.requestFocus();
			}
		});

		cb2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				deptcategory = (String) cb2.getSelectedItem();
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

		setSize(800, 800);
		setVisible(true);

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
			String query = "SELECT * FROM professor ";
			pstmt = connector.conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				String juminno = rs.getString(4);

				String mphone = rs.getString(5);
				// mphone= mphone.substring(0,3)+ "-" + mphone.substring(3,7) +
				// "-"+mphone.substring(7,11);
				String phone = rs.getString(6);
				// phone = "(" + phone.substring(0, 3)+
				// ")"+phone.substring(3,6)+"-"+phone.substring(6,10);

				String ent_year = rs.getString(7);
				String degree = rs.getString(8);
				String dept_code = rs.getString(9);
				// department(학과) 테이블에서 학과코드(code)이용 학과 가져오기
				query = "SELECT * FROM department where dep_code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, dept_code);
				rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {
					dept_name = rs1.getString(2);
				}
				String lab_room = rs.getString(10);
				String gender = rs.getString(11);
				
				Object[] rowdata = { code, name, addr, juminno, mphone, phone, ent_year, degree, dept_name, lab_room,
						gender };
				dtm.addRow(rowdata);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int input(String profcode) throws HeadlessException, SQLException { // 입력
		int result = 0;
		String query = "SELECT * FROM professor where dep_code ='" +profcode + "'";
				while(rs.next()) {
					JOptionPane.showMessageDialog(this, "이미 등록된 교수입니다", "코드확인!!!",JOptionPane.WARNING_MESSAGE);
					Tsearch.requestFocus();
					return result;
				}

		try {
			String query2 = "INSERT INTO professor(code,name, addr,juminno,mphone,phone,ent_year,degree,dept_code,lab_room,gender)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = connector.conn.prepareStatement(query2);
			pstmt.setString(1, Tcode.getText());
			pstmt.setString(2, Tname.getText());
			pstmt.setString(3, Tadr.getText());
			pstmt.setString(4, TRnumber.getText() + "-" + TRnumber2.getText());
			pstmt.setString(5, Tphone.getText() + "-" + Tphone2.getText() + "-" + Tphone3.getText());
			pstmt.setString(6, Tphone4.getText());
			pstmt.setString(7, Tyear.getText());
			pstmt.setString(8, Tdegree.getText());
			pstmt.setString(9, dept_code);
			pstmt.setString(10, Tlab_room.getText());
			pstmt.setString(11, g);
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
	
	public int revise(String profcode) {// 수정
		int result =0;
		
			String query = "UPDATE professor SET name=?,addr=?,juminno=?,mphone=?,phone=?, ent_year=?, degree=?, dept_code=?, lab_room=?, gender=? where code= ?";
			System.out.println(g);
			try {
			pstmt = connector.conn.prepareStatement(query);
			pstmt.setString(1, Tname.getText());
			pstmt.setString(2, Tadr.getText());
			pstmt.setString(3, TRnumber.getText()+"-"+TRnumber2.getText());
			pstmt.setString(4, Tphone.getText()+"-"+Tphone2.getText()+"-"+Tphone3.getText());
			pstmt.setString(5, Tphone4.getText());
			pstmt.setString(6, Tyear.getText());
			pstmt.setString(7, Tdegree.getText());
			pstmt.setString(8, dept_code);
			pstmt.setString(9, Tlab_room.getText());
			pstmt.setString(10, g);
			pstmt.setString(11, Tcode.getText());
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
		
		s= scombofield[cb1.getSelectedIndex()];
		dtm.setRowCount(0); // 0으로 초기화시켜줌
		
		String dept_code = null; dept_name=null;
		try {
			if(Tsearch.getText().length()==0) {
				JOptionPane.showMessageDialog(this, "조회할 내용을 입력하세요?", "조회!!!",JOptionPane.CANCEL_OPTION);
					Tsearch.requestFocus();
				return;
			}
			
			
			if(s.equals("dept_code")) {
				String query = "SELECT * FROM department where dep_name = ? or dep_code= ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, Tsearch.getText());
				pstmt.setString(2, Tsearch.getText());
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					dept_code = rs.getString(1);
					}
				query = "SELECT * FROM professor where " + s + " = '" + dept_code + "'";
				pstmt = connector.conn.prepareStatement(query);
	
				
				
				}else {
					String query = "SELECT * FROM professor where " + s + " = '" + Tsearch.getText() + "'";
					pstmt = connector.conn.prepareStatement(query);
					}
					rs = pstmt.executeQuery();
				
					

				while (rs.next()) {
				String code = rs.getString(1);
				String  name= rs.getString(2);
				String addr = rs.getString(3);
				String juminno = rs.getString(4);
				String mphone = rs.getString(5);
				String phone = rs.getString(6);
				String ent_year = rs.getString(7);
				String degree = rs.getString(8);
				
				//String dept_name = rs.getString(9);
				String dept_code1 = rs.getString(9);
				//department(학과) 테이블에서 학과코드(code)이용 학과 가져오기
				String query = "SELECT * FROM department where dep_code = ?";
				pstmt = connector.conn.prepareStatement(query);
				pstmt.setString(1, dept_code1);
				rs1 = pstmt.executeQuery();
				
				while(rs1.next()) {
					dept_name = rs1.getString(2);
				}
				
				String lab_room = rs.getString(10);
				String gender = rs.getString(11);
				Object[] rowData = { code, name, addr, juminno, mphone, phone, ent_year, degree, dept_name, lab_room,
						gender };
				dtm.addRow(rowData);
				
				}
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
		
	public void delete() throws SQLException { // 삭제
		int srow = table.getSelectedRow();
		dtm.setRowCount(0);
		String query = "DELETE FROM professor where code=?";
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
				input(Tcode.getText());
			} catch (HeadlessException | SQLException e1) {
				// TODO Auto-generated catch block
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
			
				search(Tcode.getText());
		}
		
		if (ob == search_all) {// 전체조회
			getListALL();
		}
		
		
	
	}
	
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			int srow = table.getSelectedRow();
			
			String code = (String)table.getValueAt(srow, 0);
			Tcode.setText(code);
			
			Tname.setText(table.getValueAt(srow,1).toString());
			String txtnumber = (String) table.getValueAt(srow, 3);
			Tadr.setText(table.getValueAt(srow,2).toString());
			String txtphone = (String) table.getValueAt(srow, 4);
			Tphone4.setText(table.getValueAt(srow,5).toString());
			Tyear.setText(table.getValueAt(srow,6).toString());
			
			Tdegree.setText(table.getValueAt(srow,7).toString());
			
			
			//department.(table.getValueAt(srow, 8).toString());
			String dept_code = (String) table.getValueAt(srow, 8);
			cb2.setSelectedItem(dept_code);
			Tlab_room.setText(table.getValueAt(srow,9).toString());
			
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
