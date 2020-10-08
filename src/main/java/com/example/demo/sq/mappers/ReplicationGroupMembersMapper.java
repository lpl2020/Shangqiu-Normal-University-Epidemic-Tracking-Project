package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ReplicationGroupMembers;

public interface ReplicationGroupMembersMapper {
    int insert(ReplicationGroupMembers record);

    int insertSelective(ReplicationGroupMembers record);
}