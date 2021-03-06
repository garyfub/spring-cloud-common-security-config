/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.common.security.support;

import java.net.URI;
import java.util.Properties;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties for the File based security authentication.
 *
 * @author Ilayaperumal Gopinathan
 */
public class FileSecurityProperties {

	private boolean enabled = false;

	private Properties users;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Properties getUsers() {
		return users;
	}

	/**
	 * Set users as {@link Properties}. Value (String) of the property must be in the
	 * format e.g.: {@code bobspassword, ROLE_NAME}.
	 *
	 * @param users the property object with user password and roles
	 */
	public void setUsers(Properties users) {
		this.users = users;
	}

}
