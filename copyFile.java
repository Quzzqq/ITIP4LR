import java.io.*;

public class copyFile {
    public static void main(String[] args) {
        try (FileReader readFile = new FileReader("firstFile.txt");
         FileWriter writeFile = new FileWriter("secondFile.txt")) {
            int character;
            while ((character = readFile.read()) != -1){
                writeFile.write(character);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при чтении или записи файла: " + e.getMessage());
        } catch (SecurityException e) {
            System.err.println("Ошибка доступа к файлу: " + e.getMessage());
        }
    }
}
