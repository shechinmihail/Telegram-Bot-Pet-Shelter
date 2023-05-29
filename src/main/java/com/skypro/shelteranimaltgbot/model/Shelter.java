package com.skypro.shelteranimaltgbot.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String userName;

    /**
     * коллекция животных
     */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "shelter_id")
    private Set<Pet> pets;

    @Column(columnDefinition = "text")
    private String about;

    public Shelter() {
    }

    public Shelter(String name, String userName, String about) {
        this.name = name;
        this.userName = userName;
        this.about = about;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shelter shelter = (Shelter) o;
        return Objects.equals(id, shelter.id) && Objects.equals(name, shelter.name) && Objects.equals(userName, shelter.userName) && Objects.equals(about, shelter.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, userName, about);
    }

    @Override
    public String toString() {
        return "Shelter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", about='" + about + '\'' +
                '}';
    }
}
