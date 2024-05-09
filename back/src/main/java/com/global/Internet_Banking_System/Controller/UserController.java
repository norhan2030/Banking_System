package com.global.Internet_Banking_System.Controller;

import com.global.Internet_Banking_System.Entity.User;
import com.global.Internet_Banking_System.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
//اشغلو لما ارن الفرونت
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("")
    public ResponseEntity<?>findAll(){
       return ResponseEntity.ok( userService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id){
        return ResponseEntity.ok( userService.findById(id));
    }
    @GetMapping("/role")
    public ResponseEntity<List<User>>findUsersByRolesName(@RequestParam String roleName){
        return userService.findUsersByRolesName(roleName);
    }
}
