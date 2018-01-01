package com.payleaf.support.models.data;

import com.payleaf.support.models.Issue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IssueDao extends CrudRepository<Issue, Integer> {
}
