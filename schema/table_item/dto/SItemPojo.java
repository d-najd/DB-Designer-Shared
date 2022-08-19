package com.umldesigner.submodules.UmlDesignerShared.schema.table_item.dto;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.BasePojo;
import com.umldesigner.submodules.UmlDesignerShared.schema.table.dto.STablePojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SItemPojo extends BasePojo {

    // the pojo has no need to know positions
    // private Integer position;

    protected String type;
    
    protected String value;
    
    protected Integer size;
    
    protected String tableUuid_;
    
    protected STablePojo table;

    protected Boolean isPrimaryKey = false;

}