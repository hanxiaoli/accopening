package jp.co.basenet.accopening.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.basenet.accopening.model.AccountOpeningApplicationFormModel;
import jp.co.basenet.accopening.model.view.RegulationsViewModel;

@Service
// @Transactional
public class RegulationsService {

	// private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RegulationsViewModel regulationsViewModel;

	@Autowired
	private AccountOpeningApplicationFormModel accountOpeningApplicationFormModel;

	public boolean checkAgreed() {
		accountOpeningApplicationFormModel
				.setRegulationsAgreed("checked".equals(regulationsViewModel.getChecked()) ? true : false);

		return accountOpeningApplicationFormModel.isRegulationsAgreed();
	}

}
