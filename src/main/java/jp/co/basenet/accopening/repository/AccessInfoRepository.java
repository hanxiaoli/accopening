package jp.co.basenet.accopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.basenet.accopening.entity.AccessInfo;
import jp.co.basenet.accopening.entity.AccessInfoPK;

public interface AccessInfoRepository extends JpaRepository<AccessInfo, AccessInfoPK> {

}
