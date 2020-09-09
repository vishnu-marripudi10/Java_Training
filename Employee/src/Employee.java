class Employee{
long diff;
int EmployeeId1 = 123, EmployeeId2 = 233;
String EmployeeName1 = "Sai", EmployeeName2 = "Vis";
long EmployeeSalary1 = 12000, EmployeeSalary2 = 6000;
void show()
{
System.out.println("EmployeeId="+ EmployeeId1);
System.out.println("EmployeeName="+ EmployeeName1);
System.out.println("EmployeeSalary="+ EmployeeSalary1);
System.out.println("EmployeeId="+ EmployeeId2);
System.out.println("EmployeeName="+ EmployeeName2);
System.out.println("EmployeeSalary="+ EmployeeSalary2);
diff = EmployeeSalary1 - EmployeeSalary2;
System.out.println("Difference of Employees Salaries="+ diff);
if(EmployeeSalary1>EmployeeSalary2)
{
System.out.println(EmployeeName1);
System.out.println(EmployeeName1.replace("Sai", "Vardhan"));
}
else
{
System.out.println(EmployeeName2);
System.out.println(EmployeeName1.replace("Vis", "Raj"));
}
}

}

