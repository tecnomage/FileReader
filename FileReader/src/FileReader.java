import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("arquivo.txt");
			Scanner entrada = new Scanner(is);

			System.out.println("Digite sua mensagem:");
			while (entrada.hasNextLine()) {
				String[] entradaDelimitada = entrada.nextLine().split("/"); 
				for (String string : entradaDelimitada) {
					System.out.println(string);
				}
				
				
				//System.out.println(entrada.nextLine() + "\n");
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
