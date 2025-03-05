package org.thakur.helloworld.controllers;

import org.springframework.web.bind.annotation.*;
import org.thakur.helloworld.models.Player;

import java.util.*;

@RestController
@RequestMapping("/player")
public class PlayerController {
    private final List<Player> players = new LinkedList<>();

    @GetMapping("/all")
    public List<Player> getPlayers() {
        return players;
    }

    @PostMapping("/new")
    public String addPlayers(@RequestBody List<String> playerNames) {
        players.addAll(
          playerNames.stream().map(Player::new).toList()
        );
        return "Added successfully";
    }

    @DeleteMapping
    public String deletePlayer(@RequestParam String name) {
        final boolean didDelete = players.removeIf(p -> p.name().equalsIgnoreCase(name));
        return didDelete ? "Deleted." : "Not found";
    }
}
