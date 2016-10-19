package ie.cit.assignment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int choiceentry;

		do {
			System.out.println("Enter \"1\", \"2\" or \"3\"");
			choiceentry = br.read();

			switch (choiceentry) {
				case 1:
					System.out.println("Typed : " + choiceentry);
					break;
				case 2:
					System.out.println("Typed : " + choiceentry);
					break;
				case 3:
					System.out.println("Typed : " + choiceentry);
					break;
				default:
					System.out.println("Choice must be a value between 1 and 3.");
			}
		} while (choiceentry != 3);
	}
}
