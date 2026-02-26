package com.chitalebandhu.chitalebandhu.repository;

import com.chitalebandhu.chitalebandhu.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {

}
