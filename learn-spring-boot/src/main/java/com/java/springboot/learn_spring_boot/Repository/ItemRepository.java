package com.java.springboot.learn_spring_boot.Repository;

import com.java.springboot.learn_spring_boot.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
