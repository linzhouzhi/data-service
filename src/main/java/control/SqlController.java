package control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lzz on 17/4/26.
 */
@Controller
public class SqlController {
    @RequestMapping("/sql/addSql")
    public String addSql(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "add_sql";
    }

    @RequestMapping("/sql/mixQuery")
    public String mixQuery(){
        return "mix_query";
    }
}
