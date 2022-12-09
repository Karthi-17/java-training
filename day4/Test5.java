package day4;

interface LandAnimal {
	public void land();
}

interface WaterAnimal {
	public void water();
}

class Amphibian implements LandAnimal,WaterAnimal {
	
	@Override
	public void land() {
		System.out.println("This animal can live on land");
	}
	
	@Override
	public void water() {
		System.out.println("This animal can live on water");
	}
}

class Test5 {

	public static void main(String[] args) {
		Amphibian frog = new Amphibian();
		frog.land();
		frog.water();
	}

}
