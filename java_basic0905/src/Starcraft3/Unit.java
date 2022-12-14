package Starcraft3;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	// 마린을 공격합니다
	public void attack(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		// 질럿의 공격력 this.power
		marine.beAttacked(this.power);
	}

	// 저글링을 공격합니다.
	public void attack(Zergling zergling) {
		System.out.println(this.name + "이 " + zergling.getName() + "을 공격합니다.");
		zergling.beAttacked(this.power);
	}

	// 질럿을 공격합니다.
	public void attack(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다");
		zealot.beAttacked(this.power);
	}

	// 공격을 당합니다.
	public void beAttacked(int power) {

		this.hp -= power;
		if (hp <= 0) {
			System.out.println(this.name + "is dead");
			hp = 0;
		}
	}

	public void showInfo() {
		System.out.println("===정보창===");
		System.out.println("이름 : " + name);
		System.out.println("생명력 : " + hp);
		System.out.println("공격력 : " + power);
	}

}
