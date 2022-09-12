package com.umldesigner.submodules.UmlDesignerShared.schema.table.dto;

import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.pojos.UmlObjectPojo;
import com.umldesigner.submodules.UmlDesignerShared.infrastructure.pojo.utils.MyCloneable;
import com.umldesigner.submodules.UmlDesignerShared.schema.table_item.dto.SItemPojo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class STablePojo extends UmlObjectPojo implements MyCloneable<STablePojo> {

    protected String title;

    protected List<? extends SItemPojo> items = new ArrayList<>();


    /**
     * making sure the items don't get set to null so that we don't get null exception when we try to get size
     * of the list for example
     */
    public void setItems(List<? extends SItemPojo> items) {
        if(items == null){
            items = new ArrayList<>();
        }
        this.items = items;
    }

    @Override
    public STablePojo clone() {
        try {
            STablePojo clone = (STablePojo) super.clone();

            // ? extends ... means that it F****** EXTENDS IT WHICH MEANS IT'S INSTANCE OF IT SHUT THE F*** UP
            @SuppressWarnings("unchecked")
            List<SItemPojo> items1 = (List<SItemPojo>) clone.getItems();
            List<SItemPojo> clonedItems = new ArrayList<>();

            for (SItemPojo item : items1) {
                item.setTable(null);

                SItemPojo clonedItem = item.clone();

                clonedItem.setTable(clone);
                item.setTable(clone);

                clonedItems.add(clonedItem);
            }
            clone.setItems(clonedItems);
            
            return clone;
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}