package io.jay.springbooth2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SampleController {

    private final UserRepository repository;

    public SampleController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    public List<User> allUsers() {
        return repository.findAll()
                .stream()
                .map(UserEntity::toDomain)
                .collect(Collectors.toList());
    }
}
