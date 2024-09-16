package org.project.gestiontournoisjeuxvideo.repository;

import org.project.gestiontournoisjeuxvideo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
