package vn.kiendey.SwingLibrary;

import view.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Tạo màn hình đầu tiên FirstFrame
        Login login = new Login();
        login.setVisible(true);
        Menu menu = new Menu();
        ManagedBook managedBook = new ManagedBook();
        ManagedEmployee managedEmployee = new ManagedEmployee();
        ManagedIn importInvoice = new ManagedIn();
        ManagedOut exportInvoice = new ManagedOut();
        ManagedStatitic statitic = new ManagedStatitic();

    // Thêm sự kiện cho trang LOGIN
        login.dangNhap().addActionListener(e -> {
            login.dispose();// Đóng màn hình đầu tiên
            menu.setVisible(true);
            JOptionPane.showMessageDialog(menu, "Đăng nhập thành công");
        });

    // Thêm sự kiện cho trang MENU
        menu.manHinhChinh().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.dispose();
                menu.setVisible(true);
            }
        });
        menu.quanLySach().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.dispose(); // Đóng màn hình đầu tiên
                managedBook.setVisible(true); // Mở màn hình thứ hai }
            }
        });
        menu.quanLyNhanVien().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.dispose();
                managedEmployee.setVisible(true);
            }
        });
        menu.quanLyNhapHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.dispose();
                importInvoice.setVisible(true);
            }
        });
        menu.quanLyXuatHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.dispose();
                exportInvoice.setVisible(true);
            }
        });
        menu.thongKe().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.dispose();
                statitic.setVisible(true);
            }
        });
        menu.logOut().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.dispose();
                login.setVisible(true);
            }
        });

    //Thêm sự kiện cho trang QUẢN LÝ SÁCH
        managedBook.manHinhChinh().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedBook.dispose();
                menu.setVisible(true);
            }
        });
        managedBook.quanLySach().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedBook.dispose();
                managedBook.setVisible(true);
            }
        });
        managedBook.quanLyNhanVien().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedBook.dispose();
                managedEmployee.setVisible(true);
            }
        });
        managedBook.quanLyNhapHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedBook.dispose();
                importInvoice.setVisible(true);
            }
        });
        managedBook.quanLyXuatHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedBook.dispose();
                exportInvoice.setVisible(true);
            }
        });
        managedBook.thongKe().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedBook.dispose();
                statitic.setVisible(true);
            }
        });
        managedBook.logOut().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedBook.dispose();
                login.setVisible(true);
            }
        });

    //Thêm sự kiện cho trang QUẢN LÝ NHÂN VIÊN
        managedEmployee.manHinhChinh().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedEmployee.dispose();
                menu.setVisible(true);
            }
        });
        managedEmployee.quanLySach().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedEmployee.dispose();
                managedBook.setVisible(true);
            }
        });
        managedEmployee.quanLyNhanVien().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedEmployee.dispose();
                managedEmployee.setVisible(true);
            }
        });
        managedEmployee.quanLyNhapHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedEmployee.dispose();
                importInvoice.setVisible(true);
            }
        });
        managedEmployee.quanLyXuatHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedEmployee.dispose();
                exportInvoice.setVisible(true);
            }
        });
        managedEmployee.thongKe().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedEmployee.dispose();
                statitic.setVisible(true);
            }
        });
        managedEmployee.logOut().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managedEmployee.dispose();
                login.setVisible(true);
            }
        });

    //Thêm sự kiện cho trang QUẢN LÝ NHẬP HÀNG
        importInvoice.manHinhChinh().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importInvoice.dispose();
                menu.setVisible(true);
            }
        });
        importInvoice.quanLySach().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importInvoice.dispose();
                managedBook.setVisible(true);
            }
        });
        importInvoice.quanLyNhanVien().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importInvoice.dispose();
                managedEmployee.setVisible(true);
            }
        });
        importInvoice.quanLyNhapHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importInvoice.dispose();
                importInvoice.setVisible(true);
            }
        });
        importInvoice.quanLyXuatHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importInvoice.dispose();
                exportInvoice.setVisible(true);
            }
        });
        importInvoice.thongKe().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importInvoice.dispose();
                statitic.setVisible(true);
            }
        });
        importInvoice.logOut().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importInvoice.dispose();
                login.setVisible(true);
            }
        });

    //Them su kien cho trang QUẢN LÝ XUẤT HÀNG
        exportInvoice.manHinhChinh().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportInvoice.dispose();
                menu.setVisible(true);
            }
        });
        exportInvoice.quanLySach().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportInvoice.dispose();
                managedBook.setVisible(true);
            }
        });
        exportInvoice.quanLyNhanVien().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportInvoice.dispose();
                managedEmployee.setVisible(true);
            }
        });
        exportInvoice.quanLyNhapHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportInvoice.dispose();
                importInvoice.setVisible(true);
            }
        });
        exportInvoice.quanLyXuatHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportInvoice.dispose();
                exportInvoice.setVisible(true);
            }
        });
        exportInvoice.thongKe().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportInvoice.dispose();
                statitic.setVisible(true);
            }
        });
        exportInvoice.logOut().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportInvoice.dispose();
                login.setVisible(true);
            }
        });

    //Them su kien cho trang THỐNG KE
        statitic.manHinhChinh().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statitic.dispose();
                menu.setVisible(true);
            }
        });
        statitic.quanLySach().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statitic.dispose();
                managedBook.setVisible(true);
            }
        });
        statitic.quanLyNhanVien().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statitic.dispose();
                managedEmployee.setVisible(true);
            }
        });
        statitic.quanLyNhapHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statitic.dispose();
                importInvoice.setVisible(true);
            }
        });
        statitic.quanLyXuatHang().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statitic.dispose();
                exportInvoice.setVisible(true);
            }
        });
        statitic.thongKe().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statitic.dispose();
                statitic.setVisible(true);
            }
        });
        statitic.logOut().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statitic.dispose();
                login.setVisible(true);
            }
        });
    }
}
