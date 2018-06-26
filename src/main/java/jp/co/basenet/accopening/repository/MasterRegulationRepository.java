package jp.co.basenet.accopening.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.basenet.accopening.entity.MasterRegulation;
import jp.co.basenet.accopening.entity.MasterRegulationPK;

public interface MasterRegulationRepository extends JpaRepository<MasterRegulation, MasterRegulationPK> {

}
