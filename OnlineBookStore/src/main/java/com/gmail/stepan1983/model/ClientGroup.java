package com.gmail.stepan1983.model;

import javax.persistence.*;

@Entity
@Table(name = "GroupClient1")
public class ClientGroup {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String groupName;

    private String groupDescription;

    public ClientGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public ClientGroup() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }
}
