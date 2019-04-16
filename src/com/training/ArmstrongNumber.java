package com.training;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		int n=153;
		int sum=0;
		int c;
		int r;
		int temp=n;
		while(n>0) {
			r=n%10;
			c=r*r*r;
			sum=sum+c;
			n=n/10;
			
		}
		n=temp;
		System.out.println(sum);
		if(n == sum) {
			System.out.println(sum+" is a Amstrong Number");
		}else {
			System.out.println(sum+" is not a Amstrong Number");
		}
		
		
		
		
		
	}

}



/*
 * JDBC is database dependent which means that if we change the database then jdbc driver has to be changed as well
 * JDBC we have to handle exception
 * JDBC does not having caching
 * JDBC has a lot of boiler plate code that has to be duplicated
 * 
 * Hibernate provides auto DDL support whereas in JDBC we have to manually create ,alter or drop table
 * Hibernate is database independent which means we can switch between databases
 * Hibernate has its own query language that is HQL which is independent of any database
 * Hibernate provides auto primary key generator whereas in JDBC we have to manually set primary key for the database table
 * Hibernate provides caching: first level caching also known as session cache which is used to store objects in the current session an
 * these objects are alive as long as the session is not closed. Second level cache is disabled by default but can be enabled in the configuration
 * These store objects across session. It is alive as long as session factory is not closed. Query level cache is used to store result of the query.
 * 
 * 
 * Spring is an open source lightweight framework to develop java based enterprise application.
 * 
 * Jenkins is an open source automated server that is used to build,test and deploy application. It supports continous integration,
 * continous deployment and continous development.
 * 
 * Continous integration is a development process of individual developers integrating development code to a shared repository at regular interval so 
 * as to find the bugs as early as possible and accelerate collaboration development.
 * 
 * Continous delivery is a continual process of shipping software code to a given environment (dev,test,performance,uat,staging or production) via manual release.
 * 
 * Continous deployment is a process of automatically deploy code to a production environment.
 * 
 * Tools: Jenkins, Atlassion Bamboo, Travis CI
 * 
 * Jenkins support two ways to write jenkins file. One way is create a jenkins file using declarative pipleline and commiting
 * it to the verson control. 
 * 
 * Declarative pipeline and scripted pipeline: scripted pipeline is a traditional approach in which
 * pipleline configuration is done in the jenkins only and run.
 * 
 * pipeline runs on agents and which have stages contain stage which defines each step for specific purpose.
 * 
 * Hibernate is a ORM tool and persistence framework that is used to map object oriented domain model to relational database.
 * 
 * Hibernate (N+1) problem means that say if there is a purchase order and purchase order item class and customer has ordered 5 items in it
 * now when we execute query select * from purchase order then it will return all purchase order by a customer but what if we need to know each purchase order 
 * item in the purchase order then hibernate will have to fire five queries to retreive the result. which means 1 query to fetch result of 
 * all N purchase order and N queries to fetch purchase order items
 * This will take more network bandwidth and slow down the performance of the application so as to resolve this 
 * Hibernate (N+1) select problem we can use Hibernate fetch join instead of fetch EAGER or LAZY that way one query would be
 * fired to retreive the result.
 * 
 * from Purhcase_order fetch join .Purchase_Orderitems Purchase_order Items
 * Select * from Purchase_order Left p Outer Join Purchase_Order_Item d on p.id=d_purchaseorderid;
 * 
 * Java Application
 * JDBC API
 * Driver Manager
 * JDBC Driver
 * Database
 * 
 * Register and load driver class
 * create connection
 * ceate statement
 * execute query
 * close connection
 * 
 * throw is used to throw exception whereas throws is used to declare exception
 * throw is found within method whereas throws is found along method signature
 * We cannot throw multiple exception at once whereas we can declare multiple exceptions at once
 * We can use throw for both checked and unchecked exception whereas throws is used for declaring only checked exceptions
 * 
 * Exception handling is the process of handling runtime errors so as to prevent normal flow of the execution.
 * Exception is an event that disrupts the normal flow of the application execution.
 * 
 * Exception happens moslty due to programmers code whereas Error is found due to lack of resources. It has nothing to do with programmers code.
 * Exception is recoverable whereas Error is not recoverable.
 * 
 * Checked exception are exception that are checked by compile such as SQL Exception, Interrupted Exception, IO Exception.
 * Unchecked exception are exception that are not checked by compiler such as Arithmentic Exception, Null Pointer Exception, IndexArrayOutOfBoundsException,etc.
 * 
 * 
 * Java 8 features:
 * Lambda express is a anonymous function that has no return type. It is used to implement functional interface.
 * Lambda expression was introduced in java to replace anonymous inner class
 * 
 * interface In{
 * void f();
 * }
 * 
 * class Test{
 * 
 * p.s.v main(String[] args){
 * In obj=new In(){
 * 	public void f(){
 * 	System.out.println("Hello");
 * }};
 * 
 * 
 * 
 * 
 * Functional interface is an interface that has only one abstract method in it such as Comparator,Runnable,Callable,etc.
 * Marker inteface is an interface that has no any method in it but when it is implemented by class then it provides certain behavior to the class object
 * such as Serializable, RandomAccess,Clonneable,etc.
 * Default method in interface, static method in interface
 * Method reference and constructor reference using double colon operator (::)
 * Pre-defined functional interface such as Predicate, Function,Consumer, Supplier
 * Stream API: It is used perform operation on a stream collection. Stream is not a data structure but a sequence of objects in the collections.
 * filter: It is used to filter element in the collection.
 * map: It is used to perform bulk operation on all the elements in the collection.
 * reduce: reduce method is used to reduce the elements of the stream to a single value.
 * toArray,count(),sorted(),sum(),min(),max()
 * 
 * Anonymous inner class extends a class, lambda expression provides implementation for functional interface
 * Java 8 introduced functional programming in java by supporting lambda expression and 
 * stream api, simplified programming, parallel processing. stream.parallel.
 * Data and time API was introduced because some of the methods got deprecated. It was
 * introduced to address the shortcomings of older java.util.Date and java.util.Calendar
 * Data and Calender class are not thread safe so it is hard to debug concurrency issues,
 * and Date and Calendar API is poorly designed with inadequate methods to perform day to day operations
 * Develpers had to write additional logic to handle timezone logic with old APIs whereas handling timezone can be done
 * with Local and Zoned Date/time API.
 * 
 * LocalDate localDate=LocalDate.now();
 * LocalTime localTime=LocalTime.now();
 * ZonedId zoneId=Zoned.of("Europe/Paris");
 * ZonedDateTIme.parse
 * 
 * How to avoid Nullpointer exception in code:
 * 1. By using literal comparison to String or object instead of String or object comparison to literal
 * 2. Using String.Utils class method for validation (StringUtils.isEmpty(),StringUtils.isBlank(),StringUtils.equals()).
 * 3. Using Collection.EMPTY_LIST for empty collection instead using null
 * Instead of List list=null; we can use List list=Collection.EMPTY_LIST;
 * 4. Using some methods to assure that null value not exist such as contains(),indexOf(),isEmpty(),containsKey(),containsValue(),hasNext().
 * 5. 
 * 
 * Predicate
 * interface Predicate{
 * 
 * public boolean test(T t);
 * }
 * 
 * interface Function<T,R>{
 * 
 * 	public R apply(T t);
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
