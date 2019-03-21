package rest;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

public class Translator {
    final static String URL = "https://translate.yandex.net/api/v1.5/tr.json/translate";
    final static String API_KEY = "trnsl.1.1.20190315T134337Z.b608a69a8e901609.96642647b8fd5f3550c286924bc17b4f04236bab";
    final static String LANG = "en-ru";


    public static String translate(String sourceText) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(URL + "?key=" + API_KEY + "&lang=" + LANG + "&text=" + sourceText)
                .build();
        Call call = client.newCall(request);

        Response response = call.execute();
        JSONObject jsonObject = new JSONObject(response.body().string());

        return ((JSONArray) jsonObject.get("text")).getString(0);
    }
}
