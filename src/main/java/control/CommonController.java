package control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lzz on 17/4/26.
 */
@Controller
public class CommonController {
    @RequestMapping("/list")
    public String list(Model model) {
        return "list";
    }

    @RequestMapping("/history")
    public String hisotry(Model model) {
        return "history";
    }
    @RequestMapping("/statistics")
    public String statistics(Model model) {
        return "statistics";
    }
}
