package dao;
import models.Hero;
import java.util.List;

public interface HeroDao {

    // LIST
    List<Hero> getAll();

    // CREATE
    void add(Hero hero);

    // READ
    Hero findById(int id);

    // UPDATE
    void assignSquad(int id, int squadId);


}
