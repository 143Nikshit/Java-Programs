
import java.util.Scanner;

public class MobileShopDriver {
	
	static samsung createSamsung(samsung Sam)
	{
		return Sam;
	}
	
	static vivo createVivo(vivo Vi)
	{
		return Vi;
	}
	static apple createApple(apple App)
	{
		return App;
	}
	
	

	public static void main(String[] args) {
		mobileshop m= new mobileshop();
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************");
		System.out.println("Welcome to Chor Bazaar");
		System.out.println("************************************\n");
		System.out.println(".....Choose Mobile Brand.....");
		System.out.println("▸Samsung");
		System.out.println("▸Apple");
		System.out.println("▸Vivo");
		System.out.println("Type brand of your choice: ");
		System.out.println("-------------------------------------");

		mobileshop ms= null;
		while(ms==null)
		{
		String brandChoice = sc.nextLine().toLowerCase();
		switch (brandChoice) {
		
        case "samsung": { // Samsung
        	System.out.println("-------------------------------------");
    		System.out.println(".....Choose Your Model.....");
    		System.out.println("➢S23");
    		System.out.println("➢S24");
    		System.out.println("➢S25");
    		System.out.println("Type Your Samsung Model: ");
    		System.out.println("-------------------------------------");
    	
    		samsung sam = null;
    		while(sam==null)
    		{
    			String choice1 = sc.nextLine().toLowerCase();
    			switch (choice1) {
        		
        		case "s23":
        		{
        			sam = createSamsung(new s23());
        			m.setSamsung(sam);     
        			m.sam.printThanks(); 
        			break;
        		}
        		case "s24":
        		{
        			sam = createSamsung(new s24());
        			m.setSamsung(sam);     
        			m.sam.printThanks(); 
        			break;
        		}
        		case "s25":
        		{
        			sam = createSamsung(new s25());
        			m.setSamsung(sam);     
        			m.sam.printThanks(); 
        			break;
        		}
        		default:{
        			System.err.println("Choose Valid ModelName.....");
        			System.out.println();
        	    	System.out.println("-------------------------------------");
            		System.out.println(".....Choose Your Model.....");
            		System.out.println("➢S23");
            		System.out.println("➢S24");
            		System.out.println("➢S25");
            		System.out.println("Type Your Samsung Model: ");
        		}
        	 }
           }break;
    	} 
    	
    	
    		
        case "vivo": { // Vivo
        	System.out.println("-------------------------------------");
    		System.out.println(".....Choose Your Model.....");
    		System.out.println("➢vivoY32");
    		System.out.println("➢vivoX300");
    		System.out.println("➢vivoV5");
    		System.out.println("Type Model of your choice: ");
    		System.out.println("-------------------------------------");
  
    		
    		vivo vi = null;
    		while(vi==null)
    		{
    			String choice2 = sc.nextLine();
    		switch (choice2) {
    		
    		case "vivoY32":
    		{
    			vi = createVivo(new vivoY32());
    			m.setVivo(vi);
    			m.vi.printThanks1();
    			break;
    		}
    		case "vivoX300":
    		{
    			vi = createVivo(new vivoX300());
    			m.setVivo(vi);
    			m.vi.printThanks1();
    			break;
    		}
    		case "vivoV5":
    		{
    			vi = createVivo(new vivoV5());
    			m.setVivo(vi);
    			m.vi.printThanks1();
    			break;
    		}
    		default:{
    			System.err.println("Choose Valid ModelName.....");
    			System.out.println("-------------------------------------");
        		System.out.println(".....Choose Your Model.....");
        		System.out.println("➢vivoY32");
        		System.out.println("➢vivoX300");
        		System.out.println("➢vivoV5");
        		System.out.println("Type Model of your choice: ");
        		System.out.println("-------------------------------------");
      
    		}
    	 }
       } break;
       }
       
       
        case "apple": { // Apple
        	System.out.println("-------------------------------------");
    		System.out.println(".....Choose Your Model.....");
    		System.out.println("➢I15pro");
    		System.out.println("➢I16pro");
    		System.out.println("➢I17pro");
    		System.out.println("Type Model of your choice: ");
    		System.out.println("-------------------------------------");
    		
    		apple app = null;
    		while(app==null)
    		{
    			String choice3 = sc.nextLine().toLowerCase();
    			switch (choice3) {
        		
        		case "iphone15pro":
        		{
        			app = createApple(new iphone15Pro());
        			m.setApple(app);
        			m.app.printThanks();
        			break;
        		}
        		case "iphone16pro":
        		{
        			app = createApple(new iphone16Pro());
        			m.setApple(app);
        			m.app.printThanks();
        			break;
        		}
        		case "iphone17pro":
        		{
        			app = createApple(new iphone17Pro());
        			m.setApple(app);
        			m.app.printThanks();
        			break;
        		}
        		default:{
        			System.err.println("Choose Valid ModelName.....");
        	    	System.out.println("-------------------------------------");
            		System.out.println(".....Choose Your Model.....");
            		System.out.println("➢I15pro");
            		System.out.println("➢I16pro");
            		System.out.println("➢I17pro");
            		System.out.println("Type Model of your choice: ");
            		System.out.println("-------------------------------------");
        		}
        	 }
           }break;
    		}
    		
        
        default:
        {
        	System.err.println("Choose Valid Brand Name......");
        	System.out.println();
        	System.out.println("************************************");
    		System.out.println("Welcome to Chor Bazaar");
    		System.out.println("************************************\n");
    		System.out.println(".....Choose Mobile Brand.....");
    		System.out.println("▸Samsung");
    		System.out.println("▸Apple");
    		System.out.println("▸Vivo");
    		System.out.println("Type brand of your choice: ");
    		System.out.println("-------------------------------------");
        	
        }
        	
      }
		}
	}
}
