package com.physics30.ct.repository;

import com.physics30.ct.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE user SET password_sha=SHA1(CONCAT('8960c201fb3136ef', ?2, ?3)) WHERE id=?1", nativeQuery = true)
    void updatePasswordSha(long id, String login, String password);

    @Query(value = "SELECT * FROM user WHERE login=?1 AND password_sha=SHA1(CONCAT('8960c201fb3136ef', ?1, ?2))", nativeQuery = true)
    User findByLoginAndPassword(String login, String password);

    List<User> findAllByOrderByIdDesc();
}
