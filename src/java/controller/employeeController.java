
package controller;

import DAO.employeeDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class employeeController {
    employeeDAO dao=new employeeDAO();
    @RequestMapping("")
    public String employee(HttpSession session){
        session.setAttribute("webName","Employee");
        employeeDAO dao=new employeeDAO();
        session.setAttribute("empre", dao.getListNhanVien());
        return "Employee";
    }
    
    @RequestMapping("edit")
    public String edit(){
        return "EmployeeView";
    }
    @RequestMapping("delete")
    public String delete(HttpServletRequest request,HttpSession session){
        int manv = Integer.parseInt(request.getParameter("txtEmployeeID"));
        dao.deleteEmployee(manv);
        session.setAttribute("empre", dao.getListNhanVien());
        return "Employee";
    }
}
