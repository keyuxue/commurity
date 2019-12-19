package life.majiang.commurity.commurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/index")
    public String first(@RequestParam(name = "name") String name, Model model) {
        // Ctrl  m   p 显示参数
        model.addAttribute("name",name);
        return "first";

    }
}
