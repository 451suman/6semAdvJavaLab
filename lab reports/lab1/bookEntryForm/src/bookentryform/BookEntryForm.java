package bookentryform;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

class BEF {

    JFrame frame;
    JLabel title, author, publication, price;
    JTextField title_txt, author_txt, publication_txt, price_txt;
    JButton update, insert, delete, view;

    JTable table;
    JScrollPane sp;
    DefaultTableModel tblModel;

    BEF() {
        frame = new JFrame();
        frame.setSize(405, 400);
        frame.setLayout(null);
        frame.setTitle("Book Management System");
        frame.setResizable(true);

        title = new JLabel("Title");
        title.setBounds(20, 20, 80, 20);
        frame.add(title);

        title_txt = new JTextField();
        title_txt.setBounds(105, 20, 265, 20);
        frame.add(title_txt);

        author = new JLabel("Author");
        author.setBounds(20, 40, 80, 20);
        frame.add(author);

        author_txt = new JTextField();
        author_txt.setBounds(105, 40, 265, 20);
        frame.add(author_txt);

        publication = new JLabel("Publication");
        publication.setBounds(20, 60, 80, 25);
        frame.add(publication);

        publication_txt = new JTextField();
        publication_txt.setBounds(105, 60, 265, 20);
        frame.add(publication_txt);

        price = new JLabel("Price");
        price.setBounds(20, 80, 80, 25);
        frame.add(price);

        price_txt = new JTextField();
        price_txt.setBounds(105, 80, 265, 20);
        frame.add(price_txt);

        insert = new JButton("Insert");
        insert.setBounds(20, 100, 80, 20);
        frame.add(insert);

        update = new JButton("Update");
        update.setBounds(110, 100, 80, 20);
        frame.add(update);

        delete = new JButton("Delete");
        delete.setBounds(200, 100, 80, 20);
        frame.add(delete);

        view = new JButton("View");
        view.setBounds(290, 100, 80, 20);
//        frame.add(view);

        /* Creating JTable to add row from database table */
        String[] columns = {"ID", "Title", "Author", "Publication", "Price"};

        tblModel = new DefaultTableModel(columns, 0);
        table = new JTable(tblModel);
        sp = new JScrollPane(table);
        frame.add(sp);
        sp.setBounds(20, 200, 350, 150);

        selectRecord();

        insert.addActionListener(e -> insertRecord());
        delete.addActionListener(e -> deleteRecord());
        update.addActionListener(e -> updateRecord());
        view.addActionListener(e -> selectRecord());

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void insertRecord() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/bookdb";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(URL, username, password);
            Statement stmt = conn.createStatement();

            String titleD = title_txt.getText();
            String authorD = author_txt.getText();
            String pubD = publication_txt.getText();
            int priceD = Integer.parseInt(price_txt.getText());
            String priceStr = Integer.toString(priceD);

            if (!titleD.isEmpty() && !authorD.isEmpty() && !pubD.isEmpty() && !priceStr.isEmpty()) {
                String insertQuery = "INSERT INTO book_info (title, author, publication, price) VALUES ('" + titleD + "', '" + authorD + "', '" + pubD + "', '" + priceStr + "')";
                stmt.execute(insertQuery);
                JOptionPane.showMessageDialog(frame, "Record inserted successfully.");
                selectRecord();
            } else {
                JOptionPane.showMessageDialog(frame, "Empty TextField");
                selectRecord();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage());
        }
    }

    public void deleteRecord() {
        String n = JOptionPane.showInputDialog("Enter ID number for delete:");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/bookdb";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(URL, username, password);
            //        title_txt, author_txt, publication_txt, price_txt;
            Statement stmt = conn.createStatement();

            String deleteQuery = "DELETE FROM book_info WHERE id = " + n;
            stmt.execute(deleteQuery);

            JOptionPane.showMessageDialog(frame, "Record Deleted Succesfully successfully....");

            selectRecord();
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }

    public void updateRecord() {
        JTextField idField = new JTextField();
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField pubField = new JTextField();
        JTextField priceField = new JTextField();

        Object[] fields = {
            "ID:", idField,
            "Title:", titleField,
            "Author:", authorField,
            "Publication:", pubField,
            "Price:", priceField
        };

        int option = JOptionPane.showConfirmDialog(frame, fields, "Update Record", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String id = idField.getText();
            String titleD = titleField.getText();
            String authorD = authorField.getText();
            String pubD = pubField.getText();
            int priceD = Integer.parseInt(priceField.getText());
            String priceStr = Integer.toString(priceD);

            try {
                Class.forName("com.mysql.jdbc.Driver");
                String URL = "jdbc:mysql://localhost:3306/bookdb";
                String username = "root";
                String password = "";
                Connection conn = DriverManager.getConnection(URL, username, password);
                Statement stmt = conn.createStatement();

                if (!id.isEmpty() && !titleD.isEmpty() && !authorD.isEmpty() && !pubD.isEmpty() && !priceStr.isEmpty()) {
                    String updateQuery = "UPDATE book_info SET title = '" + titleD + "', author = '" + authorD + "', publication = '" + pubD + "', price = '" + priceStr + "' WHERE id = " + id;
                    stmt.execute(updateQuery);
                    JOptionPane.showMessageDialog(frame, "Record updated successfully.");
                    selectRecord();
                } else {
                    JOptionPane.showMessageDialog(frame, "Empty TextField");
                    selectRecord();
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage());
            }
        }
    }

    private void selectRecord() {
        try {
            /*Step 2: Load and Register the MySQL Driver */
            Class.forName("com.mysql.jdbc.Driver");
            /*Step 3: Create and Establish the Connection with MySQL Server*/
            String URL = "jdbc:mysql://localhost:3306/bookdb";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(URL, username, password);

            /*Step 4: Create a Statement */
            Statement stmt = conn.createStatement();

            /*Step 5: Create and Execute SQL statment using above stmt */
            String selectQuery = "Select * from  book_info";
            ResultSet rs = stmt.executeQuery(selectQuery);
            /* Step 6: Check or Process the above query is executed or not */
            tblModel.setRowCount(0);
            while (rs.next()) {
                int id = rs.getInt(1);  //id can be replaced by 1
                String title = rs.getString(2);
                String author = rs.getString(3);
                String pub = rs.getString(4);
                int price = rs.getInt(5);

                Object[] tblData = {id, title, author, pub, price};
                tblModel.addRow(tblData);

            }
            /* Step 7: Close the connection */
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}

public class BookEntryForm {

    public static void main(String[] args) {
        new BEF();
    }

}
