/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.UserInfo;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long>{

}
