package jp.co.basenet.accopening.controller;

import java.util.Date;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jp.co.basenet.accopening.model.VerificationConfirm;
import jp.co.basenet.accopening.model.view.RegulationsViewModel;
import jp.co.basenet.accopening.service.UserSessionService;

@Controller
public class AccopeningController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserSessionService userSessionService;

	@Autowired
	private RegulationsViewModel regulationsViewModel;

	@Autowired
	private ModelMapper modelMapper;

	/**
	 * ルートリクエストコントローラー
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return String upload
	 */
	@GetMapping("/")
	public String accept(@ModelAttribute RegulationsViewModel regulationsViewModel) {
		userSessionService.accept();
		return "regulations";
	}
	
	/**
	 * ルートリクエストコントローラー
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return String upload
	 */
	@GetMapping("/test")
	public String test() {
		return "test";
	}

	/**
	 * ルートリクエストコントローラー
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return String upload
	 */
	@PostMapping("/agree-to-regulations")
	public String agreeToRegulations(@RequestParam Map<String, String> requestParams,
			@ModelAttribute RegulationsViewModel regulationsViewModel) {

		modelMapper.map(requestParams, this.regulationsViewModel);

		if (!"on".equals(this.regulationsViewModel.getChecked())) {
			regulationsViewModel = this.regulationsViewModel;

			return "regulations";
		}

		return "verification-upload";
	}

	/**
	 * ルートリクエストコントローラー
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return String upload
	 */
	@PostMapping("/verificationUpload")
	public String verificationUpload(@RequestParam("file") MultipartFile file,
			@ModelAttribute("verificationConfirm") VerificationConfirm verificationConfirm) {

		verificationConfirm.setName("ベース　太郎");
		verificationConfirm.setAddress("東京都千代田区千代田1-25-1");
		verificationConfirm.setSex("男");
		verificationConfirm.setBirthday(new Date());
		verificationConfirm.setExpiryDate(new Date());

		logger.error(file.getName());
		logger.error("verificationConfirm");
		return "verification-confirm.html";
	}

}
