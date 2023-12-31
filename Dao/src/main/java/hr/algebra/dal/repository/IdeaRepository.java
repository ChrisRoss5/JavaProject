package hr.algebra.dal.repository;

import java.util.List;
import java.util.Optional;

import hr.algebra.model.Idea;

public interface IdeaRepository {

  int createIdea(Idea idea) throws Exception;

  void createIdeas(List<Idea> ideas) throws Exception;

  void updateIdea(int id, Idea idea) throws Exception;

  void deleteIdea(int id) throws Exception;

  Optional<Idea> selectIdea(int id) throws Exception;

  List<Idea> selectIdeas() throws Exception;

}
