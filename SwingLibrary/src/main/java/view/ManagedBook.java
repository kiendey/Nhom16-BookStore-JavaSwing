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
import java.awt.Component;
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

public class ManagedBook extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldMaSach;
	private JTextField textFieldTenSach;
	private JTextField textFieldNXB;
	private JTextField textFieldTacGia;
	private JTextField textFieldNgayXB;
	private JComboBox<String> comboBoxTheLoai;
	private JTextField textFieldTimKiem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagedBook frame = new ManagedBook();
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
	public ManagedBook() {
		setTitle("Managed book");
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
		panel_1_1.setBackground(new Color(102, 102, 255));
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
		panel_1_1_1.setBackground(new Color(51, 153, 0));
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

		Book_DAO b_DAO = new Book_DAO();
		List<Book> listB = (List<Book>) b_DAO.selectAll();
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "",
				TitledBorder.LEADING, TitledBorder.BOTTOM, null, new Color(0, 0, 255)));
		table.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setRowHeight(26);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Nhà xuất bản", "Ngày xuất bản" }));
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		for (Book b : listB) {
			tableModel.addRow(new Object[] { b.getId(), b.getName(), b.getGenre(), b.getAuthor(), b.getPublisher(),
					b.getPublicationDate() });
		}
		// Book b = new Book(1, "Conan", "Trinh thám", "kim Đồng", "Aoyama Gosho",
		// "14-12-2004");
		// tableModel.addRow(new Object[] {b.getId(), b.getName(), b.getGenre(),
		// b.getAuthor(), b.getPublisher(),b.getPublicationDate()});
		// Chỉnh độ rộng cột
		TableColumn column0 = table.getColumnModel().getColumn(0);
		column0.setPreferredWidth(40);
		TableColumn column1 = table.getColumnModel().getColumn(1);
		column1.setPreferredWidth(100);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(240, 48, 693, 191);
		contentPane.add(scrollPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(240, 249, 703, 321);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Thông tin sách:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 10, 243, 36);
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel("Mã sách");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(20, 52, 70, 36);
		panel_2.add(lblNewLabel_4);

		textFieldMaSach = new JTextField();
		textFieldMaSach.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldMaSach.setBounds(110, 56, 143, 36);
		panel_2.add(textFieldMaSach);
		textFieldMaSach.setColumns(10);

		JLabel lblNewLabel_4_1 = new JLabel("Tên sách");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_1.setBounds(20, 122, 92, 36);
		panel_2.add(lblNewLabel_4_1);

		textFieldTenSach = new JTextField();
		textFieldTenSach.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTenSach.setColumns(10);
		textFieldTenSach.setBounds(110, 126, 143, 36);
		panel_2.add(textFieldTenSach);

		JLabel lblNewLabel_4_2 = new JLabel("Thể loại");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_2.setBounds(20, 188, 109, 36);
		panel_2.add(lblNewLabel_4_2);

		textFieldNXB = new JTextField();
		textFieldNXB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNXB.setColumns(10);
		textFieldNXB.setBounds(473, 126, 143, 36);
		panel_2.add(textFieldNXB);

		JLabel lblNewLabel_4_3 = new JLabel("Tác giả");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_3.setBounds(338, 52, 70, 36);
		panel_2.add(lblNewLabel_4_3);

		textFieldTacGia = new JTextField();
		textFieldTacGia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTacGia.setColumns(10);
		textFieldTacGia.setBounds(473, 56, 143, 36);
		panel_2.add(textFieldTacGia);

		JLabel lblNewLabel_4_4 = new JLabel("Ngày xuất bản");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_4.setBounds(338, 188, 137, 36);
		panel_2.add(lblNewLabel_4_4);

		textFieldNgayXB = new JTextField();
		textFieldNgayXB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldNgayXB.setColumns(10);
		textFieldNgayXB.setBounds(473, 192, 149, 36);
		panel_2.add(textFieldNgayXB);
//Thêm
		JButton btnNewButton_1 = new JButton("Thêm");
		//Mở event
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tạo sách mới
				Book b = new Book();
				try {
					//gán thuôcj tính sách bằng thông tin nhập
					b.setIdBook((Integer.parseInt(textFieldMaSach.getText())));
					b.setName(textFieldTenSach.getText());
					b.setGenre((String) comboBoxTheLoai.getSelectedItem());
					b.setAuthor(textFieldTacGia.getText());
					b.setPublisher(textFieldNXB.getText());
					b.setPublicationDate(textFieldNgayXB.getText());
					
					//Add trong CSDL
					this.addBook(b);
					JOptionPane.showMessageDialog(rootPane, "Thêm sách thành công!");
					
					//Add trong table()
					tableModel.addRow(new Object[] { b.getId(), b.getName(), b.getGenre(), b.getAuthor(),
							b.getPublisher(), b.getPublicationDate() });
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Nhập định dạng sai!");
				} finally {
					//Xóa trắng textfield (reset tf)
					textFieldMaSach.setText("");
					textFieldTenSach.setText("");
					comboBoxTheLoai.setSelectedIndex(0);
					textFieldTacGia.setText("");
					textFieldNXB.setText("");
					textFieldNgayXB.setText("");
				}
			}

			private void addBook(Book b) {
				Book_DAO b_dao = new Book_DAO();
				b_dao.insert(b);
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(57, 260, 92, 36);
		panel_2.add(btnNewButton_1);

		//Sửa
		JButton btnNewButton_1_1 = new JButton("Sửa");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book b = new Book();
				try {
					b.setIdBook((Integer.parseInt(textFieldMaSach.getText())));
					b.setName(textFieldTenSach.getText());
					b.setGenre((String) comboBoxTheLoai.getSelectedItem());
					b.setAuthor(textFieldTacGia.getText());
					b.setPublisher(textFieldNXB.getText());
					b.setPublicationDate(textFieldNgayXB.getText());
					// CSDL
					this.updateBook(b);
					
					//Sửa Table
					for (int i = 0; i < tableModel.getRowCount(); i++) {
						if (tableModel.getValueAt(i, 0).equals(b.getId())) {//Sử dung id để câp nhât
							tableModel.setValueAt(textFieldMaSach.getText(), i, 0);
							tableModel.setValueAt(textFieldTenSach.getText(), i, 1);
							tableModel.setValueAt(comboBoxTheLoai.getSelectedItem(), i, 2);
							tableModel.setValueAt(textFieldTacGia.getText(), i, 3);
							tableModel.setValueAt(textFieldNXB.getText(), i, 4);
							tableModel.setValueAt(textFieldNgayXB.getText(), i, 5);
							break;
						}
					}
					JOptionPane.showMessageDialog(rootPane, "Sửa sách thành công!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Nhập định dạng sai!");
				} finally {
					//Reset về empty
					textFieldMaSach.setText("");
					textFieldTenSach.setText("");
					comboBoxTheLoai.setSelectedIndex(0);
					textFieldTacGia.setText("");
					textFieldNXB.setText("");
					textFieldNgayXB.setText("");
				}
			}

			private void updateBook(Book b) {
				b_DAO.update(b);

			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1.setBounds(296, 260, 92, 36);
		panel_2.add(btnNewButton_1_1);
//Xóa
		JButton btnNewButton_1_2 = new JButton("Xóa");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book b = new Book();
				try {
					b.setIdBook(Integer.parseInt(textFieldMaSach.getText()));
					b.setName(textFieldTenSach.getText());
					b.setGenre((String) comboBoxTheLoai.getSelectedItem());
					b.setAuthor(textFieldTacGia.getText());
					b.setPublisher(textFieldNXB.getText());
					b.setPublicationDate(textFieldNgayXB.getText());
					// CSDL
					this.removeBook(b);
					// Table
					for (int i = 0; i < tableModel.getRowCount(); i++) {
						if (tableModel.getValueAt(i, 0).equals(b.getId())) {//Xóa theo ID
							tableModel.removeRow(i);
							break;
						}
					}
					JOptionPane.showMessageDialog(rootPane, "Xóa sách thành công!");
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(rootPane, "Nhập định dạng sai!");
				} finally {
					textFieldMaSach.setText("");
				}
			}

			private void removeBook(Book b) {
				b_DAO.delete(b.getId());
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(552, 260, 92, 36);
		panel_2.add(btnNewButton_1_2);

		JLabel lblNewLabel_5 = new JLabel("Nhà xuất bản");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(335, 122, 117, 36);
		panel_2.add(lblNewLabel_5);

		Genre_DAO g_DAO = new Genre_DAO();
		List<Genre> listG = g_DAO.selectAll();
		comboBoxTheLoai = new JComboBox<String>();
		comboBoxTheLoai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		for (Genre genre : listG) {
			comboBoxTheLoai.addItem(genre.getName());
		}

		comboBoxTheLoai.setBounds(110, 188, 143, 40);

		panel_2.add(comboBoxTheLoai);
		// tìm kiếm
		JButton btnNewButton_1_1_1 = new JButton("Tìm kiếm");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Book b = new Book();
				b.setIdBook(Integer.parseInt(textFieldMaSach.getText()));
				b.setName(textFieldTimKiem.getText());
				b.setGenre((String) comboBoxTheLoai.getSelectedItem());
				b.setAuthor(textFieldTacGia.getText());
				b.setPublisher(textFieldNXB.getText());
				b.setPublicationDate(textFieldNgayXB.getText());
				// CSDL
				// this.findBook(b);
				// Table
				String searchText = b.getName();
				List<Object[]> resultData = new ArrayList<>();
				String[] columnNames = { "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Nhà xuất bản",
						"Ngày xuất bản" };
				// Tìm kiếm sản phẩm theo tên và cập nhật mô hình dữ liệu
				for (Book b1 : listB) {

					if (b1.getName().toLowerCase().contains(searchText.toLowerCase())) {
						resultData.add(new Object[] { b.getId(), b.getName(), b.getGenre(), b.getAuthor(),
								b.getPublisher(), b.getPublicationDate() });
					}
				} // Cập nhật mô hình dữ liệu với kết quả tìm kiếm
				DefaultTableModel newModel = new DefaultTableModel(resultData.toArray(new Object[0][0]), columnNames);
				table.setModel(newModel);
				JOptionPane.showMessageDialog(rootPane, "Tìm thấy kết quả!");
			}

			private void findBook(Book b) {
				b_DAO.selectByName(b.getName());

			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_1.setBounds(388, 0, 117, 34);
		panel_2.add(btnNewButton_1_1_1);

		textFieldTimKiem = new JTextField();
		textFieldTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textFieldTimKiem.setColumns(10);
		textFieldTimKiem.setBounds(515, 0, 178, 36);
		panel_2.add(textFieldTimKiem);

		JLabel lblNewLabel_3 = new JLabel("Danh sách cuốn sách:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(240, 10, 208, 28);
		contentPane.add(lblNewLabel_3);

	}

	public void addBook(Book b) {
		DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
		b.setIdBook((Integer.parseInt(textFieldMaSach.getText())));
		b.setName(textFieldTenSach.getText());
		b.setGenre((String) comboBoxTheLoai.getSelectedItem());
		b.setPublisher(textFieldNXB.getText());
		b.setPublicationDate(textFieldNgayXB.getText());
		Book_DAO b_dao = new Book_DAO();
		b_dao.insert(b);
	}
}
