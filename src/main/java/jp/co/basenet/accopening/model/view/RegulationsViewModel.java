package jp.co.basenet.accopening.model.view;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class RegulationsViewModel {

	private String checked;

	/**
	 * @return the checked
	 */
	public String getChecked() {
		return checked;
	}

	/**
	 * @param checked
	 *            the checked to set
	 */
	public void setChecked(String checked) {
		this.checked = checked;
	}

}
