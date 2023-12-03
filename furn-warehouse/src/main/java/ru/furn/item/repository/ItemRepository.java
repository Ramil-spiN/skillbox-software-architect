package ru.furn.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.furn.item.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
