# Library Management System

A comprehensive system designed to manage library resources efficiently, facilitating easy tracking of books, members, and transactions.

## Features

- **Book Management**: Add, update, delete, and search for books in the library's catalog.
- **Member Management**: Register new members, update member information, and manage member accounts.
- **Transaction Management**: Handle book checkouts, returns, and track overdue items.
- **Reporting**: Generate reports on library usage, popular books, and member activity.

## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Python (Flask Framework)
- **Database**: MySQL
- **APIs**: RESTful APIs for communication between frontend and backend

## Setup Instructions

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/Atul-Aditya-2435/Library_Management.git
   cd Library_Management
   ```

2. **Install Dependencies**:

   Ensure you have Python installed. Then, install the required packages:

   ```bash
   pip install -r requirements.txt
   ```

3. **Set Up the Database**:

   - Install MySQL and create a database named `library_management`.
   - Execute the SQL scripts provided in the `database` directory to set up the necessary tables.

4. **Configure Environment Variables**:

   - Rename `.env.example` to `.env`.
   - Update the `.env` file with your database credentials and other configuration settings.

5. **Run the Application**:

   ```bash
   python app.py
   ```

6. **Access the Application**:

   Open your web browser and navigate to `http://localhost:5000`.

## Usage

- **Admin Login**:

  - Username: `admin`
  - Password: `password`

  *Note*: Change the default password after the first login for security purposes.

- **Managing Books**:

  - Navigate to the "Books" section to add, update, or delete book records.

- **Managing Members**:

  - Use the "Members" section to register new members or update existing member information.

- **Handling Transactions**:

  - In the "Transactions" section, manage book checkouts and returns, and monitor overdue items.

## File Structure

```
Library_Management/
├── app.py
├── requirements.txt
├── .env.example
├── database/
│   ├── schema.sql
│   └── data.sql
├── templates/
│   ├── index.html
│   ├── books.html
│   └── members.html
└── static/
    ├── css/
    └── js/
```

## Contributing

We welcome contributions to enhance the Library Management System. To contribute:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/YourFeatureName`.
3. Make your changes.
4. Commit your changes: `git commit -m 'Add some feature'`.
5. Push to the branch: `git push origin feature/YourFeatureName`.
6. Open a pull request.

## License

This project is licensed under the MIT License.

## Contact

For any inquiries or support, please contact Atul Aditya at atuladitya2435@example.com.
