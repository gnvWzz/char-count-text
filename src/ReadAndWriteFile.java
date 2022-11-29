import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> chars = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            int character;
            while ((character = (br.read())) != -1) {
                chars.add(character);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại or nội dung có lỗi!");
        }
        return chars;
    }

    public void writeFile(String filePath, int quantity){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Số lượng ký tự trong text là: " + quantity);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
