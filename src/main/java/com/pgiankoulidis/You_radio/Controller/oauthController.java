package com.pgiankoulidis.you_radio.controller;

import java.util.List;

//import com.pgiankoulidis.You_radio.Model.createRadio;
//import com.pgiankoulidis.You_radio.Model.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Controller
@ComponentScan("com.pgiankoulidis.you_radio.model")
public class oauthController {
    @Autowired
    createRadio cr;

    @Autowired
    song songs;

    @RequestMapping("/logings")
    public String indexed(){
        return "googleSI";
    }

    @RequestMapping("/newRadio")
    public ModelAndView createRadio(@RequestParam String query){
        ModelAndView mv = new ModelAndView();
        List<song> listOfSongs = cr.radioSongs(query);
        mv.addObject("songs", listOfSongs);
        cr.saveRadioSongs(listOfSongs);
        mv.setViewName("succ");
        return mv;
    }

    @RequestMapping("/activ")
    public String profile(){
        return "index";
    }

    @RequestMapping("/firbas")
    public String googl(){
	return "succ";
    }

    @RequestMapping("/login")
    public String succ(){
        return "login";
    }
}
