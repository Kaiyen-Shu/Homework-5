import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Sample_GPT3 {
    public static void main(String[] args) {
        String urlString = "https://jsonplaceholder.typicode.com/posts/1";

        try {
            // 建立 URL 物件
            URL url = new URL(urlString);

            // 開啟連接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // 檢查回應碼
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // 讀取回應
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine).append("\n");
                }
                in.close();

                // 列印回應內容
                System.out.println("Response Content:");
                System.out.println(content);
            } else {
                System.out.println("GET request failed. Response Code: " + responseCode);
            }

            connection.disconnect();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
