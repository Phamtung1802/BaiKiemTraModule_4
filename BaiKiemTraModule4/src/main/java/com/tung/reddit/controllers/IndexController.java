package com.tung.reddit.controllers;

import com.tung.reddit.models.City;
import com.tung.reddit.models.Country;
import com.tung.reddit.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {

    @Autowired
    private CityService cityServiceImpl;

    @Autowired
    private CountryService countryServiceImpl;


    @GetMapping("/")
    public ModelAndView showIndex(){
        ModelAndView mov=new ModelAndView("index");
        Iterable<City> cities=cityServiceImpl.findAll();
        Iterable<Country> countries=countryServiceImpl.findAll();
        mov.addObject("countries",countries);
        mov.addObject("cities",cities);
        mov.addObject("city",new City());
        return mov;
    }
    @PostMapping("/create")
    public ModelAndView createNewCity(@ModelAttribute City city){
        cityServiceImpl.save(city);
        ModelAndView mov=new ModelAndView("redirect:/");
        return mov;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView createNewCity(@PathVariable Long id){
        City city=cityServiceImpl.findFirstById(id);
        cityServiceImpl.delete(city);
        ModelAndView mov=new ModelAndView("redirect:/");
        return mov;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editCity(@PathVariable Long id){
        City city=cityServiceImpl.findFirstById(id);
        Iterable<Country> countries=countryServiceImpl.findAll();

        ModelAndView mov=new ModelAndView("edit");
        mov.addObject("city",city);
        mov.addObject("countries",countries);
        return mov;
    }
    @PostMapping("/edit/{id}")
    public String editOk(@ModelAttribute("city") City city, BindingResult bindingResult, Model model, RedirectAttributes redirect){
        cityServiceImpl.save(city);
        return "redirect:/";
    }

    @GetMapping("/show/{id}")
    public String showCity(@PathVariable Long id,Model model){
        City city=cityServiceImpl.findFirstById(id);
        model.addAttribute("city",city);
        return "show";
    }



}
