package com.devproject.moneyManager.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devproject.moneyManager.entities.ProfileEntity;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

    //select * from tbl_profiles where email = ?
    Optional<ProfileEntity> findByEmail(String email);
}
