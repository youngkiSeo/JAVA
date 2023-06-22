package com.green.todoapp2;

import com.green.todoapp2.model.TodoFinishYnDto;
import com.green.todoapp2.model.TodoInsDto;
import com.green.todoapp2.model.TodoVo;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

@RestController
@RequestMapping("/api/todo2")
public class TodoController {
    private final TodoService service;
    @Autowired
    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseBody
    public int postTodo(@RequestBody TodoInsDto dto){
        return service.insTodo(dto);
    }

    @GetMapping
    public List<TodoVo> getTodo(){
        return service.selTodo();
    }

    @PatchMapping
    public int patchTodo(@RequestBody TodoFinishYnDto dto){
        return service.updFinish(dto);
    }
    @DeleteMapping
    public int delTodo(@RequestBody int itodo){
        return service.delyn(itodo);
    }

    @GetMapping("/test")
    public String callapihttp(@RequestParam String str) throws JSONException {
        StringBuffer result = new StringBuffer();
        StringBuffer sbf = new StringBuffer();
        String jsonPrintString = null;
        String strurl= URLEncoder.encode(str);
        String strurl2= URLEncoder.encode("도서");
        sbf.append("https://www.nl.go.kr/NL/search/openApi/search.do?key=20c6b5bcd4ef4e19948eb0be9dd73ab096f12c273a56cae1bcaa9fb3193c4f7d");
        sbf.append("&kwd="+strurl);
        sbf.append("&pageSize=500&pageNum=1");
        sbf.append("&category="+strurl2);

        try {
            //String apiUrl = "https://www.nl.go.kr/NL/search/openApi/search.do?key=a29b041386e3197429c36f81b0dc7354c5154ee69f0c2279234a9048c54cdce2&kwd=%ED%86%A0%EC%A7%80";
            URL url = new URL(sbf.toString());
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.connect();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream, "UTF-8"));
            String returnLine;
            while((returnLine = bufferedReader.readLine()) != null) {
                result.append(returnLine);
            }
            JSONObject jsonObject = XML.toJSONObject(result.toString());
            jsonPrintString = ((JSONObject) jsonObject).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonPrintString;
    }
}
