package com.codegym.repository;

import com.codegym.model.Post;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class PostRepositoryImpl implements PostRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Post> findAll() {
        TypedQuery<Post> query = entityManager.createQuery("Select p from Post p", Post.class);
        return query.getResultList();
    }

    @Override
    public Post findById(Long id) {
        TypedQuery<Post> query = entityManager.createQuery("Select p from Post p where p.id =:id", Post.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }

    @Override
    public void save(Post model) {
        if (model.getId() != null) {
            entityManager.merge(model);
        } else {
            entityManager.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Post post = findById(id);
        if (post != null) {
            entityManager.remove(post);
        }
    }
}
