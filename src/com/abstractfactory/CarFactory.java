package com.abstractfactory;

public class CarFactory {
	
	public CarFactory() {
		
	}
	
	public static Car buildCar(CarType type) {
		Car car=null;
		
		Location location=Location.INDIA;
		
		switch(location) {
		
		case USA: car=USACarFactory.buildCar(type);
		break;
		
		case INDIA: car=IndiaCarFactory.buildCar(type);
		break;
		
		default:
			car=DefaultCarFactory.buildCar(type);
			break;
		}
		
		return car;
	}

}

/**
 * 
 *Spring AOP is a programming technique which is used by programmers to modularize the cross cutting concerns across the entire application
 *Advice is the action taken by aspect at jointpoint.
 *Jointpoint is the point during method of execution.
 *Pointcut is the expression that is matched with jointpoint to determine whether advices should be executed or not.
 *Target object is the object upon which advice is applied to create a proxy object.
 *Weaving is a process of linking aspect with application type to create a proxy object.
 * Spring framework supports runtime weaving but aspectj is a full-fledged aspect oriented programming that supports compile time weaving.
 * Aspect is the module that encapsulate advice and pointcuts.
 * 
 * I prefer spring framework as it provides a lot of features and different modules for specific tasks such as 
 * spring MVC, spring JDBC, etc.
 * 
 * The two most important features of spring framework is IOC(Inversion of Control) and Spring AOP concepts.
 * Inversion of Control is the powerful feature of Spring framework to give the responsibility of creating an object to the Spring container instead of programmer happen to create it manually,
 * Dependency injection is a subset of IOC which is used to inject object properties values.
 * There is two types of dependency injection and they are setter and constructor based dependency injection.
 * Autowire is a feature that lets you inject object dependencies implicitly.
 * Dependency injection makes unit test simple and easy as you have class that have setter method so you can use mocking framework to test the depedencies of the class.
 * Aspect is a class that implement cross-cutting concerns. It encapsulates advice and pointcuts.
 * 
 * 
 * Component is used to indicate that a class is a component which means that these are used for auto-detection and configured as bean.
 * 
 * ContextLoaderListener is the listener class used to load root context and define spring bean configuration that will be visible to all other contexts.
 * 
 * Spring provides excellent support for localization or i18N through resource bundles.
 * 
 * PathVariable is used for mapping dynamic values from URI to handler method arguments.
 * 
 * 
 * List<Department> departments=session.createQuery("From Department",Department.class).getResultList;
 * 
 * for(Department department:departments){
 * System.out.println(department.getId()+department.getDeptName());
 * }
 * 
 * List<Employee> employees=department.getEmployees();
 * for(Employee employee:employees){
 * System.out.println(employee.getId()+employee.getEmployeeName());
 * }}
 * 
 * So here one query gets executed for parent class that is department and N number of queries gets executed for child that is Employee so it creates a 
 * Hibernate (N+1) problem.
 * Session session=HibernateUtil.getSessionFactory().openSession();
 * List<Department> department=session.createQuery("From Department d join fetch d.employees",Department.class).getResultSet();
 * 
 * load method should be used if we know for sure that there is data in the database otherwise get should be used.
 * load will throw exception if there is no data found in the database but get will return null if data is not found.
 * get method will hit the database immediately once called but load method will return proxy object and will hit database only when one of the method of that object is called.
 * 
 * AWS is a platform that provides secure cloud services, database storage, computer power to help business grow and develop.
 * 
 * 
 * Software as a service: you do not manage anything, everything is managed by the service provider: google docs, dropbox,slack
 * Platform as a service: you have to manage application and data only, example Windows Azure, AWS elastic beanstalk
 * Infrastructure as a service: you have to manage application,data,middleware,O/S, example: AWS EC2, Google Cloud, Digital Ocean, Rackspace
 * 
 * Automated backup is the key process to having database hosted in EBS volume to backup as there is no 
 * manaual intervention required. The best way is to prepare for timely backup of EGS of the EC2 instance.
 * EBS snapshot should be stored in Amazon S3 and can be used to recover the the database instance in case of failure or downtime.
 * 
 * Performance of elastic block storage varies as it might go above SLA performance level or below. Once can backup EBS volumes through
 * graphical user interface like elasticfox or use the snapshot facility through API calls.
 * 
 * spot instance is the spare unused EC2 instances which one can bid for. 
 * 
 * on-demand instances are made available whenever you require them and you may need to pay for the time you use them on the hourly basis.
 * 
 * Elastic block storage as the name suggest it provides persistent, highly available and high performance block level storage that can be attached to a running EC2 instance.
 * The storage can be formatted and mounted as a file system or the raw storage can be accessed directly.
 * 
 * If I come across a scenario where EC2 instance is approaching 100% CPU utilization then I will resort to using load balancing to an autoscaling group to efficiently distribute load among all the instances.
 * 
 * Amazon S3 is used to store object store whereas ELB (Elastic Block Storage) is used to store filesystem. Amazon S3 is fast whereas ELB is superfast. Amazon S3 Requires Primary and Private key for security but ELB is only visible to EC2.
 * 
 * Some of the connection issues I may encounter while connecting to EC2 instance are: Connection timeout, Server refused key, Unprotected private key file.
 * 
 * The way to bind user session to specific instance of ELB is by using sticky session.
 * 
 * I can send request to Amazon S3 by using Rest API or AWS SDK wrapper libraries.
 * 
 * The best practices for security in Amazon EC2 are:
 * Create individual IAM( Identity and Access Management) user to control access to AWS resource.
 * Secure AWS root account and its access key.
 * Grant less privileges by openning up permission that are required.
 * Define and review security group rules on a regular basis.
 * 
 * I can achieve a cofiguration an instance with application and its dependecies and make it ready for serve traffic by making
 * use of lifecycle hooks as they are powerful tool that allow user control such as pause the creation or termination of an instance so as to allow
 * the user to peform custom actions such as configuring the instance, downloading the required files.
 * 
 * classic load balance is used to make routing decision at the application and transport layer that support either VPC or EC2.
 * 
 * 
 * 
 * Design Pattern for Parking Lots:
 * 
 * Assumption:
 * 1. Your Parking lot has multiple lots. Each level has multiple row of spots.
 * 2. The parking lot can park motorcycles, cars and buses.
 * 3. The parking lot has motorcycle spots, compact spots and large spots.
 * 4. A motorcycle can park in any spot.
 * 5. A car can park in either a single compact spot or single large spot.
 * 6. A bus cannot park in small spots.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
