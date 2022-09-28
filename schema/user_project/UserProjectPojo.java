package com.umldesigner.submodules.UmlDesignerShared.schema.user_project;

import java.util.Set;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.BasePojo;
import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.utils.MyCloneable;
import com.umldesigner.submodules.UmlDesignerShared.schema.table.dto.STablePojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserProjectPojo extends BasePojo implements MyCloneable<UserProjectPojo> {

    protected String title;
    
    protected Set<STablePojo> tables;

    @Override
    public UserProjectPojo clone() {
        try {
            return (UserProjectPojo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}