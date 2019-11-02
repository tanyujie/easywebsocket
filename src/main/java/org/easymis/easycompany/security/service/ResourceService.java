package org.easymis.easycompany.security.service;

import org.easymis.easycompany.security.userdetail.Resource;

public interface ResourceService {
	Resource  getOne(String requestURI);
	Resource findByEndPoint(String endPoint);
}
