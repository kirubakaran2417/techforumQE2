package polymorphism;

public class Change extends wedding{
	@Override
	void weddingDate() {
		System.out.println("30th feb");
	}

	public static void main(String[] args) {
		wedding c=new wedding();
		c.engagementDate();
		c.weddingDate();
	}
}
