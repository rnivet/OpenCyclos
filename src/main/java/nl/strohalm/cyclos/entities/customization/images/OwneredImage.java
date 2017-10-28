/*
    This file is part of Cyclos (www.cyclos.org).
    A project of the Social Trade Organisation (www.socialtrade.org).

    Cyclos is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cyclos is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cyclos; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 */
package nl.strohalm.cyclos.entities.customization.images;

import nl.strohalm.cyclos.entities.Entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * An image that has an owner and other details
 * @author luis
 */
@MappedSuperclass
public abstract class OwneredImage extends Image {

    private static final long serialVersionUID = 9164371040444804577L;

    @Column(name = "order_number", columnDefinition = "smallint")
    private Integer order;

    @Column(name = "caption")
    private String  caption;

    public String getCaption() {
        return caption;
    }

    public Integer getOrder() {
        return order;
    }

    public abstract Entity getOwner();

    public void setCaption(final String caption) {
        this.caption = caption;
    }

    public void setOrder(final Integer order) {
        this.order = order;
    }

    public abstract void setOwner(Entity owner);

}
