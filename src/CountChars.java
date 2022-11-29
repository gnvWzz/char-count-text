import java.util.List;

public class CountChars {
    public static int countChars(List<Integer> chars) {
        int count = 0;
        int spaceAscii = 32;
        for (Integer i : chars) {
            if (i != spaceAscii) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> chars = readAndWriteFile.readFile("C:\\Users\\quang\\Desktop\\demo\\characters.txt");
        int countChars = countChars(chars);
        readAndWriteFile.writeFile("C:\\Users\\quang\\Desktop\\demo\\result.txt", countChars);
    }
}
