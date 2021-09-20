package com.company;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		DarkElf darkElf = new DarkElf();
		Dragon dragon = new Dragon();
		Human human = new Human();
		Orc orc = new Orc();
		Elf elf = new Elf();
		Dwarf dwarf = new Dwarf();
		Scanner sc = new Scanner(System.in);


		System.out.println(" 1)Human\n 2)Elf \n 3)Dwarf \n 4)Orc \n 5)Dark Elf \n 6)Dragon \n");
		System.out.print("Choose a race: ");
		int number = sc.nextInt();


		if (number == 1) {
			human.display();
			human.perfeatures();
			human.permagic();
//			human.setMagic(new FireBall());
//			human.permagic();
		}
		else if (number == 2) {
			elf.display();
			elf.perfeatures();
			elf.permagic();
		}
		else if (number == 3) {
			dwarf.display();
			dwarf.perfeatures();
			dwarf.permagic();
		}
		else if (number == 4) {
			orc.display();
			orc.perfeatures();
			orc.permagic();
		}
		else if (number == 5) {
			darkElf.display();
			darkElf.perfeatures();
			darkElf.permagic();
		}
		else if (number == 6) {
			dragon.display();
			dragon.perfeatures();
			dragon.permagic();
		}
		else {
			System.out.println("You've been doing the wrong thing");
		}
	}
}
