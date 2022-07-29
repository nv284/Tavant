package com.org.tav.day7;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory
        = HibernateUtil.getInstnce();

    // Getting session from Sesson factory
    Session session = sessionFactory.openSession();

    // Begin transaction
    Transaction transaction
        = session.beginTransaction();

    // Creating Employee base class record
    Employee employee = new Employee();
    employee.setName("KirikoChan");
    employee.setAge(19);
    P_Employee permanentEmployee = new P_Employee();
    permanentEmployee.setName("Saili.H");
    permanentEmployee.setAge(20);
    permanentEmployee.setSalary(30000);

    // Creating Contract Employee subclass record
    C_Employee contractEmployee = new C_Employee();
    contractEmployee.setName("ChikkoRita");
    contractEmployee.setAge(21);
    contractEmployee.setHourlyRate(2000);
    contractEmployee.setDuration(7.5);

    // Persisting all the employee records
    session.persist(employee);
    session.persist(permanentEmployee);
    session.persist(contractEmployee);

    // Commit the transaction and
    // closing the session
    transaction.commit();
    session.close();

    // Display message
    System.out.println(
        "Employee records successfully persisted.");


    }
}
