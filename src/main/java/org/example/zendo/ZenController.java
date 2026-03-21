package org.example.zendo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ZenController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Zendo";
    }
}