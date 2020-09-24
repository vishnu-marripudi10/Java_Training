mysql> create table People(Name varchar(255), City varchar(255), Hobby varchar(255));
Query OK, 0 rows affected (0.05 sec)

mysql> insert into People(Name,City,Hobby) values('Vishnu','Banglore','Cooking');
Query OK, 1 row affected (0.01 sec)

mysql> insert into People(Name,City,Hobby) values('Rajesh','Chennai','Drawing');
Query OK, 1 row affected (0.01 sec)

mysql> insert into People(Name,City,Hobby) values('Shashank','Hyderabad','Singing');
Query OK, 1 row affected (0.01 sec)

mysql> select * from People;
+----------+-----------+---------+
| Name     | City      | Hobby   |
+----------+-----------+---------+
| Vishnu   | Banglore  | Cooking |
| Rajesh   | Chennai   | Drawing |
| Shashank | Hyderabad | Singing |
+----------+-----------+---------+
3 rows in set (0.00 sec)

mysql> insert into People(Name,City,Hobby) values('Pradeep','chennai','Watching Tv');
Query OK, 1 row affected (0.01 sec)

mysql> select * from People;
+----------+-----------+-------------+
| Name     | City      | Hobby       |
+----------+-----------+-------------+
| Vishnu   | Banglore  | Cooking     |
| Rajesh   | Chennai   | Drawing     |
| Shashank | Hyderabad | Singing     |
| Pradeep  | chennai   | Watching Tv |
+----------+-----------+-------------+
4 rows in set (0.00 sec)

mysql> Select * from People where City='Chennai';
+---------+---------+-------------+
| Name    | City    | Hobby       |
+---------+---------+-------------+
| Rajesh  | Chennai | Drawing     |
| Pradeep | chennai | Watching Tv |
+---------+---------+-------------+
2 rows in set (0.00 sec)

mysql> Select count(City) from People where City='Chennai';
+-------------+
| count(City) |
+-------------+
|           2 |
+-------------+
1 row in set (0.00 sec)

mysql> Select count(City) AS City_Count from People where City='Chennai';
+------------+
| City_Count |
+------------+
|          2 |
+------------+
1 row in set (0.00 sec)