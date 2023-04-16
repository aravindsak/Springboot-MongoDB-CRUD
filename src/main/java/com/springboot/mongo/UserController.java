package com.springboot.mongo;


import java.util.List;
import com.springboot.mongo.user.User;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public ResponseEntity<String> save(
            @RequestBody User user
    ) {
        return ResponseEntity.ok(service.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{user-id}")
    public ResponseEntity<User> findById(
            @PathVariable("user-id") String UserId
    ) {
        return ResponseEntity.ok(service.findById(UserId));
    }

    @DeleteMapping("/{user-id}")
    public ResponseEntity<Void> delete(
            @PathVariable("user-id") String userId
    ) {
        service.delete(userId);
        return ResponseEntity.accepted().build();
    }

}
