package com.src.BookingPlaneTicket.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class TestAPI {
    @GetMapping("/test")
    public String index() {
        return "<h3>Hello World!asdjkasiofabfbasofâsasa</h3>";
    }
}
