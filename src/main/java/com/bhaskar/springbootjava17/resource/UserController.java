package com.bhaskar.springbootjava17.resource;

import com.bhaskar.springbootjava17.records.Address;
import com.bhaskar.springbootjava17.records.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author venkata.mantrala
 */
@RestController
@RequestMapping("/")
public class UserController {

    @GetMapping
    public User getUser() {
        Address userAddress = new Address("1234 St", "Gilroy", "CA", "USA", 94025);
        return new User("Narayana", "Narayana.Auto@gmail.com", 12234, userAddress);
    }
}
