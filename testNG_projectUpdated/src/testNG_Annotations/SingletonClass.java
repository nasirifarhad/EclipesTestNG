package testNG_Annotations;

public class SingletonClass {
	// when create singleton class the purpose is limiting the obj creation of that class
	// means that you cant create the obj of singleton class more than once.
	// the decleartion of singleton class is as below.
	/*
	 * In object-oriented programming, a singleton class is a class that can have only one object (an instance 
	 * of the class) at a time. After the first time, if we try to instantiate the Singleton class, the new variable also
	 *  points to the first instance created. So whatever modifications we do to any variable inside the class
	 *   through any instance, affects the variable of the single instance created and is visible if we access that
	 *    variable through any variable of that class type defined. 
Remember the key points while defining class as a singleton class that is while designing a singleton class: 
Make a constructor private.
Write a static method that has the return type object of this singleton class. Here, the concept of Lazy
 initialization is used to write this static method.
Purpose of Singleton Class
The primary purpose of a Single class is to restrict the limit of the number of object creation to only one.
 This often ensures that there is access control to resources, for example, socket or database connection.
The memory space wastage does not occur with the use of the singleton class because it restricts the
 instance creation. As the object creation will take place only once instead of creating it each time a new
  request is made.
We can use this single object repeatedly as per the requirements. This is the reason why the multi-threaded 
and database applications mostly make use of the Singleton pattern in Java for caching, logging, thread 
pooling, configuration settings, and much more.
	 */
	private static SingletonClass instanceOfSingletonClass=null;
	
	private SingletonClass( ) {
		
	}

	

}

