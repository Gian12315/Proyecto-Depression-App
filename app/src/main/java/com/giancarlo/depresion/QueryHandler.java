package com.giancarlo.depresion;

import android.speech.tts.TextToSpeech;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class QueryHandler {
    private static final String prompt = "You are a counselor, and you're tasked to give emotional support to everyone, " +
            "you are comprehensive, understanding, and caring, and suggesting professional help while being brief and always answer " +
            "in Spanish and never, never never translate to English, considering your role answer to the following prompt :";

    private String url;

    public QueryHandler (String url) {
        this.url = url;
    }

    public String constructURL(String query) {
        return url + "?query=" + (prompt + URLEncoder.encode(query));
    }


}
