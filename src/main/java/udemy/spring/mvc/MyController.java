package udemy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirst() {
        return "first";
    }

    @RequestMapping("askEmpDetails")
    public String askDetails() {
        return "ask-emp-details";
    }

    /*
    @RequestMapping("showEmpDetails")
    public String showDetails(HttpServletRequest request, Model model) {
        String empName = "Mr." + request.getParameter("employeeName");
        model.addAttribute("empName", empName);
        model.addAttribute("def", "- super");
        return "show-emp-details";
    }
    */

    @RequestMapping("showEmpDetails")
    public String showDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr." + empName;
        model.addAttribute("empName", empName);
        model.addAttribute("def", "- super");
        return "show-emp-details";
    }

}
