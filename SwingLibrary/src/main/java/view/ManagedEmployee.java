package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import controller.Book_DAO;
import controller.Employee_DAO;
import controller.Genre_DAO;
import model.Book;
import model.Employee;
import model.Genre;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagedEmployee extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldMaNV;
	private JTextField textFieldTenNV;
	private JTextField textFieldTuoi;
	private JTextField textFieldDiaChi;
	private JTextField textFieldSoDT;
	private JTextField textFieldEmail;
	private JTextField textFieldTimKiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagedEmployee frame = new ManagedEmployee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManagedEmployee() {
		setTitle("Managed employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 957, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(-12, 0, 242, 570);
		contentPane.add(panel);

		JLabel lblNewLabel_1 = new JLabel(" SunFlower");
		lblNewLabel_1.setIcon(new ImageIcon(ManagedBook.class.getResource("/image/sunflower.png")));
		lblNewLabel_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setBounds(20, 10, 177, 68);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(51, 153, 0));
		panel_1.setBounds(20, 78, 209, 52);
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("Màn hình chính");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 5, 189, 37);
		panel_1.add(lblNewLabel);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(51, 153, 0));
		panel_1_1.setBounds(20, 149, 212, 52);
		panel.add(panel_1_1);

		JLabel lblQunLSch = new JLabel("Quản lý sách");
		lblQunLSch.setBackground(new Color(51, 153, 0));
		lblQunLSch.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLSch.setForeground(Color.WHITE);
		lblQunLSch.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLSch.setBounds(10, 10, 192, 37);
		panel_1_1.add(lblQunLSch);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(102, 102, 255));
		panel_1_1_1.setBounds(20, 226, 209, 52);
		panel.add(panel_1_1_1);

		JLabel lblQunLNhn = new JLabel("Quản lý nhân viên");
		lblQunLNhn.setBackground(new Color(102, 102, 255));
		lblQunLNhn.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLNhn.setForeground(Color.WHITE);
		lblQunLNhn.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLNhn.setBounds(10, 10, 189, 37);
		panel_1_1_1.add(lblQunLNhn);

		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(new Color(51, 153, 0));
		panel_1_1_2.setBounds(20, 299, 209, 52);
		panel.add(panel_1_1_2);

		JLabel lblQunLNhp = new JLabel("Quản lý nhập hàng");
		lblQunLNhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLNhp.setForeground(Color.WHITE);
		lblQunLNhp.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLNhp.setBounds(10, 10, 185, 37);
		panel_1_1_2.add(lblQunLNhp);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(51, 153, 0));
		panel_1_1_1_1.setBounds(20, 370, 209, 52);
		panel.add(panel_1_1_1_1);

		JLabel lblQunLXut = new JLabel("Quản lý xuất hàng");
		lblQunLXut.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLXut.setForeground(Color.WHITE);
		lblQunLXut.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblQunLXut.setBounds(10, 10, 177, 37);
		panel_1_1_1_1.add(lblQunLXut);

		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setLayout(null);
		panel_1_1_1_2.setBackground(new Color(51, 153, 0));
		panel_1_1_1_2.setBounds(20, 443, 209, 52);
		panel.add(panel_1_1_1_2);

		JLabel lblThngK = new JLabel("Thống kê");
		lblThngK.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngK.setForeground(Color.WHITE);
		lblThngK.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblThngK.setBounds(10, 10, 189, 37);
		panel_1_1_1_2.add(lblThngK);

		JButton btnNewButton = new JButton("Log out");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setBounds(86, 516, 85, 21);
		panel.add(btnNewButton);

		Employee_DAO e_DAO = new Employee_DAO();
		List<Employee> listEmployee = (List<Employee>) e_DAO.selectAll();
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.BOTTOM, null, new Color(0, 0, 255)));
		table.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setRowHeight(26);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã NV", "Tên NV", "Tuổi tác", "Địa chỉ", "Số điện thoại", "Email" }));
//		Employee e = new Employee(1, "Hương", 20, "Nam Định", "01234", "thuhuong@gmail.com");
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
//		tableModel.addRow(new Object[] {e.getId(), e.getName(), e.getAge(), e.getAddress(), e.getPhoneNumber(), e.getEmail()});
		for (Employee e : listEmployee) {
			tableModel.addRow(new Object[] { e.getId(), e.getName(), e.getAge(), e.getAddress(), e.getPhoneNumber(),
					e.getEmail() });
		}
		TableColumn column0 = table.getColumnModel().getColumn(0);
		column0.setPreferredWidth(30);
		TableColumn column1 = table.getColumnModel().getColumn(1);
		column1.setPreferredWidth(100);
		TableColumn column5 = table.getColumnModel().getColumn(5);
		column5.setPreferredWidth(180);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(240, 48, 693, 191);
		contentPane.add(scrollPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(240, 249, 703, 321);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Thông tin nhân viên:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 10, 243, 36);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("Mã NV");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(20, 52, 70, 36);
		panel_2.add(lblNewLabel_4);

		textFieldMaNV = new JTextField();
		textFieldMaNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldMaNV.setBounds(110, 56, 143, 36);
		panel_2.add(textFieldMaNV);
		textFieldMaNV.setColumns(10);

		JLabel lblNewLabel_4_1 = new JLabel("Tên NV");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(20, 122, 92, 36);
		panel_2.add(lblNewLabel_4_1);

		textFieldTenNV = new JTextField();
		textFieldTenNV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTenNV.setColumns(10);
		textFieldTenNV.setBounds(110, 126, 143, 36);
		panel_2.add(textFieldTenNV);

		JLabel lblNewLabel_4_2 = new JLabel("Tuổi tác");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(20, 188, 109, 36);
		panel_2.add(lblNewLabel_4_2);

		textFieldTuoi = new JTextField();
		textFieldTuoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTuoi.setColumns(10);
		textFieldTuoi.setBounds(110, 192, 143, 36);
		panel_2.add(textFieldTuoi);

		JLabel lblNewLabel_4_3 = new JLabel("Địa chỉ");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_3.setBounds(351, 52, 70, 36);
		panel_2.add(lblNewLabel_4_3);

		textFieldDiaChi = new JTextField();
		textFieldDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldDiaChi.setColumns(10);
		textFieldDiaChi.setBounds(473, 56, 143, 36);
		panel_2.add(textFieldDiaChi);

		JLabel lblNewLabel_4_4 = new JLabel("Số điện thoại");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4.setBounds(351, 122, 137, 36);
		panel_2.add(lblNewLabel_4_4);

		textFieldSoDT = new JTextField();
		textFieldSoDT.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldSoDT.setColumns(10);
		textFieldSoDT.setBounds(473, 126, 183, 36);
		panel_2.add(textFieldSoDT);

		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tạo NV mới
				Employee em = new Employee();
				try {
					//gán thuôc tính sách bằng thông tin nhập
					em.setId(Integer.parseInt(textFieldMaNV.getText()));
					em.setName(textFieldTenNV.getText());
					em.setAge(Integer.parseInt(textFieldTuoi.getText()));
					em.setAddress(textFieldDiaChi.getText());
					em.setPhoneNumber(textFieldSoDT.getText());
					em.setEmail(textFieldEmail.getText());
					
					//Add trong CSDL
					e_DAO.insert(em);
					
					//Add trong table()
					tableModel.addRow(new Object[] { em.getId(), em.getName(), em.getAge(), em.getAddress(),
							em.getPhoneNumber(), em.getEmail() });
					JOptionPane.showMessageDialog(rootPane, "Thêm nhân viên thành công!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Nhập định dạng sai!");
				} finally {
					//Xóa trắng textfield (reset tf)
					textFieldMaNV.setText("");
					textFieldTenNV.setText("");
					textFieldTuoi.setText("");
					textFieldDiaChi.setText("");
					textFieldSoDT.setText("");
					textFieldEmail.setText("");
				}
				
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(85, 260, 92, 36);
		panel_2.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("Sửa");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tạo NV mới
				Employee em = new Employee();
				try {
					//gán thuôc tính sách bằng thông tin nhập
					em.setId(Integer.parseInt(textFieldMaNV.getText()));
					em.setName(textFieldTenNV.getText());
					em.setAge(Integer.parseInt(textFieldTuoi.getText()));
					em.setAddress(textFieldDiaChi.getText());
					em.setPhoneNumber(textFieldSoDT.getText());
					em.setEmail(textFieldEmail.getText());
					
					// CSDL
					e_DAO.update(em);
					
					//Sửa Table
					for (int i = 0; i < tableModel.getRowCount(); i++) {
						if (tableModel.getValueAt(i, 0).equals(em.getId())) {//Sử dung id để câp nhât
							tableModel.setValueAt(textFieldMaNV.getText(), i, 0);
							tableModel.setValueAt(textFieldTenNV.getText(), i, 1);
							tableModel.setValueAt(textFieldTuoi.getText(), i, 2);
							tableModel.setValueAt(textFieldDiaChi.getText(), i, 3);
							tableModel.setValueAt(textFieldSoDT.getText(), i, 4);
							tableModel.setValueAt(textFieldEmail.getText(), i, 5);
							break;
						}
					}
					JOptionPane.showMessageDialog(rootPane, "Sửa nhân viên thành công!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Nhập định dạng sai!");
				} finally {
					//Xóa trắng textfield (reset tf)
					textFieldMaNV.setText("");
					textFieldTenNV.setText("");
					textFieldTuoi.setText("");
					textFieldDiaChi.setText("");
					textFieldSoDT.setText("");
					textFieldEmail.setText("");
				}
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(295, 260, 92, 36);
		panel_2.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("Xóa");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tạo NV mới
				Employee em = new Employee();
				try {
					//gán thuôc tính sách bằng thông tin nhập
					em.setId(Integer.parseInt(textFieldMaNV.getText()));
					//CSDL
					this.removeEmployee(em);
					//Table
					// Duyệt qua các dòng để tìm ID
					boolean rowFound = false;
					for (int i = 0; i < tableModel.getRowCount(); i++) {
						if (tableModel.getValueAt(i, 0).equals(em.getId())) {
							tableModel.removeRow(i);
							rowFound = true;
							break;
						}
					} 
					JOptionPane.showMessageDialog(rootPane, "Xóa nhân viên thành công!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Nhập sai định dạng!");
				} finally {
					textFieldMaNV.setText("");
				} 
				
			}
			private void removeEmployee(Employee em) {
				e_DAO.delete(em.getId());
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(494, 260, 92, 36);
		panel_2.add(btnNewButton_1_2);

		JButton btnNewButton_1_2_1 = new JButton("Tìm kiếm");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Table
				String searchText = textFieldTimKiem.getText();
				List<Object[]> resultData = new ArrayList<>();
				String[] columnNames = { "Mã NV", "Tên NV", "Tuổi tác", "Địa chỉ", "Số điện thoại",
						"Email" };
				// Tìm kiếm sản phẩm theo tên
				List<Employee> list = (List<Employee>) e_DAO.selectByName(searchText);
				if (list.size() > 0) {
					for (Employee e1 : list) {
						resultData.add(new Object[] { e1.getId(), e1.getName(), e1.getAge(), e1.getAddress(),
								e1.getPhoneNumber(), e1.getEmail() });
					}
					DefaultTableModel newModel = new DefaultTableModel(resultData.toArray(new Object[0][0]),
							columnNames);
					table.setModel(newModel);
					JOptionPane.showMessageDialog(rootPane, "Tìm thấy kết quả!");
				} else
					JOptionPane.showMessageDialog(rootPane, "Không tìm thấy kết quả!");
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_1.setBounds(377, 0, 118, 36);
		panel_2.add(btnNewButton_1_2_1);

		JLabel lblNewLabel_4_4_1 = new JLabel("Email");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4_1.setBounds(351, 188, 137, 36);
		panel_2.add(lblNewLabel_4_4_1);

		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(473, 192, 183, 36);
		panel_2.add(textFieldEmail);
		
		textFieldTimKiem = new JTextField();
		textFieldTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTimKiem.setColumns(10);
		textFieldTimKiem.setBounds(505, 0, 168, 36);
		panel_2.add(textFieldTimKiem);

		JLabel lblNewLabel_3 = new JLabel("Danh sách nhân viên");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(240, 10, 208, 28);
		contentPane.add(lblNewLabel_3);

	}

	public void addBook(Book b) {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		tableModel.addRow(new Object[] { "c1", "c2", "c3", "c4", "c5" });
	}
}
