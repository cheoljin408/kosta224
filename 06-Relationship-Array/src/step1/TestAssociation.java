package step1;

public class TestAssociation {
	public static void main(String[] args) {
		String name = "아이유";
		Person p = new Person(name);
		System.out.println(p.getName());
		p.setName("코코");
		System.out.println(p.getName());
	}
}
