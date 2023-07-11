package com.ling.springrolejwt.service;

import com.ling.springrolejwt.model.Role;

public interface RoleService {
    Role findByName(String name);
}
