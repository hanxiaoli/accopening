package jp.co.basenet.accopening.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jp.co.basenet.accopening.model.VerificationConfirm;
import jp.co.basenet.accopening.model.VerificationUpload;
import jp.co.basenet.accopening.service.AccessInfoService;

@Controller
public class AccopeningController {

	private final Logger logger = LoggerFactory.getLogger(AccopeningController.class);

	@Autowired
	private AccessInfoService accessInfoService;

	@Autowired
	private VerificationUpload verificationUpload;

	@Autowired
	private VerificationConfirm verificationConfirm;

	/**
	 * ルートリクエストコントローラー
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return String upload
	 */
	@GetMapping("/")
	public String acceptAccess(HttpServletRequest request, Model model) {
		if (null == request.getSession().getId()) {
			accessInfoService.accept(request);
		}

		model.addAttribute("name", "abc");
		request.setAttribute("name", "123");
		logger.info("");
		return "regulations";
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
