package com.umldesigner.submodules.UmlDesignerShared.schema.table.dto;

import java.util.ArrayList;
import java.util.List;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.UmlObjectPojo;
import com.umldesigner.submodules.UmlDesignerShared.schema.table_item.dto.SItemPojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class STablePojo extends UmlObjectPojo {

    protected String title;

    protected List<? extends SItemPojo> items = new ArrayList<>();

}