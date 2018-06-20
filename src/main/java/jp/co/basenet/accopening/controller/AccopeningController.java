package jp.co.basenet.accopening.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jp.co.basenet.accopening.service.AccessInfoService;

@Controller
public class AccopeningController {

	@Autowired
	private AccessInfoService accessInfoService;

	/**
	 * ルートリクエストコントローラー
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @return String upload
	 */
	@GetMapping("/")
	public String acceptAccess(HttpServletRequest request) {
		accessInfoService.accept(request);
		return "/tmplates/upload.html";
	}

}
