package Methods;
public class StaticMethodfromsameclass {
	
	public static void main(String [] args) {

        System.out.println("Main method started");
        
       Demo1();
       Demo2();
       
       
     StaticMethodfromsameclass.Demo1();
     StaticMethodfromsameclass.Demo2();
        
        System.out.println("Main method completed");
        
	}
        public static void Demo1() {
        
        System.out.println("Static regular method calling from same class-Demo1");
        }
        
        public static void Demo2() {
        
        System.out.println("Static regular method calling from same class-Demo2");
        }
   
        
        }
	
		
	


