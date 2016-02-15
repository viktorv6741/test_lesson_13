Question 1: Which method can access to private attributes of class ?

(C) Only methods those defined in the same class  // private is the most strict access modifier. Private  member can only be accesed from their own class 
												  //You can get private variables using special method - Getter
												  
                                                  // For Example:		
												  
												      public int getVariable(){
													  return this.variable;
												  }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


Question 2: Which of these are not legal identifiers. Select the four correct answers.

a. 1alpha         // Identifier can not start with a digit
b. _abcd          // Possible to use underscore _.
c. xy+abc         // + Arithmetic operator(addition). No possible to use this identifier.
d. transient      // Keyword cannot be used as an identifier.
e. account-num    // - Arithmetic operator(subtraction). No possible to use this identifier.
f. very_long_name //  Everything good. We can use underscore.

Correct answer : (B) a,c,d,e 


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 3: Is the following statement true or false. The constructor of a class must not have a return type.

(A) true

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 4: What is an aggregate object?

(C) An instance which has other objects

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 5: What gets printed when the following program is compiled and run? Select the one correct answer.

class Test{
	public static void main(String args[]){
		
		int i; 
		
		do{
 			i++;              // We need to declarate variable;
		}while(i < 0);
		
		System.out.println(i);
		
	}
}

(A) The program does not compile. // Variable "i" must be initialized

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 6: Wich of the following are legal declaration and definition of a method. Select all correct answers.

a. void method (){}      // Everything ok. This is correct answer. Access modifier - private package, method does not return value
                         // Don't have any  formal parameters
					
b. void method(void){}
c. method (){}           // It looks like a default constructor
d. method (void){}       // This is not correct
e. void method{}         // The signature of the method wasn't declared properly


Correct answer : (B) a

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 7: What happened when the following code is compiled and run. Select the one correct answer.

for (int i = 1; i < 3; i++)
	for (int j = 3; j >= 1; j--) // j >= 1 || i = 1, variables i and j will be equal.
		
assert i != j : i;	// we need to add -ea and, also, "i" can not be void
	
Correct answer : (B) The number 1 gets printed with AssertionError
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 8: A top level class may have only the following access modifier. Select the one correct answer.

Correct answer : (D) public 

// I think we can compile, also with private package modifier... gm... something strange...

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 9: Assume that File is an abstract class and has to toFile() method.
ImageFile and BinaryFileare are concrete classes of the abstract class File.

Also, assume that the method toFile is implemented in both BinaryFle and ImageFile.
A File references an ImageFile object in memory and the toFile method is called, which implementation method will be called?

Correct answer : (B) ImageFile


abstract class File{
	void toFile(){
		sout("File");
	}
	}
	
	class ImageFile extends File{
		@Override
		void toFile(){
			sout("ImageFile")
		}
		
	class BinaryFile extends File{
		@Override
		void toFile(){
			sout("BinaryFile")
		}
		
		public class TestFiles{
			public static void main(String... args){
				
				File file = new ImageFile(); 
				file.tofile;
				
				ImageFile //toFile was overridden in ImageFile class.
				
			}
		}
			
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 10: Which of the following are Java keywords. Select the correct answers.

a. super
c. void
f. instanceof

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 11: What happend when the following code is compiled and run. Select the one correct answer.

for (int i = 1; i < 4; i++)
	for (int j = 1; j < 4; j++)
		
	if(i < j)
		assert i != j : i;
	
	// AssertionError and i will not be printed because i != j will return true


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 12: What is the main flow of Logger works, please describe it with all dependencies?
             What is the configuration property file name? How can I set level of logging? ...etc
			 
			
			 1. To record some event. 
			 2. The configuration property file name is "logging.property", which located in ...\Java\jdk1.8.0_74\jre\lib directory.
			 3. We can set the level of logging by edding the configuration file (logging.property) or using class .	
			 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 13: What gets printed on the standart output when the class bellow is compiled and executed. Select the one correct answer.

public class ShortCkt{
	public static void main(String... args){
		int i = 0;
		boolean t = true;
		boolean f = false, b;
		
		b = (t || ((i++) == 0));
		b = (f || ((i+=2) > 0));
		
		System.out.println(i);
	}
}

Correct answer : C(3);  // Must be "3" ... but I'm not sure ...

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 14: What get printed when the following program is compiled and run. Select the correct answer.

class test{
	public static void main(String... args){
		
		int i,j,k,l = 0;
		k = l++; // 0 - because of postfix increment
        j = ++k; // 1 - because of prefix increment
        i = j++; // 1 - because of postfix increment
		
		sout(i)
	}
} 

Correct answer : (B) 1;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Question 15: Write down the modifier of a method that makes the method available to all classes in the same package and to all the subclasses of this class


Correct answer : private package
			 
			 