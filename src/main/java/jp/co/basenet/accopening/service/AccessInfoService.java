package jp.co.basenet.accopening.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.basenet.accopening.entity.AccessInfo;
import jp.co.basenet.accopening.repository.AccessInfoRepository;

@Service
@Transactional
public class AccessInfoService {

	@Autowired
	private AccessInfoRepository accessInfoRepository;

	/**
	 * リクエストを受付、ディバイスやIPアドレスなどの情報を収集する
	 * 
	 * @param HttpServletRequest
	 *            request
	 */
	public void accept(HttpServletRequest request) {

		AccessInfo accessInfo = new AccessInfo();
		accessInfo.setSessionId(request.getSession().getId());
		accessInfo.setSessionCreateTime(request.getSession().getCreationTime());
		accessInfo.setIpAddress(request.getRemoteAddr());
		accessInfo.setLocale(request.getLocale().getLanguage());
		accessInfo.setUserAgent(request.getHeader("User-Agent"));

		accessInfoRepository.save(accessInfo);
	}
}
