package com.example.TicketSystem.Repository;


import com.example.TicketSystem.Entity.TicketSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketSystemRepository extends JpaRepository<TicketSystem, Integer> {
}
