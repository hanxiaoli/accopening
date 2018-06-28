package jp.co.basenet.accopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.basenet.accopening.entity.RegulationMaster;
import jp.co.basenet.accopening.entity.RegulationMasterPK;

public interface RegulationMasterRepository extends JpaRepository<RegulationMaster, RegulationMasterPK> {

}
