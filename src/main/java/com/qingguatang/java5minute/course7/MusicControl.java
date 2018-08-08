package com.qingguatang.java5minute.course7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MusicControl {
    private static final Map<String,String> musics = new HashMap<>();


    @RequestMapping(value = "/song/music")
    @ResponseBody
    public String getMusicSrc(String songId){
        return musics.get(songId);

    }


    @PostConstruct
    public void init(){

        musics.put("35847388","https://m10.music.126.net/20180808193319/fcf34518527e96ae5811b553c2ebefd5/ymusic/de9a/6885/e183/effb8f74546c98fd619d51f22e2bfaaf.mp3");
        musics.put("16435049","https://m10.music.126.net/20180808195240/d823d7d81204783bbf0c3287adfeb933/ymusic/0cce/0768/52ed/db86bd40d6ba02bc4dc09cc942216662.mp3");
    }

}
