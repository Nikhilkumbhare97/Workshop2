package demo;


interface Flyable {
	void fly();		
}

interface Swimable {
	void swim();
}

public abstract class Bird {
	
	public String name = null;
	
    abstract void eat();
    
    public boolean equals(Object o) {
    	
    	if(this == o) {
    		return true;
    	}
    	else if (this.name.equals(((Bird)o).name)) {
    		return true;
    	}
    	return false;
    }
}

class Parrot extends Bird implements Flyable {
	
	@Override
	public void fly() {
        System.out.println("Parrot fly");
    }

    @Override
    public void eat() {
        System.out.println("Parrot eat");
    }
}

class Penguin extends Bird implements Swimable {
	
	@Override
    public void swim() {
        System.out.println("Penguin swim");
    }

    @Override
    public void eat() {
        System.out.println("Penguin eat");
    }
}

class Duck extends Bird implements Flyable, Swimable{

	@Override
    public void fly() {
		System.out.println("Duck fly");		
    }

	@Override
	public void swim() {
		System.out.println("Duck swim");		
	}

	@Override
	public void eat() {
		System.out.println("Duck eat");
	}
}