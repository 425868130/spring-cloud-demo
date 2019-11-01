package com.example.authcenter.dao.user;

import com.example.authcenter.dao.sysRole.RoleWithPermission;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author xujw 2019-11-1 09:49:07
 * 带角色权限的用户类
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserWithRole extends User {
    private static final long serialVersionUID = -6102731252097125802L;

    private List<RoleWithPermission> roles;

    public UserWithRole(User user) {
        super(user);
    }

    public UserWithRole(User user, List<RoleWithPermission> roles) {
        super(user);
        this.roles = roles;
    }
}
