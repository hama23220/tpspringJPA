package com.example.tpspringjpa.Controller;

import com.example.tpspringjpa.Services.ClubService;
import com.example.tpspringjpa.model.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/club")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping("/all")
    private Iterable<Club> getAllClub()
    {
        return clubService.getAllclub();
    }

    @GetMapping("/find/{id}")
    private Optional<Club> getClubByid(@PathVariable("id") int id)
    {
        return clubService.getclubByid(id);
    }

    @PostMapping("/add")
    private int saveClub(@RequestBody Club club)
    {
        clubService.saveclub(club);
        return club.getId();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteClub(@PathVariable("id") Integer id){
        clubService.deleteclub(id);
    }

}
