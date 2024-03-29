package org.ait.project.guideline.example.modules.permission.model.entity.key;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.ait.project.guideline.example.modules.role.model.entity.Role;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@EqualsAndHashCode
public class PermissionId implements Serializable {
    private static final long serialVersionUID = -2363081794972428850L;

    private Integer menuId;
    @JoinColumn(name = "role_id")
    @ManyToOne
    private Role role;

}
