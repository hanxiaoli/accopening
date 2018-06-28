package jp.co.basenet.accopening.service;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.basenet.accopening.entity.UserSession;
import jp.co.basenet.accopening.model.UserSessionModel;
import jp.co.basenet.accopening.repository.UserSessionRepository;

@Service
@Transactional
public class UserSessionService {

	@Autowired
	private HttpServletRequest httpServletRequest;

	@Autowired
	private UserSessionModel userSessionModel;

	@Autowired
	private UserSessionRepository userSessionRepository;

	/**
	 * リクエストを受付、ディバイスやIPアドレスなどの情報を収集する
	 * 
	 * @param HttpServletRequest
	 *            request
	 */
	public void accept() {
		if (null == userSessionModel.getSessionId()) {
			userSessionModel.setSessionId(httpServletRequest.getSession().getId());
			userSessionModel.setUserAgent(httpServletRequest.getHeader("User-Agent"));
			userSessionModel.setLocale(httpServletRequest.getLocale().getLanguage());
			userSessionModel.setCreationTime(httpServletRequest.getSession().getCreationTime());
			userSessionModel.setRemoteAddr(httpServletRequest.getRemoteAddr());
		}

		userSessionRepository.save(new ModelMapper().map(userSessionModel, UserSession.class));
	}
}
