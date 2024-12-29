import java.sql.*;

public class IssueDAO {

    public void issueBook(int bookId, String issuedTo) throws SQLException {
        String checkQuery = "SELECT quantity FROM books WHERE id = ?";
        String updateQuery = "UPDATE books SET quantity = quantity - 1 WHERE id = ?";
        String insertQuery = "INSERT INTO issued_books (book_id, issued_to, issue_date) VALUES (?, ?, NOW())";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
             PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
             PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {

            checkStmt.setInt(1, bookId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt("quantity") > 0) {
                updateStmt.setInt(1, bookId);
                updateStmt.executeUpdate();

                insertStmt.setInt(1, bookId);
                insertStmt.setString(2, issuedTo);
                insertStmt.executeUpdate();
                System.out.println("Book issued successfully!");
            } else {
                System.out.println("Book not available!");
            }
        }
    }

    public void returnBook(int issueId) throws SQLException {
        String deleteQuery = "DELETE FROM issued_books WHERE id = ?";
        String updateQuery = "UPDATE books SET quantity = quantity + 1 WHERE id = " +
                "(SELECT book_id FROM issued_books WHERE id = ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
             PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery)) {

            updateStmt.setInt(1, issueId);
            updateStmt.executeUpdate();

            deleteStmt.setInt(1, issueId);
            deleteStmt.executeUpdate();
            System.out.println("Book returned successfully!");
        }
    }
}

