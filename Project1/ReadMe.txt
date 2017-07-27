This is some of the very first java code that I have ever written. It uses 9 classes, each 
with it’s own purpose to preform some type of calculation. The Main method is inside 
Project1.java, the program uses a menu to select which calculation to run. User input is 
taken from UserInput.java.

-------------------------------------------------------	

		$ cd src 
		$ javac -d ../classes project1/Project1.java
	
	once compiled navigate to classes directory. 
	
		$ cd .. 
		$ cd classes 
	
	then from the classes directory run the program 
		
		$ java project1/Project1

-------------------------------------------------------		
this is also a demo of how to create a jar file 

1. create a manifest file and give it a txt extension put that file in the classes directory. 
	you have to tell the JVM where main is 
	
	Manifest-Version: 1.0 
	Main-Class: project1.Project1
	
2. then cd to inside of the classes directory, this is where will make the jar
3. then run this command and create the jar 

	$ jar cvfm my.jar manifest.txt project1/*.class
	
4. then run  

	$ java -jar my.jar
	
whats great about a jar file is it takes all those classes files and puts them in a nice 
single executable file that can run from anywhere. 
-------------------------------------------------------	
