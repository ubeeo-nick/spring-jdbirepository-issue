package org.example.springjdbirepositoryissue;

import org.jdbi.v3.spring5.JdbiRepository;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@JdbiRepository
public interface TestRepository {

    @SqlQuery("SELECT 1")
    int test();
}
