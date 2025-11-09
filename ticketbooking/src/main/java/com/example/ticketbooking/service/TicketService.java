package com.example.ticketbooking.service;

import com.example.ticketbooking.model.Ticket;
import com.example.ticketbooking.repository.TicketRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TicketService {

    private final TicketRepository repo;

    public TicketService(TicketRepository repo) {
        this.repo = repo;
    }

    public List<Ticket> getAllTickets() {
        return repo.findAll();
    }

    public Ticket saveTicket(Ticket ticket) {
        return repo.save(ticket);
    }

    public Optional<Ticket> updateTicket(Long id, Ticket newTicket) {
        return repo.findById(id).map(t -> {
            t.setName(newTicket.getName());
            t.setEvent(newTicket.getEvent());
            t.setSeats(newTicket.getSeats());
            t.setDate(newTicket.getDate());
            return repo.save(t);
        });
    }

    public void deleteTicket(Long id) {
        repo.deleteById(id);
    }
}
