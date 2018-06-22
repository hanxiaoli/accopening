package jp.co.basenet.accopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.basenet.accopening.entity.AccessInfo;

public interface AccessInfoRepository extends JpaRepository<AccessInfo, String> {

}
