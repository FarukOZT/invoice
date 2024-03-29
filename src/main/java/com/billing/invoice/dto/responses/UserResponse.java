package com.billing.invoice.dto.responses;

import com.billing.invoice.entity.User;
import lombok.Data;

@Data
public class UserResponse {
	
	Long id;
	int avatarId;
	String userName;

	public UserResponse(User entity) {
		this.id = entity.getId();
		this.userName = entity.getUserName();
	} 
}
