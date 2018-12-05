package com.wenhao.microservice.microserviceproviderusermymetadata.dao;

import com.wenhao.microservice.microserviceproviderusermymetadata.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
