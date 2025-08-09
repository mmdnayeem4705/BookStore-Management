-- Sample data for Online Bookstore
-- Run this in your MySQL database

-- Insert book categories
INSERT INTO book_category (category_name) VALUES 
('Programming'),
('Databases'),
('Web Development'),
('Administration');

-- Insert books
INSERT INTO book (sku, name, description, unit_price, image_url, active, units_in_stock, category_id) VALUES
('PRG-001', 'Learn Java Programming', 'Complete guide to Java programming language', 29.99, 'assets/images/programming/programming-100.jpg', 1, 100, 1),
('PRG-002', 'Python for Beginners', 'Introduction to Python programming', 24.99, 'assets/images/programming/programming-101.jpg', 1, 75, 1),
('DB-001', 'MySQL Mastery', 'Complete MySQL database guide', 34.99, 'assets/images/databases/databases-100.jpg', 1, 50, 2),
('DB-002', 'PostgreSQL Essentials', 'PostgreSQL database management', 39.99, 'assets/images/databases/databases-101.jpg', 1, 60, 2),
('WEB-001', 'Angular Development', 'Modern web development with Angular', 44.99, 'assets/images/webdevelopment/webdevelopment-100.jpg', 1, 80, 3),
('WEB-002', 'React Fundamentals', 'Building web apps with React', 42.99, 'assets/images/webdevelopment/webdevelopment-101.jpg', 1, 90, 3),
('ADMIN-001', 'System Administration', 'Linux system administration guide', 49.99, 'assets/images/administration/administration-100.jpg', 1, 40, 4); 