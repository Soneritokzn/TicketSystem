package com.example.TicketSystem.Service;


import com.example.TicketSystem.Entity.TicketSystem;
import com.example.TicketSystem.Repository.TicketSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketSystemService {
    @Autowired
    private TicketSystemRepository ticketSystemRepository;

    public List<TicketSystem>getAll(){
        return ticketSystemRepository.findAll(Sort.by(Sort.Order.asc("name")), Sort.Order.desc("id"));
    }

    public TicketSystem save(TicketSystem ticket) {
        return ticketSystemRepository.save(ticket);
    }

    public void delete(int id) {
        ticketSystemRepository.deleteById(id);
    }


}
