/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("reward")
public class rewardController {
     @RequestMapping("")
    public String reward(HttpSession session){
        session.setAttribute("webName","Reward");
        return "Reward";
    }
}
