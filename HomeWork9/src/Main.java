import java.io.*;

public class Main {
    public static void main(String[] args) {
        String dirPath = "C:\\Users\\Ulyana\\IdeaProjects\\HomeWork9\\src\\files";

        File directory = new File(dirPath);
        File[] files = directory.listFiles();

        if(files != null){
            try{
                FileWriter writer = new FileWriter("result.txt", true);
                for (File file : files){
                    if (file.isFile()){
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                        String line;

                        while ((line =  bufferedReader.readLine()) != null){
                            writer.write(line);
                        }
                        bufferedReader.close();
                    }
                }
                writer.close();
                System.out.println("Файл 'result.txt' успешно создан и заполнен содержимым файлов");
            }catch (IOException e){
                System.out.println("Ошибка при записи в файл 'resul.txt': " + e.getMessage());
            }
        }else {
            System.out.println("Указанный каталог не существует");
        }
    }
}