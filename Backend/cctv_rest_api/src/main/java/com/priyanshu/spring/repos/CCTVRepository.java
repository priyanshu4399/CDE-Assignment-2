package com.priyanshu.spring.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.priyanshu.spring.entities.CCTV;

@Repository
public interface CCTVRepository extends JpaRepository<CCTV, Long>{

}
