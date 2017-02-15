package ua.com.controllers;

import ua.com.model.Mem;
import ua.com.repository.MemMongoRepository;
import ua.com.repository.MemSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by oleksii.holyk on 15.02.2017.
 */

@Controller
public class MemController {

    @Autowired
    MemMongoRepository memMongoRepository;

    @Autowired
    MemSearchRepository memSearchRepository;

    @RequestMapping("/memlendarItems")
    public String home(Model model) {
        model.addAttribute("memList", memMongoRepository.findAll());
        return "memlendarItems";
    }

    @RequestMapping(value = "/addMem", method = RequestMethod.POST)
    public String addMem(@ModelAttribute Mem mem) {
        memMongoRepository.save(mem);
        return "redirect:memlendarItems";
    }

    @RequestMapping(value = "/search")
    public String search(Model model, @RequestParam String search) {
        model.addAttribute("memList", memSearchRepository.searchMemes(search));
        model.addAttribute("search", search);
        return "memlendarItems";
    }

}
