package demo;

public class BirdSantuary {
	
	 public static void main(String args[]) throws Exception{
		 
	        Bird abc = new Parrot();
	        abc.name = "Rita";
	        Bird def = new Parrot();
	        def.name = "Sita";
	        
	        Penguin penguin = new Penguin();
	        Duck duck = new Duck();
	        
	        BirdSantuaryManager birdSantuaryManager = new BirdSantuaryManager();
	      
	        try {
	        	birdSantuaryManager.addBird(null);	
	        }
	        catch(BirdNotPresentException e) {
	        	System.out.println(e);
	        }
	        
	        try {
	        	birdSantuaryManager.addBird(abc);	        	
	        }
	        catch(BirdNotPresentException e) {
	        	System.out.println(e);
	        }
        

	        try {
	        	birdSantuaryManager.addBird(penguin);
	        }
	        catch(BirdNotPresentException e) {
	        	System.out.println(e);
	        }
	        

	        try {
	        	birdSantuaryManager.addBird(duck);	        	
	        }
	        catch(BirdNotPresentException e) {
	        	System.out.println(e);
	        }
	        
	        birdSantuaryManager.getAllBirds().forEach(p -> p.eat());    
	        birdSantuaryManager.getAllFlyableBirds().forEach(p -> p.fly());
	        birdSantuaryManager.getAllSwimableBirds().forEach(p -> p.swim());
       
//	        System.out.println(birdSantuaryManager.isAvailable(abc));
//	        birdSantuaryManager.deleteBird(abc);
//        	System.out.println(birdSantuaryManager.isAvailable(abc));
//	        
	        Bird abc1 = new Parrot();
	        abc1.name = "Rita";
	        
	        System.out.println(birdSantuaryManager.isAvailable(abc1));
	        birdSantuaryManager.deleteBird(abc1);
	        System.out.println(birdSantuaryManager.isAvailable(abc1));
	        
	        /*
	        for (int i = 0; i < birds.size(); i++) {
	        	
	        	if(birds.get(i) instanceof Flyable)
	        		((Flyable) birds.get(i)).fly();
	        	if(birds.get(i) instanceof Swimable)
	        		((Swimable)birds.get(i)).swim();
	            birds.get(i).eat();
	        }
	        
	        
	        birds.stream().filter(p -> p instanceof Flyable )
	        	.forEach(p -> ((Flyable)p).fly());
	        birds.stream().filter(p -> p instanceof Swimable )
        	.forEach(p -> ((Swimable)p).swim());
	        birds.stream().forEach(p -> p.eat());
	        
	        */	
	 }
}
