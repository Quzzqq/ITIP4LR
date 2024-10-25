import java.io.*;

public class CustomFileNotFoundException extends FileNotFoundException {

  public CustomFileNotFoundException(String fileName) {
    super(fileName);
  }

  public static void main(String[] args) {
    String fileName = "non_existfing_file.txt";

    try {
      readFile(fileName);
    } catch (CustomFileNotFoundException e) {
      System.err.println("Ошибка: Файл не найден: " + e.getMessage());
    } catch (IOException e) {
      System.err.println("Ошибка ввода-вывода: " + e.getMessage());
    }
  }

  public static void readFile(String fileName) throws CustomFileNotFoundException, IOException {
    try (FileReader reader = new FileReader(fileName)) {
      int character;
      while ((character = reader.read()) != -1) {
        System.out.print((char) character);
      }
    } catch (FileNotFoundException e) {
      throw new CustomFileNotFoundException(fileName);
    }
  }
}