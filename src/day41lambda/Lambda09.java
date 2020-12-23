package day41lambda;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lambda09 {

	public static void main(String[] args) throws IOException {
		
		//FileForLambda dosyasini okuyunuz.(Console'a yazdiriniz)
		Files.lines(Paths.get("src/lambdatr/FileForLambda")).forEach(System.out::println);
		
		//FileForLambda dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
		Files.lines(Paths.get("src/lambdatr/FileForLambda")).map(String::toUpperCase).forEach(System.out::println);

	}

}
