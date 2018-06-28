package jp.co.basenet.accopening.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.basenet.accopening.model.AccountOpeningApplicationFormModel;
import jp.co.basenet.accopening.model.UserSessionModel;
import jp.co.basenet.accopening.model.view.RegulationsViewModel;
import jp.co.basenet.accopening.repository.UserSessionRepository;

@Service
// @Transactional
public class RegulationsService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserSessionModel userSessionModel;

	@Autowired
	private RegulationsViewModel regulationsViewModel;

	@Autowired
	private UserSessionRepository userSessionRepository;

	@Autowired
	private AccountOpeningApplicationFormModel accountOpeningApplicationFormModel;

	public boolean checkAgreed() {

		logger.info("hanxiaoli:" + regulationsViewModel.getChecked());

		accountOpeningApplicationFormModel
				.setRegulationsAgreed("checked".equals(regulationsViewModel.getChecked()) ? true : false);

		return accountOpeningApplicationFormModel.isRegulationsAgreed();
	}

}
