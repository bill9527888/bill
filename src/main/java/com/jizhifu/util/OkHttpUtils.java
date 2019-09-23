package com.jizhifu.util;

import okhttp3.*;
import okhttp3.OkHttpClient.Builder;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class OkHttpUtils {

    private static OkHttpClient okHttpClient = new Builder()
            .connectTimeout(15000, TimeUnit.MILLISECONDS)
            .readTimeout(60000, TimeUnit.MILLISECONDS)
            .build();


    public static String get(String utl) throws IOException {
        return okHttpClient.newCall(new Request.Builder()
                .url(utl)
                .get()//默认就是GET请求，可以不写
                .build())
                .execute()
                .body()
                .string();
    }

    public static String get(String utl, Map<String, String> params) throws IOException {

        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(utl)).newBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            urlBuilder.addQueryParameter(entry.getKey(), entry.getValue());
        }

        return okHttpClient.newCall(new Request.Builder()
                .url(urlBuilder.build())
                .get()//默认就是GET请求，可以不写
                .build())
                .execute()
                .body()
                .string();
    }

    public static String post(String utl, String jsonObject) throws IOException {
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody requestBody = RequestBody.create(mediaType, jsonObject);

        return okHttpClient.newCall(new Request.Builder()
                .url(utl)
                .post(requestBody)//默认就是GET请求，可以不写
                .build())
                .execute()
                .body()
                .string();
    }
}
