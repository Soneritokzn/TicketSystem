package com.example.TicketSystem.Controller;


import com.example.TicketSystem.Entity.TicketSystem;
import com.example.TicketSystem.Service.TicketSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TicketSystemController {
    @Autowired
    private TicketSystemService ticketSystemService;

    @GetMapping("/")
    public String getAll(Model model){
        List<TicketSystem>ticketSystemList = ticketSystemService.getAll();
        model.addAttribute("ticketSystemList", ticketSystemList);
        model.addAttribute("ticketSystemSize",ticketSystemList.size());


    return "index"; }

    @RequestMapping("/delete/{id}")
    public String deleteTicket(@PathVariable int id) {
        ticketSystemService.delete(id);
        return "redirect:/";
    }

    @PostMapping("/add")
    public String addTicket(@ModelAttribute ticketSystem) {
        ticketSystemService.save());
        return "redirect:/";
    }





}
