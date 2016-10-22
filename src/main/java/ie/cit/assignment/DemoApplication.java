package ie.cit.assignment;

import ie.cit.assignment.domain.Citizen;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Import(Config.class)
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		menu();
	}

	public void menu() throws IOException {
		Scanner br = new Scanner(System.in);
		int choiceentry = -1;
		String name = "";
		double salary = 0;
		Citizen citizen = new Citizen();

		do {
			for (int i = 0; i < 3; i++) {
				System.out.println("");
			}
			System.out.println("Enter number \n\"1.List all citizen with their salary and take home pay\"\n\"2.Enter new citizen\"\n\"3.Change band rates and taxes\"\n" +
					"\"4.Exit\"");
			if (br.hasNextInt())
				choiceentry = br.nextInt();

			switch (choiceentry) {
				case 1:
					System.out.println("Typed : " + choiceentry);
					break;
				case 2:
					br.nextLine();
					System.out.println("Enter name:");
					citizen.setName(br.nextLine());
					System.out.println("Enter salary:");
					citizen.setSalary(br.nextDouble());
					System.out.println("Citizen with name: " + citizen.getName() + " and salary: " + citizen.getSalary() + " has been added");

					break;
				case 3:
					System.out.println("Exit thanks for using the TAX SYSTEM");
					break;
				default:
					System.out.println("Choice must be a value between 1 and 3.");
			}
		} while (choiceentry != 3);
	}
}
