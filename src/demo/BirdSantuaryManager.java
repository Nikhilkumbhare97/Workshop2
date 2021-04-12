package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BirdSantuaryManager {
	
    List<Bird> birds = new ArrayList<>();
    
	public void addBird(Bird bird) throws Exception {
		
		if (bird == null) {
			throw new BirdNotPresentException("Empty");
		}else {
			birds.add(bird);
		}
	}	
	
	public void deleteBird(Bird bird){
		birds.remove(bird);
	}	
	
	public List<Bird> getAllBirds(){
		return birds;
	}
	
	public List<Flyable> getAllFlyableBirds(){
		return birds.stream().filter(p -> p instanceof Flyable ).map(p -> (Flyable)p).collect(Collectors.toList());
    	
	}	
	
	public List<Swimable> getAllSwimableBirds(){
		return birds.stream().filter(p -> p instanceof Swimable ).map(p -> (Swimable)p).collect(Collectors.toList());
		
	}	
	
	public boolean isAvailable(Bird bird) {
		return birds.contains(bird);
	}
}
