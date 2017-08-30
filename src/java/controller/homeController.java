
package controller;

import DAO.employeeDAO;
import bean.Employee;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class homeController {
    @RequestMapping("")
    public String home(HttpSession session){
        session.setAttribute("webName","Dashboard");
        return "Dashboard";
    }
    
    
    
    
    
   
    
    
    
    
}
