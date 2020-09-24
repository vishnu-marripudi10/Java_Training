use bank_details;
Database changed
mysql> create table customers_details(AccountNumber int, CustomerFirstName varchar(255), CustomerLastName varchar(255), CustomerNumber int, OpeningDate date);
Query OK, 0 rows affected (0.05 sec)

mysql> desc customers_details;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| AccountNumber     | int          | YES  |     | NULL    |       |
| CustomerFirstName | varchar(255) | YES  |     | NULL    |       |
| CustomerLastName  | varchar(255) | YES  |     | NULL    |       |
| CustomerNumber    | int          | YES  |     | NULL    |       |
| OpeningDate       | date         | YES  |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+
5 rows in set (0.01 sec)


mysql> insert into customers_details(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(101, 'Vishnu', 'Sai', 8, '2020-08-15');
Query OK, 1 row affected (0.01 sec)


mysql> insert into customers_details(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(101, 'Rajesh', 'Babu', 4, '2020-08-20');
Query OK, 1 row affected (0.01 sec)

mysql> insert into customers_details(AccountNumber, CustomerFirstName, CustomerLastName, CustomerNumber, OpeningDate) Values(101, 'PremSai', 'Shashank', 10, '2020-08-10');
Query OK, 1 row affected (0.00 sec)

mysql> select * from customers_details;
+---------------+-------------------+------------------+----------------+-------------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate |
+---------------+-------------------+------------------+----------------+-------------+
|           102 | Vishnu            | Sai              |              8 | 2020-08-15  |
|           103 | Rajesh            | Babu             |              4 | 2020-08-20  |
|           101 | PremSai           | Shashank         |             10 | 2020-08-10  |
+---------------+-------------------+------------------+----------------+-------------+
3 rows in set (0.00 sec)

mysql> select * from customers_details order by OpeningDate;
+---------------+-------------------+------------------+----------------+-------------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate |
+---------------+-------------------+------------------+----------------+-------------+
|           101 | PremSai           | Shashank         |             10 | 2020-08-10  |
|           102 | Vishnu            | Sai              |              8 | 2020-08-15  |
|           103 | Rajesh            | Babu             |              4 | 2020-08-20  |
+---------------+-------------------+------------------+----------------+-------------+
3 rows in set (0.00 sec)

mysql> create table account_details(AccountNumber int, City varchar(45));
Query OK, 0 rows affected (0.05 sec)

mysql> desc account_details;
+---------------+-------------+------+-----+---------+-------+
| Field         | Type        | Null | Key | Default | Extra |
+---------------+-------------+------+-----+---------+-------+
| AccountNumber | int         | YES  |     | NULL    |       |
| City          | varchar(45) | YES  |     | NULL    |       |
+---------------+-------------+------+-----+---------+-------+
2 rows in set (0.01 sec)

mysql> insert into account_details(AccountNumber, City) values(102,'chennai');
Query OK, 1 row affected (0.01 sec)

mysql> insert into account_details(AccountNumber, City) values(103,'banglore');
Query OK, 1 row affected (0.00 sec)

mysql> insert into account_details(AccountNumber, City) values(101,'hyderabad');
Query OK, 1 row affected (0.01 sec)

mysql> select  * from account_details;
+---------------+-----------+
| AccountNumber | City      |
+---------------+-----------+
|           102 | chennai   |
|           103 | banglore  |
|           101 | hyderabad |
+---------------+-----------+
3 rows in set (0.00 sec)

mysql> select * from customers_details inner join account_details on customers_details.AccountNumber = account_details.AccountNumber;
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate | AccountNumber | City      |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
|           102 | Vishnu            | Sai              |              8 | 2020-08-15  |           102 | chennai   |
|           103 | Rajesh            | Babu             |              4 | 2020-08-20  |           103 | banglore  |
|           101 | PremSai           | Shashank         |             10 | 2020-08-10  |           101 | hyderabad |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
3 rows in set (0.00 sec)

mysql> select * from customers_details inner join account_details on customers_details.AccountNumber = account_details.AccountNumber order by CustomerNumber;
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
| AccountNumber | CustomerFirstName | CustomerLastName | CustomerNumber | OpeningDate | AccountNumber | City      |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
|           103 | Rajesh            | Babu             |              4 | 2020-08-20  |           103 | banglore  |
|           102 | Vishnu            | Sai              |              8 | 2020-08-15  |           102 | chennai   |
|           101 | PremSai           | Shashank         |             10 | 2020-08-10  |           101 | hyderabad |
+---------------+-------------------+------------------+----------------+-------------+---------------+-----------+
3 rows in set (0.00 sec)