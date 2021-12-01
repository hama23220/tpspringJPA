package com.example.tpspringjpa.Repository;

import com.example.tpspringjpa.model.Club;
import com.example.tpspringjpa.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ClubRepository extends CrudRepository<Club, Integer> {

    @Query("select c, count(c.students) from Club c group by c.students")
    Iterable<Object[]> studentsPerClub();

    @Query("select count(c) from Club c where c = :club")
    Long studentCountPerClub(@Param("club") Club club);

    @Query("select c from Club c having max (c.students)")
    Club bestclub();

    @Query("select c from Club c having min (c.students)")
    Club worstClub();

    @Query("select c from Club c where :s in (c.students)")
    Iterable<Club> findClubByStudents(@Param("s") Student s);
}
