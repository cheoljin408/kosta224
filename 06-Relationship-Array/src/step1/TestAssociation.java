package step1;

public class TestAssociation {
	public static void main(String[] args) {
		String name = "������";
		Person p = new Person(name);
		System.out.println(p.getName());
		p.setName("����");
		System.out.println(p.getName());
	}
}
