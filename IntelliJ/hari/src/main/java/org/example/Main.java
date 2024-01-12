package org.example;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            OkHttpClient client = new OkHttpClient();

            MediaType mediaType = MediaType.parse("application/json");
            JSONObject address = new JSONObject();
            address.put("line1", "India");
            address.put("city", "Toronto");

            JSONObject bodyJson = new JSONObject();
            bodyJson.put("address", address);

            RequestBody body = RequestBody.create(mediaType, bodyJson.toString());

            Request request = new Request.Builder()
                    .url("https://api.postgrid.com/v1/addver/verifications")
                    .post(body)
                    .addHeader("x-api-key", "test_sk_ey2qwVnYhyqNNJsmVFrqrM")
                    .addHeader("Content-Type", "application/json")
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

                String responseData = response.body().string();
                JSONObject jsonResponse = new JSONObject(responseData);
                JSONObject data = jsonResponse.getJSONObject("data");

                System.out.println(data.optString("status"));
                System.out.println(data.optString("line1"));
                System.out.println(data.optString("line2"));
                System.out.println(data.optString("city"));
                System.out.println(data.optString("provinceOrState"));
                System.out.println(data.optString("postalOrZip"));
                System.out.println(data.optString("country"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
