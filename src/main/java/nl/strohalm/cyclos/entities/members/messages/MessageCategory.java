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
package nl.strohalm.cyclos.entities.members.messages;

import nl.strohalm.cyclos.entities.Entity;
import nl.strohalm.cyclos.entities.Relationship;
import nl.strohalm.cyclos.entities.groups.SystemGroup;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Collection;

/**
 * Category for messages
 * @author jeancarlo
 */
@Cacheable
@Table(name = "message_categories")
@javax.persistence.Entity
public class MessageCategory extends Entity implements Comparable<MessageCategory> {

    public static enum Relationships implements Relationship {
        GROUPS("groups");
        private final String name;

        private Relationships(final String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    private static final long                 serialVersionUID = 6167371125895203030L;

    @Column(name = "name", nullable = false, length = 200)
    private String                            name;

    @ManyToMany(mappedBy = "messageCategories")
	private Collection<SystemGroup> groups;

	@Override
    public int compareTo(final MessageCategory another) {
        return getName().compareTo(another.getName());
    }

    public Collection< SystemGroup> getGroups() {
        return groups;
    }

    public String getName() {
        return name;
    }

    public void setGroups(final Collection< SystemGroup> groups) {
        this.groups = groups;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getId() + " - category of " + name;
    }

}
