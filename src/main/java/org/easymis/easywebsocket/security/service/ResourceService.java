package org.easymis.easywebsocket.security.service;

import org.easymis.easywebsocket.security.userdetail.Resource;

public interface ResourceService {
	Resource  getOne(String requestURI);
	Resource findByEndPoint(String endPoint);
}
