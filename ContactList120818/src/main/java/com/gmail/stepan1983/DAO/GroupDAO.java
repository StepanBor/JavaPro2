package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.Contact;
import com.gmail.stepan1983.model.GroupContact;

import java.util.List;

public interface GroupDAO {

    List<GroupContact> getGroups();
    GroupContact getGroupById(long id);

    void addGroup(GroupContact group);
    void deleteGroup(long[] groupId);

}
