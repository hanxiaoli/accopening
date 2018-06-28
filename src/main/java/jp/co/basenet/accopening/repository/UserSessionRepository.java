package jp.co.basenet.accopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.basenet.accopening.entity.UserSession;

public interface UserSessionRepository extends JpaRepository<UserSession, String> {

}
