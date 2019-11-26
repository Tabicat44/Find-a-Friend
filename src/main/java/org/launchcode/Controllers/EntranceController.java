package org.launchcode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="")
public class EntranceController {

    @RequestMapping(value="")
    public String entrance(Model model){ return "welcoming/entrance"; }

    @RequestMapping(value="option1")
    public String pick1Seniors(Model model){
        return "welcoming/seniors/option2";
    }

    @RequestMapping(value="option2")
    public String pick1Volunteers(Model model){
        return "welcoming/volunteers/option2";
    }

    @RequestMapping(value="seniorsRegisterLink")
    public String seniorsRegister(Model model){ return "welcoming/seniors/register"; }

    @RequestMapping(value="seniorsLogin")
    public String seniorsLogin(Model model){ return "welcoming/seniors/login"; }
}

/*





    @RequestMapping(value = "view/{theMenuId}", method = RequestMethod.GET)
    public String viewMenu(Model model, @PathVariable int theMenuId){
        Menu aNewMenu = menuDao.findById(theMenuId).get();

        model.addAttribute("menu", aNewMenu);
        model.addAttribute("title", aNewMenu.getName());


       model.addAttribute("title", aNewMenu.getTheMenuName());
        model.addAttribute("cheeses", aNewMenu.getCheeses());
        model.addAttribute("menuId", aNewMenu.getId());


        model.addAttribute(menuDao.findById(theMenuId));
        return "menu/view";
    }*/
