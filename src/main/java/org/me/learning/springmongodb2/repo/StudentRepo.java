package org.me.learning.springmongodb2.repo;

import org.me.learning.springmongodb2.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {

    Optional<Student> findByEmail(String email);
}
