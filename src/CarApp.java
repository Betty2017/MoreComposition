
public class CarApp {

	public static void main(String[] args) {
		Car c = new Car();
		
		
		Porsche p = new Porsche();
		Jetta j = new Jetta();
		System.out.println(p.start());
		System.out.println(j.start());
		System.out.println(p.accelerate());
		System.out.println(j.accelerate());
		System.out.println(j.emission());
		System.out.println(j.emissionPass());
		System.out.println(p.setSpeed());
		System.out.println(p.stop());
		System.out.println(j.passed());
		
		
		
		
		
}
}