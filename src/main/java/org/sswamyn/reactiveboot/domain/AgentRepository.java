package org.sswamyn.reactiveboot.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AgentRepository extends CrudRepository<Agent, Long> {
    // Some methods to get data

    // Find by NAID
    List<Agent> findByNetworkID(String NAID);


    // Find by Agent Status
    List<Agent> findByAgtStatus(String status);
/*

    // Find NAID that are Open
    List<Agent> findByNetworkIDAndAgtStatus(String NAID, String status);

    // Let us go straight to a good old SQL query
    @Query("select agt from Agent where creditLimit > ?1")
    List<Agent> findByCreditLimitGreaterThan(int creditLimit);
*/

}
