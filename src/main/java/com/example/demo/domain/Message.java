package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//дает понять спрингу, что это сущность, которую необходимо сохранять в базе данных
public class Message {

   @Id//идентификатор записи в таблице
   @GeneratedValue(strategy = GenerationType.AUTO)//автогенерация идентификаторов
    private Integer id;

   private String text;
   private String tag;

    public Message() {  //обязательно нужно создавать пустой конструктор в @Entity, иначе "все сломается"!!!!!!
    }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    public String getText() {
        return text;
    }

    public String getTag() {
        return tag;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
