package com.example.tpspringjpa.Services;

import com.example.tpspringjpa.Repository.ClubRepository;
import com.example.tpspringjpa.model.Classroom;
import com.example.tpspringjpa.model.Club;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public Optional<Club> getclubByid(final Integer id){
        return clubRepository.findById(id);
    }

    public Iterable<Club> getAllclub (){
        return clubRepository.findAll();
    }

    public void deleteclub  (final Integer id){
        clubRepository.deleteById(id);
    }

    public Club saveclub (Club club){
        clubRepository.save(club);
        return club;
    }

    public void update (Club club, Integer id){
        clubRepository.save(club);
    }
    
}
