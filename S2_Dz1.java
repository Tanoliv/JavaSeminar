package Seminar1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class S2_Dz1 {
    public static void main(String[] args) throws IOException {
        /**
         * В файле содержится строка с исходными данными в такой форме:
        {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
        SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
         */

        // Читаем файл используем функцию StringBuilder
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("book1.txt"))) {
            String data;
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        Map<String, String> diction = new HashMap<String, String>();
        // Убираем символы '{', '}' создаем словарь
        String[] keys = sb.toString().replace("{", "").replace("}", "").split(",");
        for (String data : keys) {
            String[] keyValue = data.split(":");
            String key = keyValue[0];
            String value = keyValue[1];
            diction.put(key, value);
        }
        System.out.println(diction);
        // Из словаря создаем запрос в форме sql, результат выводим в терминал
        String name = diction.get("name");
        String country = diction.get("country");
        String city = diction.get("city");
        System.out.printf("SELECT * FROM students WHERE name = %s AND country = %s AND city = %s", name,
                country, city);
    }
}