package com.example.demo.repos;

import com.example.demo.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long>
{
    public List<Message> findByTag(String Tag);//метод, сформированный по правилам спринга(использует SQL запрос к базе данных)
}
