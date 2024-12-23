package com.sparta.team7instagram.domain.user.repository;

import com.sparta.team7instagram.domain.user.entity.FollowEntity;
import com.sparta.team7instagram.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FollowRepository extends JpaRepository<FollowEntity, Long> {
    Optional<FollowEntity> findByFollowerAndFollowing(UserEntity follower, UserEntity following);

}
